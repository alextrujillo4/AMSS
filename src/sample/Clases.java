package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Clases implements Initializable {


    @FXML
    private JFXButton generar_examen_btn;

    @FXML
    private Tab clasestab_tab;

    @FXML
    private JFXListView<?> clasesList_listview;

    @FXML
    private JFXButton add_class_btn;

    @FXML
    private Tab reactivostab_tab;

    @FXML
    private JFXListView<?> reactivosList_listview;

    @FXML
    private JFXButton add_reactivo_btn;

    @FXML
    void agregarClase(ActionEvent event) {

    }

    @FXML
    void agregarReactivo(ActionEvent event) {

    }

    @FXML
    void generarExamen(ActionEvent event) {

    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        add_reactivo_btn.setAlignment(Pos.CENTER_RIGHT);
        add_class_btn.setAlignment(Pos.CENTER_RIGHT);
    }
}
