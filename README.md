# JavaFX template with Guice and cross-platform JAR packaging

This is a template for a JavaFX application using Guice for dependency injection and Maven for building. It also
includes a cross-platform JAR packaging configuration for Maven. This allows you to build a single JAR file that
can be run on any platform that has Java installed, without dealing with JavaFX module dependencies or jlink
packaging.

## Initial setup

1. Click the "Use this template" button to create a new repository from this template.
2. Clone the new repository (under your user/organization) to your computer.
3. Edit the `pom.xml` file to change the `groupId`, `artifactId`, and `version` to match your project.
4. Move the source code to the appropriate package under `src/main/java`. Don't forget to also move the resources
   under `src/main/resources`.
5. Edit the pom.xml file to change the properties' `mainClass` to match the main class of your application (under the
   new groupId).
6. Edit the `README.md` file to describe your project. Please consider linking back to this repository so that
   others can find it.

## Developing an application

The `Launcher` class is the entry point for your application. It is responsible for launching the JavaFX application.
The `HelloApplication` class is the main JavaFX application class. It is responsible for creating the Guice injector
and injecting the `MainController` into the initial `Scene`.

This application by default uses an FXML template for the UI. The `MainController` class is responsible for handling
events from the UI. This view includes an input field and a button. When the button is clicked, a greeting is shown
in a label below the button, using a random language from the list of languages in the `GreetingService`.

To run the application, run `mvn javafx:run` from the command line, or add a run configuration in your IDE.

## Packaging the application

To package the application, run `mvn package` from the command line. This will create two JAR files in the `target`
directory: one with the artifactID and version number, and one with the artifact ID and version number and the
`-shaded` suffix. The `-shaded` JAR file is a cross-platform JAR file that can be run on any platform that has Java
installed. It includes all the JavaFX dependencies for Windows, macOS and Linux, as well as the application code and
other Maven dependencies.

To run the application, run `java -jar target/<artifactId>-<version>-shaded.jar` from the command line, or double-click
it from the file explorer.
