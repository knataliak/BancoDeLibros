package bbdd;

import java.sql.*;

public class Conexion {
    public static Connection c = null;
    public static void Conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bancodelibros","postgres","password");
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
	} catch (SQLException sqle) {
            sqle.printStackTrace();
            }
	}	
    public static void Desconectar() {
        Connection c = null;
        try {
            c.close();
            c = null;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
    public Connection getConn() {
        return c;
    }
}