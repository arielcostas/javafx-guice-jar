package dev.costas.guicefx.service;

import java.util.List;

/**
 * Provides greetings with different words and languages.
 */
public class GreetingService {
	public static final List<String> greetings = List.of(
			"Hello ",
			"Hola ",
			"Olá ",
			"Ciao ",
			"Hej ",
			"Hallo ",
			"Bonjour ",
			"Konnichiwa ",
			"Namaste ",
			"Ni hao "
	);

	/**
	 * Provides a random greeting.
	 *
	 * @param name The name to greet.
	 * @return a greeting
	 */
	public String greet(String name) {
		return greetings.get((int) (Math.random() * greetings.size())) + name;
	}
}
