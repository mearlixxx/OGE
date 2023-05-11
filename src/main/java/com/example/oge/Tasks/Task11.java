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

public class Task11 extends VariantMaker implements Initializable {
    @FXML
    ImageView zad_11_IV;

    @FXML
    Button nextBtn;

    @FXML
    TextField zad_11_TF;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image zad_11_img = new Image(getClass().getResourceAsStream("/com/example/oge/Excersises/Ex11/" + Zad_11));
        zad_11_IV.setImage(zad_11_img);

        nextBtn.setOnAction(event -> {

            if (zad_11_TF.getText().trim().equals(answers[1][10])){
                SCORES++;
            }
            System.out.println(SCORES);
            Stage stage = (Stage) nextBtn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task12_14.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 900, 600));
        });
    }
}
