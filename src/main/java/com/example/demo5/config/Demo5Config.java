package com.example.demo5.config;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration;
import org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo5.ApplicationPackage;
import com.example.demo5.entity.EntityPackage;
import com.example.demo5.repository.JpaRepositoryPackage;

@Configuration
@EntityScan(basePackageClasses = EntityPackage.class)
@EnableJpaRepositories(basePackageClasses = JpaRepositoryPackage.class)
@ComponentScan(basePackageClasses = ApplicationPackage.class)
@ImportAutoConfiguration({
		AopAutoConfiguration.class,
		DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class,
		DispatcherServletAutoConfiguration.class,
		EmbeddedWebServerFactoryCustomizerAutoConfiguration.class,
		ErrorMvcAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class,
		HttpEncodingAutoConfiguration.class,
		HttpMessageConvertersAutoConfiguration.class,
		JacksonAutoConfiguration.class,
		JdbcTemplateAutoConfiguration.class,
		JmxAutoConfiguration.class,
		JpaRepositoriesAutoConfiguration.class,
		JtaAutoConfiguration.class,
		MultipartAutoConfiguration.class,
		OAuth2ResourceServerAutoConfiguration.class,
		PersistenceExceptionTranslationAutoConfiguration.class,
		RestTemplateAutoConfiguration.class,
		ServletWebServerFactoryAutoConfiguration.class,
		SpringApplicationAdminJmxAutoConfiguration.class,
		SpringDataWebAutoConfiguration.class,
		TaskExecutionAutoConfiguration.class,
		TaskSchedulingAutoConfiguration.class,
		TransactionAutoConfiguration.class,
		ValidationAutoConfiguration.class,
		WebMvcAutoConfiguration.class,
		WebSocketServletAutoConfiguration.class,
})
public class Demo5Config {

}
