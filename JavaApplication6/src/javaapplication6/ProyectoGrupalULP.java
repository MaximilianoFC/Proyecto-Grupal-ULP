/*
miembros del grupo 56*:
Mario Cesar Sepulveda
Maximiliano Colin
Melany Gorosito
ivana mariel cabrera



Trabajos:
Maxi>inscripciones acceso
Ivana >clases entidades
Mario >Clase acceso alumnos 
Melany > 

Links:
token:
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
https://toedter.com/jcalendar/

token2:
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

hoy probamos el github x2
 */
package javaapplication6;


import Proyecto.AccesoADatos.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProyectoGrupalULP {

   
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
           //Maximiliano >>
        // conectarse a la base de datos:
        Connection con = Conexion.getConexion();
        
        
        //ejemplo de insercion de un alumno:
       //**Comentar todo el ejemplo la segunda vez que se corra el programa
       //sino tira error por duplicado**.
      

        // insertar alumno: 
        /*
        String sqlInsert = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (7567456, 'Antonia','Maria', '1950-05-18',1)";

        try {
            // Crear un PreparedStatement
            PreparedStatement preparedStatement = con.prepareStatement(sqlInsert);


            // Ejecutar la sentencia de inserción
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa.");
            } else {
                System.out.println("La inserción no tuvo éxito.");
            }

            // Cerrar la conexión y el PreparedStatement
            preparedStatement.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar el alumno: " + e.getMessage());
        }
    
        
        
        */
      
    }
    }
    

