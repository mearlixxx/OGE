package com.example.oge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class Registration {
    public static String emailTo;
    @FXML
    Button regBtn;

    @FXML
    TextField emailTF, surnameTF, nameTF, usernameTF;

    @FXML
    PasswordField passwordPF;

    @FXML
    public void signUpClick (ActionEvent event) throws SQLException, ClassNotFoundException, IOException {
        Stage Login  = (Stage) regBtn.getScene() .getWindow();
        Login.setResizable(false);
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        Login.setScene(new Scene(parent, 600, 400));
        signUpUser();
    }

    public void signUpUser() throws SQLException, ClassNotFoundException {
        DatabaseHandler handler = new DatabaseHandler();

        String name = nameTF.getText();
        String surname = surnameTF.getText();
        String username = usernameTF.getText();
        String password = passwordPF.getText();
        String email = emailTF.getText();


        User user = new User(name, surname, username, password, email);
        emailTo = email;
        handler.signUpUser(user);
    }
}