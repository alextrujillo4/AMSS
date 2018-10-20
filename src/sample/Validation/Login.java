package sample.Validation;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import eu.hansolo.enzo.notification.Notification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {
    @FXML
    private AnchorPane myApp_pane;

    @FXML
    private JFXButton login_btn;

    @FXML
    private JFXPasswordField pass_tf;

    @FXML
    private JFXTextField user_tf;

    @FXML
    void loginAction(ActionEvent event) {


        /*RequiredFieldValidator validator = new RequiredFieldValidator();
        user_tf.getValidators().add(validator);
        validator.setMessage("Por favor, introduce un usuario.");*/
        String user = user_tf.getText();
        String pass = pass_tf.getText();
        System.out.print("Button pushed!");

        if (user.equals("alextrujillo4") && pass.equals("1234")){
            // Show the custom notification
            Notification.Notifier.INSTANCE.notifySuccess("Logged in","Bienvenido " + user + " !");
        }else{

            Notification.Notifier.INSTANCE.notifyError("Error","Usuario Incorrecto");
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
