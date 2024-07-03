package com.sparta.kch;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import static com.sparta.kch.App.logger;

public class ConnectToDatabase {

    public static void queryDatabase(){
        try {
            Properties properties = openProperties();
            Connection connection = connectToDatabase(properties);
            ResultSet resultSet = statementSelect(connection);
            assert resultSet != null;
            getResults(resultSet);
        } catch (SQLException | IOException e) {
            e.getStackTrace();
        }
    }
    private static Properties openProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/resources/mysql.properties"));
        return properties;
    }

    private static Connection connectToDatabase(Properties properties) throws SQLException {

        return DriverManager.getConnection(
                properties.getProperty("url"),
                properties.getProperty("username"),
                properties.getProperty("password"));

    }

    private static ResultSet statementSelect(Connection connection) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(
                SQLQueries.customerWithName);
        preparedStatement.setString(1, "%Maria%");

        return preparedStatement.executeQuery();

//        Statement statement = connection.createStatement();
//        return statement.executeQuery(SQLQueries.customerSelect);

    }
    private static void getResults (ResultSet resultSet) throws SQLException {
        while (resultSet.next()){
            logger.info(resultSet.getString(1));
            logger.info(resultSet.getString(2));
            logger.info(resultSet.getString(3));
        }

    }




}
