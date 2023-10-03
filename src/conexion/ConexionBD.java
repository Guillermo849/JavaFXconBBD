package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class ConexionBD {
    private Connection conexion;
    public void ConexionDB() throws SQLException {
        String baseDatos = "aeropuertos";
        String host = "localhost";
        String usuario = "user3";
        String password = "user3";
        String cadenaConexion = "jdbc:mysql://" + host + "/" + baseDatos+ "?serverTimezone=" + TimeZone.getDefault().getID();
        conexion = DriverManager.getConnection(cadenaConexion, usuario, password);
        conexion.setAutoCommit(true);

    }
    public Connection getConexion() {
        return conexion;
    }
    public void CloseConexion() {
    	try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
