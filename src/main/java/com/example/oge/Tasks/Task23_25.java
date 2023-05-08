package com.example.oge.Tasks;

import com.example.oge.VariantMaker;
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

public class Task23_25 extends VariantMaker implements Initializable {

    @FXML
    ImageView zad_23_IV, zad_25_IV;

    @FXML
    Button nextBtn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image zad_23_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex23_25/" + Zad_23));
        zad_23_IV.setImage(zad_23_img);

        Image zad_25_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex23_25/" + Zad_25));
        zad_25_IV.setImage(zad_25_img);

        nextBtn.setOnAction(event -> {
            /*Stage stage = (Stage) nextBtn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task23_25.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));*/
        });
    }
}
