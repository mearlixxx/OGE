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

public class Task15_18 extends VariantMaker implements Initializable {
    @FXML
    ImageView zad_15_IV, zad_16_IV, zad_17_IV, zad_18_IV;

    @FXML
    Button nextBtn;

    @FXML
    TextField zad_15_TF, zad_16_TF, zad_17_TF, zad_18_TF;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image zad_15_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex15_18/" + Zad_15));
        zad_15_IV.setImage(zad_15_img);


        Image zad_16_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex15_18/" + Zad_16));
        zad_16_IV.setImage(zad_16_img);

        Image zad_17_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex15_18/" + Zad_17));
        zad_17_IV.setImage(zad_17_img);

        Image zad_18_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex15_18/" + Zad_18));
        zad_18_IV.setImage(zad_18_img);


        nextBtn.setOnAction((event -> {
            Stage stage = (Stage) nextBtn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task19.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        }));
    }
}
