package com.javaprojects.event.configuration;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.javaprojects.event.model.Event;

@Component
public class CustomizedRestMvcConfiguration implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Event.class);
		config.useHalAsDefaultJsonMediaType(false);
		config.setDefaultMediaType(MediaType.APPLICATION_JSON);
	}
}
