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

public class Formulas {
    @FXML
    Button backBtn1, backBtn2, backBtn3, backBtn4, backBtn5, backBtn6, backBtn7, backBtn8, backBtn9, backBtn10, backBtn11, backBtn12, backBtn13, backBtn14, backBtn15, backBtn16, backBtn17;

    @FXML
    public void back() throws IOException {
        Stage Success  = (Stage) backBtn1.getScene() .getWindow();
        Success.setResizable(false);
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
        Success.setScene(new Scene(parent, 600, 400));
    }
}
