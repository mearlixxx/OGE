package com.example.oge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Formulas implements Initializable {
    @FXML
    Button backBtn1, backBtn2, backBtn3, backBtn4, backBtn5, backBtn6, backBtn7, backBtn8, backBtn9, backBtn10, backBtn11, backBtn12, backBtn13, backBtn14, backBtn15, backBtn16, backBtn17;

    @FXML
    ImageView form_1_5_IV, form_6_IV, form_7_IV, form_8_IV, form_9_IV, form_10_IV, form_11_IV, form_12_IV, form_13_IV, form_14_IV, form_15_IV, form_16_19_IV, form_20_IV, form_21_IV, form_22_IV, form_23_IV, form_24_26_IV;


    @FXML
    public void back() throws IOException {
        Stage Success  = (Stage) backBtn1.getScene() .getWindow();
        Success.setResizable(false);
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
        Success.setScene(new Scene(parent, 600, 400));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image form_1_5_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad1_5.jpg"));
        form_1_5_IV.setImage(form_1_5_img);

        Image form_6_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad6.jpg"));
        form_6_IV.setImage(form_6_img);

        Image form_7_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad7.jpg"));
        form_7_IV.setImage(form_7_img);

        Image form_8_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad8.jpg"));
        form_8_IV.setImage(form_8_img);

        Image form_9_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad9.jpg"));
        form_9_IV.setImage(form_9_img);

        Image form_10_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad10.jpg"));
        form_10_IV.setImage(form_10_img);

        Image form_11_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad11.jpg"));
        form_11_IV.setImage(form_11_img);

        Image form_12_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad12.jpg"));
        form_12_IV.setImage(form_12_img);

        Image form_13_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad13.jpg"));
        form_13_IV.setImage(form_13_img);

        Image form_14_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad14.jpg"));
        form_14_IV.setImage(form_14_img);

        Image form_15_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad15.jpg"));
        form_15_IV.setImage(form_15_img);

        Image form_16_19_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad16_19.jpg"));
        form_16_19_IV.setImage(form_16_19_img);

        Image form_20_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad20.jpg"));
        form_20_IV.setImage(form_20_img);

        Image form_21_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad21.jpg"));
        form_21_IV.setImage(form_21_img);

        Image form_22_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad22.jpg"));
        form_22_IV.setImage(form_22_img);

        Image form_23_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad23.jpg"));
        form_23_IV.setImage(form_23_img);

        Image form_24_26_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/Zad24_26.jpg"));
        form_24_26_IV.setImage(form_24_26_img);
    }
}
