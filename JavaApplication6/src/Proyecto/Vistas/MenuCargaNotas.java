/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Vistas;

;
import java.sql.SQLException;
import Entidades.Alumno;
import Proyecto.AccesoADatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class MenuCargaNotas extends javax.swing.JInternalFrame {

    /**
     * >>hecho por maximiliano
     */
    Connection con = Conexion.getConexion();

    //instancio el modelo de la tabla y sobreescribo el metodo isCellEditable para que solo la columna 4 sea editable.
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return columna == 4;
        }
    };

    public MenuCargaNotas() throws SQLException {
        initComponents();
        cargarAlumnos();
        cargarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(650, 600));
        setPreferredSize(new java.awt.Dimension(630, 600));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");

        jCBAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBAlumnosMouseClicked(evt);
            }
        });
        jCBAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumnosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCBAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBGuardar)
                                    .addGap(127, 127, 127)
                                    .addComponent(jBSalir))))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumnosActionPerformed
        // clic en lista de alumnos para obtener materias cursadas de un alumno:
        //Hago una consulta dependiendo del id del alumno seleccionado en el jcombobox

        //limpiar tabla:
        int x = modelo.getRowCount() - 1;
        for (int i = x; i >= 0; i--) {
            modelo.removeRow(modelo.getRowCount() - 1);
        }

        //consulta a la base de datos y mostrar datos en tabla.   
        try {
            Alumno alum = (Alumno) jCBAlumnos.getSelectedItem();

            //preparo la consulta
            String SQL = " SELECT idInscripto, inscripcion.idMateria, materia.nombre, materia.anio, nota\n"
                    + "FROM inscripcion JOIN materia on inscripcion.idMateria = materia.idMateria \n"
                    + "WHERE inscripcion.idAlumno = ?";

            PreparedStatement ps;
            ps = con.prepareStatement(SQL);
            //seteo el ? con el id del alumno que esta seleccionado en el jcombobox
            ps.setInt(1, alum.getIdAlumno());
            //se ejecuta la consulta
            ResultSet resultado = ps.executeQuery();

            while (resultado.next()) {
                //ya recibi los datos de la consulta.
                //añado a la tabla, el elemento en iteracion con un addRow, se añade en forma de arreglo.
                modelo.addRow(new Object[]{resultado.getInt("idInscripto"), resultado.getInt("idMateria"), resultado.getString("nombre"), resultado.getInt("anio"), resultado.getInt("nota")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuCargaNotas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jCBAlumnosActionPerformed

    private void jCBAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBAlumnosMouseClicked
        // TO add your handling code here:

    }//GEN-LAST:event_jCBAlumnosMouseClicked

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // clic en boton guardar
       //guarda todas las notas de el alumno.
 
        try {
//Modificar nota en base al idInscripto:
            Alumno alum = (Alumno) jCBAlumnos.getSelectedItem();
            String SQL = "UPDATE inscripcion SET nota=? WHERE idInscripto = ?";
            PreparedStatement ps = con.prepareStatement(SQL);

//Recorro todo el jTable para actualizar todas las notas.
            for (int i = 0; i <= (jTable1.getRowCount() - 1); i++) {

                //el valor de la nota nueva se toma de la tabla, columna 4 es la nota.
                int nota = Integer.parseInt(jTable1.getValueAt(i, 4).toString());
                ps.setInt(1, nota);
            
                //valor del idInscripto se lo toma de la tabla, columna 0 es el idinscripto.
                int id = Integer.parseInt(jTable1.getValueAt(i, 0).toString());
                ps.setInt(2, id);
                //ejecuto el update
                int resultado = ps.executeUpdate();

            }
//luego de hacer el update, se muestra un mensaje.
            JOptionPane.showMessageDialog(rootPane, "notas guardadas");
       
        } catch (SQLException ex) {
            Logger.getLogger(MenuCargaNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // clic en boton salir
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Alumno> jCBAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void cargarAlumnos() throws SQLException {
        //cargar alumnos del jcombobox 
        //hacer consulta pidiendo todos los alumnos activos
        //recorrerlos y añadirlos al jcombobox

        String SQL = "SELECT* FROM alumno";
        PreparedStatement ps = con.prepareStatement(SQL);
        ResultSet resultado = ps.executeQuery();

        while (resultado.next()) {
            //recorro la tabla de resultados de la consulta con next, y creo los objetos clase Alumno y los añado con add.item
            //*resultado.getDate("fechaNacimiento").toLocalDate() convierto el Date de la base de datos en un LocalDate.
            jCBAlumnos.addItem(new Alumno(resultado.getInt("idAlumno"), resultado.getInt("dni"), resultado.getString("apellido"), resultado.getString("nombre"), resultado.getDate("fechaNacimiento").toLocalDate(), resultado.getBoolean("estado")));

        }

    }

    private void cargarCabecera() {
        modelo.addColumn("idInscripto");
        modelo.addColumn("idMateria");
        modelo.addColumn("Materia");
        modelo.addColumn("Año");
        modelo.addColumn("Nota");
        jTable1.setModel(modelo);

    }

}
