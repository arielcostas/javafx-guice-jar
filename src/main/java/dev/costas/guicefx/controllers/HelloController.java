package dev.costas.guicefx.controllers;

import dev.costas.guicefx.service.GreetingService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.inject.Inject;

public class HelloController {
	@FXML
	public TextField nameField;
	@FXML
	private Label greetingText;

	@Inject
	GreetingService greetingService;

	@FXML
	protected void onGreetButtonClick() {
		String g = greetingService.greet(nameField.getText());
		greetingText.setText(g);
	}
}