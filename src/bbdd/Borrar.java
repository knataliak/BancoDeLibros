package bbdd;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Borrar {
        
    public static void borrarAlumno(int idAlumno){
        String sentenciaSql = "DELETE FROM alumno WHERE id_alumno = ?";
        PreparedStatement s = null;
        try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.setInt(1, idAlumno);
            s.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
	} finally {
            if (s != null)
		try {
                    s.close();
		} catch (SQLException sqle) {
                    sqle.printStackTrace();
		}
	}
    }
}
