package sample.Dialogs;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class DialogClase implements Initializable {

    @FXML
    private Text tituloDialogClase_TXT;

    @FXML
    private JFXTextField nombreClase_ET;

    @FXML
    private JFXButton agregarImagen_BTN;

    @FXML
    private JFXTextField agregarTema_ET;

    @FXML
    private JFXButton agregatTema_BTN;

    @FXML
    private ListView<String> temasList_STR;

    @FXML
    private JFXButton agregarClase_BTN;

    @FXML
    void AgregarClaseOnAction(ActionEvent event) {

    }

    @FXML
    void AgregarImagenOnAction(ActionEvent event) {

    }

    @FXML
    void AgregarTemaOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
