package com.example.oge;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ReshvarResults extends VariantMaker implements Initializable {

    @FXML
    Text resultText;

    @FXML
    Button nextBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        resultText.setText("Вы выполнили правильно " + SCORES + " заданий из 25.");

        nextBtn.setOnAction(actionEvent -> {
            Stage stage = (Stage) nextBtn.getScene().getWindow();
            stage.setResizable(false);
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/mainMenu.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setScene(new Scene(root, 600, 400));
        });
    }
}
