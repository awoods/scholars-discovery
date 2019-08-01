package edu.tamu.scholars.middleware.graphql.service;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.query.result.Cursor;
import org.springframework.data.solr.core.query.result.FacetPage;
import org.springframework.data.solr.core.query.result.SolrResultPage;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.tamu.scholars.middleware.discovery.argument.Facet;
import edu.tamu.scholars.middleware.discovery.argument.Filter;
import edu.tamu.scholars.middleware.discovery.argument.Index;
import edu.tamu.scholars.middleware.discovery.model.AbstractSolrDocument;
import edu.tamu.scholars.middleware.discovery.model.repo.SolrDocumentRepo;
import edu.tamu.scholars.middleware.graphql.model.AbstractNestedDocument;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@GraphQLApi
public abstract class AbstractNestedDocumentService<ND extends AbstractNestedDocument, D extends AbstractSolrDocument, R extends SolrDocumentRepo<D>> implements SolrDocumentRepo<ND> {

    @Autowired
    private R repo;

    @Autowired
    private ObjectMapper mapper;

    @Override
    public <NS extends ND> NS save(NS nestedDocument, Duration commitWithin) {
        throw new UnsupportedOperationException(String.format("%s is read only", getNestedDocumentType()));
    }

    @Override
    public <NS extends ND> Iterable<NS> saveAll(Iterable<NS> nestedDocuments, Duration commitWithin) {
        throw new UnsupportedOperationException(String.format("%s is read only", getNestedDocumentType()));
    }

    @Override
    public long count() {
        return repo.count();
    }

    @Override
    public Iterable<ND> findAll(Sort sort) {
        return StreamSupport.stream(repo.findAll(sort).spliterator(), false).map(this::toNested).collect(Collectors.toList());
    }

    @Override
    public Page<ND> findAll(Pageable pageable) {
        return repo.findAll(pageable).map(this::toNested);
    }

    @Override
    public <NS extends ND> Iterable<NS> saveAll(Iterable<NS> nestedDocuments) {
        throw new UnsupportedOperationException(String.format("%s is read only", getNestedDocumentType()));
    }

    @Override
    public Optional<ND> findById(String id) {
        Optional<ND> nestedDocument = Optional.empty();
        Optional<D> document = repo.findById(id);
        if (document.isPresent()) {
            nestedDocument = Optional.of(toNested(document.get()));
        }
        return nestedDocument;
    }

    // TODO: remove when able to use Optional with generic type for @GraphQLQuery
    public ND getById(String id) {
        return findById(id).get();
    }

    @Override
    public boolean existsById(String id) {
        return repo.existsById(id);
    }

    @Override
    public Iterable<ND> findAll() {
        return StreamSupport.stream(repo.findAll().spliterator(), false).map(this::toNested).collect(Collectors.toList());
    }

    @Override
    public Iterable<ND> findAllById(Iterable<String> ids) {
        return StreamSupport.stream(repo.findAllById(ids).spliterator(), false).map(this::toNested).collect(Collectors.toList());
    }

    @Override
    public void deleteById(String id) {
        throw new UnsupportedOperationException(String.format("%s is read only", getNestedDocumentType()));
    }

    @Override
    public void deleteAll(Iterable<? extends ND> nestedDocuments) {
        throw new UnsupportedOperationException(String.format("%s is read only", getNestedDocumentType()));
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException(String.format("%s is read only", getNestedDocumentType()));
    }

    public abstract FacetPage<ND> search(String query, Pageable page);

    public abstract FacetPage<ND> search(String query, Optional<Index> index, Pageable page);

    public abstract FacetPage<ND> search(String query, List<Filter> filters, Pageable page);

    public abstract FacetPage<ND> search(String query, List<Facet> facets, List<Filter> filters, Pageable page);

    @Override
    public FacetPage<ND> search(String query, Optional<Index> index, List<Facet> facets, List<Filter> filters, Pageable page) {
        FacetPage<D> facetPage = repo.search(query, index, facets, filters, page);
        List<ND> content = facetPage.getContent().stream().map(this::toNested).collect(Collectors.toList());
        FacetPage<ND> nestedFacetPage = new SolrResultPage<ND>(content);
        BeanUtils.copyProperties(facetPage, nestedFacetPage, "content");
        return nestedFacetPage;
    }

    @Override
    public long count(String query, List<Filter> filters) {
        return repo.count(query, filters);
    }

    @Override
    public <NS extends ND> NS save(NS nestedDocument) {
        throw new UnsupportedOperationException(String.format("%s is read only", getNestedDocumentType()));
    }

    @Override
    public void delete(ND nestedDocument) {
        throw new UnsupportedOperationException(String.format("%s is read only", getNestedDocumentType()));
    }

    @Override
    public List<ND> findByType(String type) {
        return repo.findByType(type).stream().map(this::toNested).collect(Collectors.toList());
    }

    @Override
    public List<ND> findByIdIn(List<String> ids) {
        return repo.findByIdIn(ids).stream().map(this::toNested).collect(Collectors.toList());
    }

    @Override
    public List<ND> findBySyncIdsIn(List<String> syncIds) {
        return repo.findBySyncIdsIn(syncIds).stream().map(this::toNested).collect(Collectors.toList());
    }

    @Override
    public List<ND> findMostRecentlyUpdate(Integer limit) {
        return repo.findMostRecentlyUpdate(limit).stream().map(this::toNested).collect(Collectors.toList());
    }

    @Override
    public Cursor<ND> stream(String query, Optional<Index> index, List<Filter> filters, Sort sort) {
        throw new UnsupportedOperationException("Unable to map stream");
    }

    protected abstract Class<?> getNestedDocumentType();

    @SuppressWarnings("unchecked")
    private ND toNested(D document) {
        try {
            String json = mapper.writeValueAsString(document);
            return (ND) mapper.readValue(json, getNestedDocumentType());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Something went wrong");
        }
    }

}
