package edu.tamu.scholars.middleware.discovery.serializer;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;

import edu.tamu.scholars.middleware.discovery.model.Concept;

@JsonComponent
public class ConceptSerializer extends AbstractSolrDocumentSerializer<Concept> {

    private static final long serialVersionUID = 2956446943109798523L;

    private final JsonSerializer<Concept> delegate = new UnwrappingConceptSerializer(NameTransformer.NOP);

    public ConceptSerializer() {
        super(Concept.class);
    }

    @Override
    protected JsonSerializer<Concept> getDelegate() {
        return delegate;
    }

    @Override
    public JsonSerializer<Concept> unwrappingSerializer(final NameTransformer nameTransformer) {
        return new UnwrappingConceptSerializer(nameTransformer);
    }

}
