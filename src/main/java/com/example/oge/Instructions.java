package com.example.oge;

import javafx.event.ActionEvent;
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


public class Instructions implements Initializable {
    @FXML
    Button backBtn1;

    @FXML
    ImageView inst_1_IV, inst_2_IV;
    @FXML
    public void back(ActionEvent event) throws IOException {
        Stage Success  = (Stage) backBtn1.getScene() .getWindow();
        Success.setResizable(false);
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
        Success.setScene(new Scene(parent, 600, 400));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image inst_1_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/instruction.png"));
        inst_1_IV.setImage(inst_1_img);

        Image inst_2_img = new Image(getClass().getResourceAsStream("/com/example/oge/Formulas/instruction2.png"));
        inst_2_IV.setImage(inst_2_img);
    }
}
