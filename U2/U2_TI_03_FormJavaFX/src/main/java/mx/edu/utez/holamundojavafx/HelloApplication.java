package mx.edu.utez.holamundojavafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        
        
        Label lblNombre = new Label("Nombre");
        TextField tfNombre = new TextField();
        Label lblEdad = new Label("Edad");
        TextField tfEdad = new TextField();
        Label lblOpciones = new Label("Opciones");
        ObservableList<String> opciones = FXCollections.observableArrayList("Estudiante", "Profesor", "Admin");
        ComboBox<String> cmbOpciones = new ComboBox<>(opciones);
        Button btnCrear = new Button("Crear");
        Label lblResultado = new Label(); 
        GridPane form = new GridPane();

        btnCrear.setOnAction(e -> {
            String nombre =tfNombre.getText();
            String edad =tfEdad.getText();
            String seleccion = cmbOpciones.getSelectionModel().getSelectedItem();
            if (nombre.isEmpty() || edad.isEmpty() || seleccion == null){
                form.setStyle("-fx-background-color: red; -fx-text-fill: white");
                lblResultado.setStyle("-fx-text-fill: white");
                lblResultado.setText("Valores deben ser obligarotrios");
            }else {
                form.setStyle("-fx-background-color: rgb(45,237,120)");
                lblResultado.setStyle("-fx-text-fill: rgb(8, 105, 45)");
                lblResultado.setText("Nombre: "+nombre +"\nEdad: "+edad + "\nOpciones: "+seleccion);
            }
        });

        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);

        cmbOpciones.setStyle("-fx-border-color: black");


        form.add(lblNombre, 0, 0);
        form.add(tfNombre, 1, 0);
        form.add(lblEdad, 0, 1);
        form.add(tfEdad, 1, 1);
        form.add(lblOpciones, 0, 2);
        form.add(cmbOpciones, 1, 2);
        form.add(btnCrear, 0, 3);
        form.add(lblResultado, 0, 4);

        Scene scene = new Scene(form, 350, 200);

        stage.setTitle("OLA");
        Image image = new Image(getClass().getResourceAsStream("/icons/goku.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}