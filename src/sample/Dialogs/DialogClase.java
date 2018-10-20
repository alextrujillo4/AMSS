package sample.Dialogs;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import sample.Objects.Clase;

import java.net.URL;
import java.util.ResourceBundle;

public class DialogClase implements Initializable  {

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
    private JFXListView<String> temasList_LV;

    @FXML
    private JFXButton agregarClase_BTN;

    @FXML
    void AgregarClaseOnAction(ActionEvent event) {

        if (isAValidClassForm()){
            //Clase clase = new Clase(nombreClase_ET.getText(),);
            //


        }

    }


    public boolean isAValidClassForm(){
        if (!nombreClase_ET.getText().equals(""))
            if (temasList_LV.getItems().size() != 0)
                return true;

        return false;
    }
    @FXML
    void AgregarImagenOnAction(ActionEvent event) {

    }

    @FXML
    void AgregarTemaOnAction(ActionEvent event) {
        temasList_LV.getItems().add("Hello 1");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        agregarClase_BTN.setOnAction(this::AgregarClaseOnAction);

    }
}
