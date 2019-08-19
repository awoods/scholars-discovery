package edu.tamu.scholars.middleware.graphql.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import edu.tamu.scholars.middleware.discovery.model.repo.PersonRepo;
import edu.tamu.scholars.middleware.graphql.model.Person;

public class PersonServiceTest extends AbstractNestedDocumentServiceTest<Person, edu.tamu.scholars.middleware.discovery.model.Person, PersonRepo, PersonService> {

    @Value("classpath:mock/discovery/person")
    private Resource mocksDirectory;

    @Override
    protected Resource getMocksDirectory() {
        return mocksDirectory;
    }

    @Override
    protected Class<?> getType() {
        return edu.tamu.scholars.middleware.discovery.model.Person.class;
    }

    @Override
    protected Class<?> getNestedDocumentType() {
        return Person.class;
    }

}