package com.example.oge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainMenu {
    @FXML
    Button formulasBtn, trainingBtn, reshVarBtn, instrBtn;


    @FXML
    public void setFormulasBtn () throws IOException {
        Stage formulas = (Stage) formulasBtn.getScene().getWindow();
        formulas.setResizable(false);
        Parent rootprofile = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("formulas.fxml")));
        formulas.setTitle("Формулы");
        formulas.setScene(new Scene(rootprofile, 600, 400));
    }
    @FXML
    public void setTrainingBtn() throws IOException {
        Stage train = (Stage) trainingBtn.getScene().getWindow();
        train.setResizable(false);
        Parent rootprofile = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("choose_task.fxml")));
        train.setTitle("Выбор задания");
        train.setScene(new Scene(rootprofile, 600, 400));
    }
    @FXML
    public void setInstrBtn() throws IOException {
        Stage instr = (Stage) instrBtn.getScene().getWindow();
        instr.setResizable(false);
        Parent rootprofile = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("instructions.fxml")));
        instr.setTitle("Инструкции");
        instr.setScene(new Scene(rootprofile, 600, 400));
    }
    @FXML
    public void setReshVarBtn()  throws IOException {

        Stage reshvar = (Stage) instrBtn.getScene().getWindow();
        reshvar.setResizable(false);
        Parent rootprofile = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("variantMaker.fxml")));
        reshvar.setTitle("Выбор варианта");
        reshvar.setScene(new Scene(rootprofile, 600, 400));

    }
}
