package dev.costas.guicefx.controllers;

import com.google.inject.AbstractModule;
import dev.costas.guicefx.providers.FXMLLoaderProvider;
import javafx.fxml.FXMLLoader;

public class ControllerModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(FXMLLoader.class).toProvider(FXMLLoaderProvider.class);
	}
}
