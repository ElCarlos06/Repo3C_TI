package mx.edu.utez.demo3.controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import mx.edu.utez.demo3.dao.impl.AlumnoImplDao;
import mx.edu.utez.demo3.dao.impl.CarreraDaoImpl;
import mx.edu.utez.demo3.model.Alumno;
import mx.edu.utez.demo3.model.Carrera;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

public class AlumnoFormController {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtCorreo;
    @FXML
    private DatePicker dpFechaNacimiento;
    @FXML
    private Button btnCrear;
    @FXML
    private Button btnCancelar;
    @FXML
    private ComboBox<Carrera> cbCarrera;


    AlumnoImplDao daoAlumno = new AlumnoImplDao();
    CarreraDaoImpl daoCarrera = new CarreraDaoImpl();


    @FXML
    public void initialize() {
        try{
            List<Carrera> carreras = daoCarrera.findAll();
            cbCarrera.setItems(FXCollections.observableList(carreras));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @FXML
    private  void  onSubmit(){
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String correo = txtCorreo.getText().trim();
        LocalDate fechaNacimiento = dpFechaNacimiento.getValue();
        Carrera carrera = cbCarrera.getSelectionModel().getSelectedItem();
        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || fechaNacimiento == null || carrera == null) {
            showAlert("Error", "Todos los campos son requeridos");
            System.out.println("TODOS LOS CAMPOS SON OBLIGATORIOS");
            return;
        }
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setApellidos(apellido);
        alumno.setCorreo(correo);
        alumno.setFechaNacimiento(fechaNacimiento);
        alumno.setIdCarrera(carrera.getId());
        try{
            daoAlumno.create(alumno);
            showAlert("Exito", "Alumno creado con exito");
            closeWindow();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public  void closeWindow(){
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void onCancel(){
        closeWindow();
    }

    public void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

