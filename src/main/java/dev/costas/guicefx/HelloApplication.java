package dev.costas.guicefx;

import com.google.inject.Guice;
import com.google.inject.Injector;
import dev.costas.guicefx.controllers.ControllerModule;
import dev.costas.guicefx.service.ServiceModule;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class HelloApplication extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		Injector injector = Guice.createInjector(
				new ControllerModule(),
				new ServiceModule()
		);
		FXMLLoader loader = injector.getInstance(FXMLLoader.class);

		try (InputStream helloViewFxml = this.getClass().getResourceAsStream("hello-view.fxml")) {
			Scene scene = new Scene(loader.load(helloViewFxml), 320, 240);
			stage.setTitle("Hello!");
			stage.setScene(scene);
			stage.show();
		}
	}

	public static void main(String[] args) {
		launch();
	}
}