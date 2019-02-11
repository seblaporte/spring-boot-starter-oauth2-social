package fr.seblaporte.springsocial;

import fr.seblaporte.springsocial.config.InjectionAutoConfiguration;
import fr.seblaporte.springsocial.config.PropertiesConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@PropertySource("classpath:application-oauth2-social-login.yml")
@EnableConfigurationProperties(PropertiesConfig.class)
@Import({InjectionAutoConfiguration.class})
@EnableWebSecurity
@Configuration
public @interface EnableOauth2SocialLogin {
}
