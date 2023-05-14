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

    public static int SCORES;

    public static String MODE = "";

    public static boolean CORRECTORWRONG_1 = false;

    public static boolean CORRECTORWRONG_2 = false;

    public static boolean CORRECTORWRONG_3 = false;

    public static boolean CORRECTORWRONG_4 = false;

    public static boolean CORRECTORWRONG_5 = false;

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

    public static String[][] answers_var_1 = new String[][] {
            {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "23", "25"}, //0
            {"62471", "240", "5", "6,24", "26,1", "-1,3", "4", "0,28", "-6,75", "0,096", "123", "4,2", "1", "20", "27", "133", "42", "0,8", "1", "8", "100", "49", "3:5"}}; //1
    public static String[][] answers_var_2 = new String[][] {
            {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "23", "25"},
            {"34125", "25", "132", "78", "127", "-2", "1", "8", "18", "4", "123", "0,003", "2", "68400", "68", "59", "10", "0,6", "23", "±√5;±2;0", "20", "9", "25"}};;
    public static String[][] answers_var_3 = new String[][] {
            {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "23", "25"},
            {"10", "3,4", "19", "42", "1,5", "1,6", "2", "70", "-7", "0,2", "123", "7", "2", "17", "106", "54", "12", "5", "23", "(-∞;-4,5]", "181", "10", "250"}};;
    public static String[][] answers_var_4 = new String[][] {
            {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "23", "25"},
            {"3412", "60", "40,82", "72", "57920", "270", "3", "9", "3,5", "0,6", "231", "0,6", "2", "44", "120", "26", "4", "22,5", "12", "(6;1),(1;6)", "16", "14,5", "672"}};;
    public static String[][] answers_var_5 = new String[][] {
            {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "23", "25"},
            {"92310", "475", "10", "8", "300", "24,52", "3", "-3", "8", "0,625", "321", "73,4", "4", "5", "66", "61", "800", "12", "23", "-2", "160", "14,4", "17"}};
    public static String[][] answers;

    @FXML
    Button var1Btn, var2Btn, var3Btn, var4Btn, var5Btn;

    public void  makeVarNum(ActionEvent ae) throws IOException {

        if (ae.getSource() == var1Btn) {varNum = 1; answers = answers_var_1;}
        if (ae.getSource() == var2Btn) {varNum = 2; answers = answers_var_2;}
        if (ae.getSource() == var3Btn) {varNum = 3; answers = answers_var_3;}   
        if (ae.getSource() == var4Btn) {varNum = 4; answers = answers_var_4;}
        if (ae.getSource() == var5Btn) {varNum = 5; answers = answers_var_5;}

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

        MODE = "RESHVAR";

        Stage stage = (Stage) var1Btn.getScene().getWindow();
        stage.setResizable(false);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/oge/Tasks/task1_4.fxml")));
        stage.setScene(new Scene(root, 900, 600));

    }
}

