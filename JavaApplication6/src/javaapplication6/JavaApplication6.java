/*
miembros del grupo:
Mario Cesar Sepulveda
Maximiliano Colin
Melany Gorosito
ivana mariel cabrera
 */
package javaapplication6;

import Proyecto.AccesoADatos.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JavaApplication6 {

   
    public static void main(String[] args) throws SQLException {
        String sql = "INSERT INTO alumno(dni, apellido, nombre,fechaNacimiento,estado)"
                + "VALUES (65346334,'Perez','Marcos','1980-5-04',1)";
        PreparedStatement ps = conexion.Prepared
        int registros = ps.executeUpdate();
        System.out.println(registros);
        
        
        

        
        
        
        
    }
    
}
