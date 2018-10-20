package sample.Dialogs;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import sample.Objects.Clase;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
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
    void AgregarImagenOnAction(ActionEvent event) {

    }

    @FXML
    void AgregarTemaOnAction(ActionEvent event) {
        if (!agregarTema_ET.getText().equals("")){
            temasList_LV.getItems().add(agregarTema_ET.getText());
            agregarTema_ET.setText("");
        }

    }



    @FXML
    void AgregarClaseOnAction(ActionEvent event) {
        if (isAValidClassForm()){
            ObservableList<String> topics;
            topics = temasList_LV.getSelectionModel().getSelectedItems();
            ArrayList<String> myarraylist = new ArrayList<String>(topics);
            if (agregarImagen_BTN.getText().equals("Agregar Imagen")) {
                Clase clase = new Clase(nombreClase_ET.getText(),myarraylist);
            }else{
                //Image image = new Image();
                Clase clase = new Clase(nombreClase_ET.getText(),myarraylist);
            }

        }
    }


    public boolean isAValidClassForm(){
        if (nombreClase_ET.getText().equals("")) {
            return false;
        }

        if (temasList_LV.getItems().size() == 0){
            return false;
        }

        return true;
    }

    public void validateFields(){
        RequiredFieldValidator validator = new RequiredFieldValidator();
        nombreClase_ET.getValidators().add(validator);
        validator.setMessage("Debes agregar un nombre a tu clase");
        nombreClase_ET.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (!newValue){
                    nombreClase_ET.validate();
                }
            }
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        validateFields();
    }
}
