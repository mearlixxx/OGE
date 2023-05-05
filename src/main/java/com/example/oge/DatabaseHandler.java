package com.example.oge;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.*;

public class DatabaseHandler extends Config {
    java.sql.Connection Connection;

    public static String emailFromDB;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + host + ":" + port + "/" + name;
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection = DriverManager.getConnection(connectionString, user, password);

        return Connection;
    }

    public void signUpUser(User user) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO " + Const.USER_TABLE +  "(" + Const.NAME + "," + Const.SURNAME + ","
                + Const.USERNAME + "," + Const.PASSWORD + "," + Const.EMAIL + ")" + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement prSt = getConnection().prepareStatement(insert);

            prSt.setString(1, user.getName());
            prSt.setString(2, user.getSurname());
            prSt.setString(3, user.getUsername());
            prSt.setString(4, user.getPassword());
            prSt.setString(5, user.getEmail());

            prSt.executeUpdate();
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public ResultSet getUser (User user){
        ResultSet rs = null;

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " +
                Const.USERNAME + "=? AND " + Const.PASSWORD + "=?";
        try {
            PreparedStatement prSt = getConnection().prepareStatement(select);

            prSt.setString(1, user.getUsername());
            prSt.setString(2, user.getPassword());


            rs = prSt.executeQuery();
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return rs;
    }

}
