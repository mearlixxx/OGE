package com.example.oge;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;

public class ChooseTask extends VariantMaker implements Initializable {

    @FXML
    Button zad_1_5_btn, zad_6_10_btn, zad_11_btn, zad_12_14_btn, zad_15_18_btn, zad_19_btn, zad_20_21_btn, zad_23_25_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Random random = new Random();
        varNum = random.nextInt(5) + 1;

        if (varNum == 1) {answers = answers_var_1;}
        if (varNum == 2) {answers = answers_var_2;}
        if (varNum == 3) {answers = answers_var_3;}
        if (varNum == 4) {answers = answers_var_4;}
        if (varNum == 5) {answers = answers_var_5;}

        Zad_1 += varNum + ".png";
        Zad_2 += varNum + ".png";
        Zad_3 += varNum + ".png";
        Zad_4 += varNum + ".png";
        Zad_5 += varNum + ".png";
        Zad_6 += varNum + ".png";
        Zad_7 += varNum + ".png";
        Zad_8 += varNum + ".png";
        Zad_9 += varNum + ".png";
        Zad_10 += varNum + ".png";
        Zad_11 += varNum + ".png";
        Zad_12 += varNum + ".png";
        Zad_13 += varNum + ".png";
        Zad_14 += varNum + ".png";
        Zad_15 += varNum + ".png";
        Zad_16 += varNum + ".png";
        Zad_17 += varNum + ".png";
        Zad_18 += varNum + ".png";
        Zad_19 += varNum + ".png";
        Zad_20 += varNum + ".png";
        Zad_21 += varNum + ".png";
        Zad_23 += varNum + ".png";
        Zad_25 += varNum + ".png";
        Usl += varNum + ".png";

        MODE = "TRAINING";
        zad_1_5_btn.setOnAction(actionEvent -> {



            Stage stage = (Stage) zad_1_5_btn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task1_4.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        });

        zad_6_10_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";

            Stage stage = (Stage) zad_6_10_btn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task6_10.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        });

        zad_11_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";

            Stage stage = (Stage) zad_11_btn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task11.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        });

        zad_12_14_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";

            Stage stage = (Stage) zad_12_14_btn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task12_14.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        });

        zad_15_18_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";

            Stage stage = (Stage) zad_15_18_btn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task15_18.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        });

        zad_19_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";

            Stage stage = (Stage) zad_19_btn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task19.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        });

        zad_20_21_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";

            Stage stage = (Stage) zad_20_21_btn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task20_22.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        });

        zad_23_25_btn.setOnAction(actionEvent -> {
            MODE = "TRAINING";

            Stage stage = (Stage) zad_23_25_btn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task23_25.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        });
    }
}
