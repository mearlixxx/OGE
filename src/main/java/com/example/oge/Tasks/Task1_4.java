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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Task1_4 extends VariantMaker implements Initializable {
    @FXML
    public ImageView usl_IV, zad_1_IV, zad_2_IV, zad_3_IV, zad_4_IV;

    @FXML
    Button nextBtn;

    @FXML
    TextField zad_1_TF, zad_2_TF, zad_3_TF, zad_4_TF;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Image zad_1_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex1_4/" + Zad_1));
        zad_1_IV.setImage(zad_1_img);


        Image zad_2_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex1_4/" + Zad_2));
        zad_2_IV.setImage(zad_2_img);

        Image zad_3_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex1_4/" + Zad_3));
        zad_3_IV.setImage(zad_3_img);

        Image zad_4_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex1_4/" + Zad_4));
        zad_4_IV.setImage(zad_4_img);

        Image usl_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex1_4/" + Usl ));
        usl_IV.setImage(usl_img);

        nextBtn.setOnAction((event -> {
            switch (MODE){
                case "RESHVAR":

                    if (zad_1_TF.getText().trim().equals(answers[1][0])){SCORES++;}
                    if (zad_2_TF.getText().trim().equals(answers[1][1])){SCORES++;}
                    if (zad_3_TF.getText().trim().equals(answers[1][2])){SCORES++;}
                    if (zad_4_TF.getText().trim().equals(answers[1][3])){SCORES++;}

                    break;

                case "TRAINING":

                    if (zad_1_TF.getText().trim().equals(answers[1][0])){CORRECTORWRONG_1 = true;}
                    if (zad_2_TF.getText().trim().equals(answers[1][1])){CORRECTORWRONG_2 = true;}
                    if (zad_3_TF.getText().trim().equals(answers[1][2])){CORRECTORWRONG_3 = true;}
                    if (zad_4_TF.getText().trim().equals(answers[1][3])){CORRECTORWRONG_4 = true;}

                    break;

            }


            Stage stage = (Stage) nextBtn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task5.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        }));
    }
}
