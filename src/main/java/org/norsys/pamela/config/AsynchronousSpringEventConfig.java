package org.norsys.pamela.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;


/**
 * cette classe sert de configuration pour que les evenements
 * soient asynchrone
 * @author panou
 *
 */
@Configuration
public class AsynchronousSpringEventConfig {
	
	@Bean(name = "ApplicationEventMulticaster")
	public ApplicationEventMulticaster simpleAplicationEventMulticaster() {
		SimpleApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
		eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
		return eventMulticaster;
	}
}
