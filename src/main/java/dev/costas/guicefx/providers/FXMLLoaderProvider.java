package dev.costas.guicefx.providers;

import com.google.inject.Injector;
import javafx.fxml.FXMLLoader;

import javax.inject.Inject;
import javax.inject.Provider;

public class FXMLLoaderProvider implements Provider<FXMLLoader> {
	@Inject
	Injector injector;

	@Override
	public FXMLLoader get() {
		FXMLLoader loader = new FXMLLoader();
		loader.setControllerFactory(injector::getInstance);
		return loader;
	}
}
