package com.cowantech.storageaccess;

import com.cowantech.storageaccess.config.AsyncSyncConfiguration;
import com.cowantech.storageaccess.config.EmbeddedElasticsearch;
import com.cowantech.storageaccess.config.EmbeddedKafka;
import com.cowantech.storageaccess.config.EmbeddedSQL;
import com.cowantech.storageaccess.config.JacksonConfiguration;
import com.cowantech.storageaccess.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { JhipsterStorageAccessApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
