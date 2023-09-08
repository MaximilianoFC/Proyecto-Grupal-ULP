package Proyecto.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="proyectogrupaluniversidad";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    private static connection connection;

    
    
private Conexion(){}

public static Proyecto.AccesoADatos.connection getConexion() throws ClassNotFoundException {

        if (connection == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection conect = DriverManager
                        .getConnection(URL + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                                + "&user=" + USUARIO + "&password=" + PASSWORD);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD");

                {
                    JOptionPane.showMessageDialog(null, "Error al cargar los Driver");
                }
            }
        }
        return connection;
    }
    

}
