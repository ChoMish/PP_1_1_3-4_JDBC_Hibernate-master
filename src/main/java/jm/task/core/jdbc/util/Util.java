package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/tst";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    public static Connection getConnection() {

        Connection connection = null;
        try  {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // Регистрация JDBC драйвера
            Class.forName(DRIVER);
            // Выполнение операций с базой данных
        } catch (ClassNotFoundException | SQLException se) {
            se.printStackTrace();
            System.out.println("Не установленно соединение");
        }
        return connection;
    }
}



