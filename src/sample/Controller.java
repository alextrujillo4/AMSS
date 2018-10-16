package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private JFXButton login_btn;

    @FXML
    private JFXPasswordField pass_tf;

    @FXML
    private JFXTextField user_tf;

    @FXML
    void loginAction(ActionEvent event) {
        String user = user_tf.getText();
        String pass = pass_tf.getText();
        System.out.print("Button pushed!");

        if (user.equals("alextrujillo4") && pass.equals("1234")){
            System.out.print("Bienvenido!");
        }else{

            System.out.print("Usuario Incorrecto");
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
