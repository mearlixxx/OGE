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

public class Task5 extends VariantMaker implements Initializable {

    @FXML
    ImageView zad_5_IV;

    @FXML
    Button nextBtn;

    @FXML
    TextField zad_5_TF;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image zad_5_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex5/" + Zad_5));
        zad_5_IV.setImage(zad_5_img);

        nextBtn.setOnAction(event -> {
            Stage stage = (Stage) nextBtn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task6_10.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        });
    }
}
