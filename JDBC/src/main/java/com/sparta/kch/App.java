package com.sparta.kch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    // Connection
    // Statements
    // Results
    public static void main(String[] args){
        try {

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306","root","root");

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
