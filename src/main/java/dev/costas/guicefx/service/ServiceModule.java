package dev.costas.guicefx.service;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ServiceModule extends AbstractModule {
	@Provides
	public GreetingService provideGreetService() {
		return new GreetingService();
	}
}
