/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivana
 */
public class InscripcionData {
    private Connection con=null;
    
    public InscripcionData(){;
    
    this.con=Conexion.getConexion();
    
    }
    
    public void guardarInscripcion (Inscripcion insc){
    
    String sql = "INSERT INTO Inscripcion(idalumno, idMateria, nota) VALUE (?,?,?)";
    
    try{
        PreparedStatement ps=con.prepareStatement (sql,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, insc.getAlumno().getIdAlumno());
        ps.setInt(2, insc.getMateria().getIdMateria());
        ps.setDouble (3, insc.getNota());
        ps.executeUpdate();
        ResultSet rs=ps.getGeneratedKeys();
        if(rs.next()){
            
            insc.setIdInscripcion(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Inscripción exitosa");
            
        }
        
        ps.close();
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
    }       
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
        String sql= "UPDATE Inscripcion SET nota = ?' WHERE idAlumno = ? and idMateria = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            ps.executeUpdate();
            int filas=ps.executeUpdate();
            if(filas<0){
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
        
    }
     public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
    
        String sql="DELETE FROM Inscripcion WHERE idAlumno = ? and id Materia = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int filas=ps.executeUpdate();
            if (filas<0){
                JOptionPane.showMessageDialog(null, "Inscripcion borrada");
            }
            
            ps.close();
            
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
        
    }
    
    public List<Inscripcion> obtenerInscripciones(){
    
        ArrayList<Inscripcion> cursadas=new ArrayList<>();
        
        String sql="SELECT * FROM Inscripcion";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            
            Inscripcion insc=new Inscripcion();
            insc.setIdInscripcion(rs.getInt("idInscripcion"));
            Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
            Materia mat=md.buscarMateria(rs.getInt("idMateria"));
            insc. setAlumno(alu);
            insc.setMateria(mat);
            insc.setNota(rs.getDouble("nota"));
            cursadas.add(insc);
           }
           ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
        
        return cursadas;
    }
}
   

