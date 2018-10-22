package sample.Validation;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import eu.hansolo.enzo.notification.Notification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import sample.Connections.ConnectionManager;
import sample.Connections.UserDBController;
import sample.Objects.Usuario;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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

        int validate = userValid(user, pass);
        if (validate == 1){
            // Show the custom notification
            Notification.Notifier.INSTANCE.notifySuccess("Logged in","Bienvenido " + user + " !");
        } else if (validate == 0){

            Notification.Notifier.INSTANCE.notifyError("Error","Contraseña incorrecta");
        } else {
            UserDBController.create(user, pass);
            Notification.Notifier.INSTANCE.notifyError("Error","Usuario no existente, se ha creado uno nuevo");
        }
    }

    @FXML
    ArrayList<Usuario> getUsersFromDB() {
        ResultSet rs = UserDBController.get();

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            while(rs.next()) {
                usuarios.add(new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            rs = null;
        }

        return usuarios;
    }

    @FXML
    int userValid(String username, String password) {
        int found = -1;

        ArrayList<Usuario> usuarios = getUsersFromDB();
        for (Usuario u: usuarios) {
            if (username.equals(u.getUsrName())) {
                if (password.equals(u.getUsrPassword())) {
                    found = 1; // Found and correct password
                    break;
                } else {
                    found = 0; // Found, but incorrect password
                    break;
                }
            }
        }

        return found;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
