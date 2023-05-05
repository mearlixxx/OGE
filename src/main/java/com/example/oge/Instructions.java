package com.example.oge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;



public class Instructions {
    @FXML
    Button backBtn1;
    @FXML
    public void back(ActionEvent event) throws IOException {
        Stage Success  = (Stage) backBtn1.getScene() .getWindow();
        Success.setResizable(false);
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
        Success.setScene(new Scene(parent, 600, 400));
    }
}
