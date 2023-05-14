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

public class Task12_14 extends VariantMaker implements Initializable {

    @FXML
    ImageView zad_12_IV, zad_13_IV, zad_14_IV;

    @FXML
    Button nextBtn;

    @FXML
    TextField zad_12_TF, zad_13_TF, zad_14_TF;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image zad_12_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex12_14/" + Zad_12));
        zad_12_IV.setImage(zad_12_img);

        Image zad_13_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex12_14/" + Zad_13));
        zad_13_IV.setImage(zad_13_img);

        Image zad_14_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex12_14/" + Zad_14));
        zad_14_IV.setImage(zad_14_img);

        nextBtn.setOnAction(event -> {

            switch (MODE){

                case "RESHVAR":

                    if (zad_12_TF.getText().trim().equals(answers[1][11])){SCORES++;}
                    if (zad_13_TF.getText().trim().equals(answers[1][12])){SCORES++;}
                    if (zad_14_TF.getText().trim().equals(answers[1][13])){SCORES++;}

                    Stage stage = (Stage) nextBtn.getScene().getWindow();
                    stage.setResizable(false);
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task15_18.fxml")));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    stage.setScene(new Scene(root, 900, 600));

                    break;

                case "TRAINING":

                    if (zad_12_TF.getText().trim().equals(answers[1][11])){CORRECTORWRONG_1 = true;}
                    if (zad_13_TF.getText().trim().equals(answers[1][12])){CORRECTORWRONG_2 = true;}
                    if (zad_14_TF.getText().trim().equals(answers[1][13])){CORRECTORWRONG_3 = true;}

                    Stage stage1 = (Stage) nextBtn.getScene().getWindow();
                    stage1.setResizable(false);
                    Parent root1 = null;
                    try {
                        root1 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task6_10.fxml")));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    stage1.setScene(new Scene(root1, 900, 600));

                    break;

            }
        });
    }
}
