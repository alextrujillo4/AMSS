package sample.Connections;

import java.sql.*;

public class ConnectionManager {
    private static String dbname = "amss";
    private static String user = "root";
    private static String password = "";

    public static Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/"+ dbname +"?" +
                            "useUnicode=true&" +
                            "useJDBCCompliantTimezoneShift=true&" +
                            "useLegacyDatetimeCode=false&" +
                            "serverTimezone=UTC",
                    user, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
