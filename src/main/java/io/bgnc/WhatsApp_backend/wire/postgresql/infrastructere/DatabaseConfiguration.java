package io.bgnc.WhatsApp_backend.wire.postgresql.infrastructere;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"io.bgnc.WhatsApp_backend"})
@EnableJpaAuditing
public class DatabaseConfiguration {


}
