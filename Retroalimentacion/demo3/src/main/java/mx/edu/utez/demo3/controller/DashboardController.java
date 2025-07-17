package mx.edu.utez.demo3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DashboardController {

    @FXML
    private void onAlumnos(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/mx/edu/utez/demo3/view/alumno_list.fxml")
        );
        try {
            Scene scene= new Scene(loader.load());
            System.out.println("si cala w");
            Stage stage= (Stage)  ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            System.out.println("si cala w");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
