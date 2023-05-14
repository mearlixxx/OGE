package com.example.oge;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ChooseTask extends VariantMaker implements Initializable {

    @FXML
    Button zad_1_5_btn, zad_6_10_btn, zad_11_btn, zad_12_14_btn, zad_15_18_btn, zad_19_btn, zad_20_21_btn, zad_23_25_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        zad_1_5_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";
        });

        zad_6_10_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";
        });

        zad_11_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";
        });

        zad_12_14_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";
        });

        zad_15_18_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";
        });

        zad_19_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";
        });

        zad_20_21_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";
        });

        zad_23_25_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";
        });
    }
}
