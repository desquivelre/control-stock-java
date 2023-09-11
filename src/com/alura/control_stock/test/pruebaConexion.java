package src.com.alura.control_stock.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class pruebaConexion {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC", "root", "Deg159753#");



        con.close();
    }
}
