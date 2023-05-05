package com.example.oge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class VariantMaker {
    public static int varNum;

    public static String Zad_1 = "zad_1_";
    public static String Zad_2 = "zad_2_";
    public static String Zad_3 = "zad_3_";
    public static String Zad_4 = "zad_4_";
    public static String Zad_5 = "zad_5_";
    public static String Zad_6 = "zad_6_";
    public static String Zad_7 = "zad_7_";
    public static String Zad_8 = "zad_8_";
    public static String Zad_9 = "zad_9_";
    public static String Zad_10 = "zad_10_";
    public static String Zad_11 = "zad_11_";
    public static String Zad_12 = "zad_12_";
    public static String Zad_13 = "zad_13_";
    public static String Zad_14 = "zad_14_";
    public static String Zad_15 = "zad_15_";
    public static String Zad_16 = "zad_16_";
    public static String Zad_17 = "zad_17_";
    public static String Zad_18 = "zad_18_";
    public static String Zad_19 = "zad_19_";
    public static String Zad_20 = "zad_20_";
    public static String Zad_21 = "zad_21_";
    public static String Zad_23 = "zad_23_";
    public static String Zad_25 =  "zad_25_";
    public static String Usl =  "usl_";

    @FXML
    Button var1Btn, var2Btn, var3Btn, var4Btn, var5Btn;

    public void  makeVarNum(ActionEvent ae) throws IOException {

        if (ae.getSource() == var1Btn) {varNum = 1;}
        if (ae.getSource() == var2Btn) {varNum = 2;}
        if (ae.getSource() == var3Btn) {varNum = 3;}
        if (ae.getSource() == var4Btn) {varNum = 4;}
        if (ae.getSource() == var5Btn) {varNum = 5;}

        Zad_1 += varNum + ".png";
        Zad_2 += varNum + ".png";
        Zad_3 += varNum + ".png";
        Zad_4 += varNum + ".png";
        Zad_5 += varNum + ".png";
        Zad_6 += varNum + ".png";
        Zad_7 += varNum + ".png";
        Zad_8 += varNum + ".png";
        Zad_9 += varNum + ".png";
        Zad_10 += varNum + ".png";
        Zad_11 += varNum + ".png";
        Zad_12 += varNum + ".png";
        Zad_13 += varNum + ".png";
        Zad_14 += varNum + ".png";
        Zad_15 += varNum + ".png";
        Zad_16 += varNum + ".png";
        Zad_17 += varNum + ".png";
        Zad_18 += varNum + ".png";
        Zad_19 += varNum + ".png";
        Zad_20 += varNum + ".png";
        Zad_21 += varNum + ".png";
        Zad_23 += varNum + ".png";
        Zad_25 += varNum + ".png";
        Usl += varNum + ".png";

        Stage stage = (Stage) var1Btn.getScene().getWindow();
        stage.setResizable(false);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task1_4.fxml")));
        stage.setScene(new Scene(root, 900, 600));

    }
}
