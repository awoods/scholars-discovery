package edu.tamu.scholars.middleware.discovery.model.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import edu.tamu.scholars.middleware.discovery.model.Concept;
import edu.tamu.scholars.middleware.discovery.model.doa.ConceptService;
import edu.tamu.scholars.middleware.discovery.model.repo.ConceptRepo;

public class ConceptServiceTest extends AbstractSolrDocumentServiceTest<edu.tamu.scholars.middleware.discovery.model.generated.concept.Concept, Concept, ConceptRepo, ConceptService> {

    @Value("classpath:mock/discovery/concept")
    private Resource mocksDirectory;

    @Override
    protected Resource getMocksDirectory() {
        return mocksDirectory;
    }

    @Override
    protected Class<?> getType() {
        return Concept.class;
    }

}
