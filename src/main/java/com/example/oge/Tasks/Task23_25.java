package com.example.oge.Tasks;

import com.example.oge.VariantMaker;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Task23_25 extends VariantMaker implements Initializable {

    @FXML
    ImageView zad_23_IV, zad_25_IV;

    @FXML
    Button nextBtn;

    @FXML
    TextField zad_23_TF, zad_25_TF;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image zad_23_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex23_25/" + Zad_23));
        zad_23_IV.setImage(zad_23_img);

        Image zad_25_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex23_25/" + Zad_25));
        zad_25_IV.setImage(zad_25_img);

        nextBtn.setOnAction(event -> {

            switch (MODE){

                case "RESHVAR":

                    if (zad_23_TF.getText().trim().equals(answers[1][21])){SCORES++;}
                    if (zad_25_TF.getText().trim().equals(answers[1][22])){SCORES++;}

                    break;

                case  "TRAINING":

                    if (zad_23_TF.getText().trim().equals(answers[1][21])){CORRECTORWRONG_1 = true;}
                    if (zad_25_TF.getText().trim().equals(answers[1][22])){CORRECTORWRONG_2 = true;}

                    break;

            }
        });
    }
}
