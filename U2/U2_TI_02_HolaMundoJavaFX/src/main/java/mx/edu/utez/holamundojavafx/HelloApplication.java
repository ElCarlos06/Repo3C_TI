package mx.edu.utez.holamundojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ///FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label myLabel = new Label("Hello 3C");
        StackPane root =new StackPane(myLabel);
        Scene scene = new Scene(root, 200, 240);
        stage.setTitle("Hello!");
        Image image = new Image(getClass().getResourceAsStream("/icons/goku.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}