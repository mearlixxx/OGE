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

public class Task19 extends VariantMaker implements Initializable {
    @FXML
    ImageView zad_19_IV;

    @FXML
    Button nextBtn;

    @FXML
    TextField zad_19_TF;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image zad_19_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex19/" + Zad_19));
        zad_19_IV.setImage(zad_19_img);

        nextBtn.setOnAction(event -> {

            switch (MODE){
                case "RESHVAR":

                    if (zad_19_TF.getText().trim().equals(answers[1][18])){SCORES++;}

                    Stage stage = (Stage) nextBtn.getScene().getWindow();
                    stage.setResizable(false);
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task20_22.fxml")));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    stage.setScene(new Scene(root, 900, 600));

                    break;

                case "TRAINING":

                    if (zad_19_TF.getText().trim().equals(answers[1][18])){CORRECTORWRONG_1 = true;}

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
