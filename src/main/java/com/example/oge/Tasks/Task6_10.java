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

public class Task6_10 extends VariantMaker implements Initializable {

    @FXML
    ImageView zad_6_IV, zad_7_IV, zad_8_IV, zad_9_IV, zad_10_IV;

    @FXML
    Button nextBtn;

    @FXML
    TextField zad_6_TF, zad_7_TF, zad_8_TF, zad_9_TF, zad_10_TF;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image zad_6_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex6_10/" + Zad_6));
        zad_6_IV.setImage(zad_6_img);

        Image zad_7_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex6_10/" + Zad_7));
        zad_7_IV.setImage(zad_7_img);

        Image zad_8_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex6_10/" + Zad_8));
        zad_8_IV.setImage(zad_8_img);

        Image zad_9_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex6_10/" + Zad_9));
        zad_9_IV.setImage(zad_9_img);

        Image zad_10_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex6_10/" + Zad_10));
        zad_10_IV.setImage(zad_10_img);

        nextBtn.setOnAction(event -> {
            Stage stage = (Stage) nextBtn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task11.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        });
    }
}
