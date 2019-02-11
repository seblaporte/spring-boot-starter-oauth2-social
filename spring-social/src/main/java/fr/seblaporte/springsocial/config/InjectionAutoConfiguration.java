package fr.seblaporte.springsocial.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("fr.seblaporte.springsocial")
@EntityScan("fr.seblaporte.springsocial.model")
@EnableJpaRepositories("fr.seblaporte.springsocial.repository")
public class InjectionAutoConfiguration {
}
