package edu.tamu.scholars.middleware.discovery.model.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import edu.tamu.scholars.middleware.discovery.model.Person;
import edu.tamu.scholars.middleware.discovery.model.doa.PersonService;
import edu.tamu.scholars.middleware.discovery.model.repo.PersonRepo;

public class PersonServiceTest extends AbstractSolrDocumentServiceTest<edu.tamu.scholars.middleware.discovery.model.generated.person.Person, Person, PersonRepo, PersonService> {

    @Value("classpath:mock/discovery/person")
    private Resource mocksDirectory;

    @Override
    protected Resource getMocksDirectory() {
        return mocksDirectory;
    }

    @Override
    protected Class<?> getType() {
        return Person.class;
    }

}
