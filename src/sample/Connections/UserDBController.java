package sample.Connections;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDBController {
    private static String tblName = "usuarios";
    public static int create(String username, String password) {
        int usr_id=-1;

        Connection conn = ConnectionManager.getConnection();

        Statement stmnt = null;
        ResultSet rs = null;

        String sql = "INSERT INTO "+ tblName + " (usr_name, usr_password) VALUES ('"+ username + "', '" + password +"')";
        try {
            stmnt = conn.createStatement();
            stmnt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

            rs = stmnt.getGeneratedKeys();
            if(rs.next()) {
                usr_id=rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            rs = null;

            if (stmnt != null) {
                try {
                    stmnt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            stmnt = null;
        }

        return usr_id;
    }

    public static ResultSet get() {
        Connection conn = ConnectionManager.getConnection();

        Statement stmnt = null;
        ResultSet users = null;

        String sql = "SELECT * FROM " + tblName;

        try {
            stmnt = conn.createStatement();
            users = stmnt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
}
