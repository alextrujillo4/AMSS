package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTabPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainScene implements Initializable {


    @FXML
    private AnchorPane myApp_pane;

    @FXML
    private JFXButton generar_examen_btn;

    @FXML
    private JFXTabPane tabpane_tabs;

    @FXML
    private Tab clasestab_tab;

    @FXML
    private JFXListView<Label> clasesList_listview;

    @FXML
    private JFXButton add_class_btn;

    @FXML
    private Tab reactivostab_tab;

    @FXML
    private JFXListView<Label> reactivosList_listview;

    @FXML
    private JFXButton add_reactivo_btn;

    @FXML
    void agregarClase(ActionEvent event) {

        FXMLLoader fxmlLoader = new
                FXMLLoader(getClass().getResource("Dialogs/DialogClase.fxml"));
        Parent root1 = null;
        try {
            root1 = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("");
        stage.setScene(new Scene(root1, 300, 400));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void agregarReactivo(ActionEvent event) {

    }

    @FXML
    void generarExamen(ActionEvent event) {

    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        for (int i = 0; i<4; i++){


            Label lbl = new Label ("Item " + i);
            //lbl.setGraphic(new ImageView(new Image(new FileInputStream("/Users/alextrujillo/Desktop/h.png"))));
            clasesList_listview.getItems().add(lbl);

        }
    }
}
