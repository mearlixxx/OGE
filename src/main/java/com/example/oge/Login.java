package com.example.oge;

import Animation.Shake;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Login {

    @FXML
    public Hyperlink linkToRegistration;
    @FXML
    public Button logInBtn;
    @FXML
    TextField logInTF;
    @FXML
    PasswordField passwField;



    public void setLinkToRegistration () throws IOException {
        Stage Registration  = (Stage) linkToRegistration.getScene() .getWindow();
        Registration.setResizable(false);
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("registration.fxml")));
        Registration.setScene(new Scene(parent, 600, 400));
    }

    public void setLogInBtn () throws SQLException, IOException {
        String loginText = logInTF.getText().trim();
        String loginPassword = passwField.getText().trim();

        if (!loginText.equals("") && !loginPassword.equals("")) {
            loginUser(loginText, loginPassword);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "INVALID INPUT");
            alert.show();
        }
    }
    private void loginUser(String loginText, String loginPassword) throws SQLException, IOException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        User user = new User();
        user.setUsername(loginText);
        user.setPassword(loginPassword);
        dbHandler.getUser(user);
        ResultSet resultSet = dbHandler.getUser(user);
        int counter = 0;
        try {
            while (resultSet.next()) {
                counter++;
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        if (counter >=1){
            loadSuccess();
        }
        else {
            Shake loginAnimation = new Shake(logInTF);
            Shake passwordAnimation = new Shake(passwField);
            loginAnimation.Play();
            passwordAnimation.Play();
            logInTF.setText(null);
            passwField.setText(null);
        }
    }

    private void loadSuccess() throws IOException {

        Stage Success  = (Stage) logInBtn.getScene() .getWindow();
        Success.setResizable(false);
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
        Success.setScene(new Scene(parent, 600, 400));
    }
}
