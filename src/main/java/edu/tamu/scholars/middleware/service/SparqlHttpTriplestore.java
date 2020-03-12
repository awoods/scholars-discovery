package edu.tamu.scholars.middleware.service;

import edu.tamu.scholars.middleware.config.model.TriplestoreConfig;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.rdfconnection.RDFConnection;
import org.apache.jena.rdfconnection.RDFConnectionFuseki;
import org.apache.jena.rdfconnection.RDFConnectionRemote;
import org.apache.jena.rdfconnection.RDFConnectionRemoteBuilder;
import org.apache.jena.sdb.SDB;
import org.apache.jena.sdb.SDBFactory;
import org.apache.jena.sdb.Store;
import org.apache.jena.sdb.StoreDesc;
import org.apache.jena.sdb.sql.SDBConnection;
import org.apache.jena.sdb.store.DatabaseType;
import org.apache.jena.sdb.store.LayoutType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.Instant;

public class SparqlHttpTriplestore implements Triplestore {

    private final static Logger logger = LoggerFactory.getLogger(SparqlHttpTriplestore.class);

    private final TriplestoreConfig config;

    public SparqlHttpTriplestore(TriplestoreConfig config) {
        this.config = config;
    }

    @Override
    public QueryExecution createQueryExecution(String query) {
        return QueryExecutionFactory.sparqlService(config.getDatasourceUrl(), query);
    }

    @Override
    public void init() {
        Instant start = Instant.now();
        logger.info(String.format("Initializing %s", config.getType().getSimpleName()));
        logger.info(String.format("%s ready. %s seconds", config.getType().getSimpleName(), Duration.between(start, Instant.now()).toMillis() / 1000.0));
    }

    @Override
    public void destroy() {
        // no-op
    }

}
