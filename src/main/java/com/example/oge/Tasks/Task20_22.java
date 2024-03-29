package com.example.oge.Tasks;

import com.example.oge.VariantMaker;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Task20_22 extends VariantMaker implements Initializable {

    @FXML
    ImageView zad_20_IV, zad_21_IV;

    @FXML
    Button nextBtn;

    @FXML
    TextField zad_20_TF, zad_21_TF;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image zad_20_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex20_21/" + Zad_20));
        zad_20_IV.setImage(zad_20_img);

        Image zad_21_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex20_21/" + Zad_21));
        zad_21_IV.setImage(zad_21_img);

        nextBtn.setOnAction(event -> {

            switch (MODE){

                case "RESHVAR":

                    if (zad_20_TF.getText().trim().equals(answers[1][19])){SCORES++;}
                    if (zad_21_TF.getText().trim().equals(answers[1][20])){SCORES++;}

                    Stage stage = (Stage) nextBtn.getScene().getWindow();
                    stage.setResizable(false);
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task23_25.fxml")));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    stage.setScene(new Scene(root, 900, 600));

                    break;

                case "TRAINING":

                    if (zad_20_TF.getText().trim().equals(answers[1][19])){CORRECTORWRONG_1 = true;}
                    if (zad_21_TF.getText().trim().equals(answers[1][20])){CORRECTORWRONG_2 = true;}

                    Stage stage1 = (Stage) nextBtn.getScene().getWindow();
                    stage1.setResizable(false);
                    Parent root1 = null;
                    try {
                        root1 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/training_results.fxml")));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    stage1.setScene(new Scene(root1, 900, 600));

                    break;

            }
        });
    }
}
