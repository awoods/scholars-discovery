package edu.tamu.scholars.middleware.discovery.assembler;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import edu.tamu.scholars.middleware.discovery.controller.IndividualController;
import edu.tamu.scholars.middleware.discovery.model.Individual;
import edu.tamu.scholars.middleware.discovery.resource.IndividualResource;

@Component
public class IndividualResourceAssembler extends ResourceAssemblerSupport<Individual, IndividualResource> {

    @Autowired
    private RepositoryEntityLinks repositoryEntityLinks;

    public IndividualResourceAssembler() {
        super(IndividualController.class, IndividualResource.class);
    }

    @Override
    public IndividualResource toResource(Individual document) {
        Link selfLink = repositoryEntityLinks.linkToSingleResource(document.getClass(), document.getId()).withSelfRel();
        Link documentLink = repositoryEntityLinks.linkToCollectionResource(document.getClass());
        return new IndividualResource(document, Arrays.asList(selfLink, documentLink));
    }

}
