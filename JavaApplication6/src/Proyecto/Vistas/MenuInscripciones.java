/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Vistas;

import Entidades.Alumno;
import Entidades.Materia;
import Proyecto.AccesoADatos.InscripcionData;
import Proyecto.AccesoADatos.MateriaData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Villa
 */
public class MenuInscripciones extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form MenuInscripciones
     * private List<Materia> ListaM;
    private List<Alumno> ListaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
     */
    public MenuInscripciones() {
         /*initComponents();
        aData = new AlumnosData();
        ListaA = aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        aData = new MateriaData();
        
        cargaAlumnos();
        armarCabeceraTabla();
        
        inscData = new InscripcionData();
        aData = new MateriaData();private List<Materia> ListaM;
    private List<Alumno> ListaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBAlumnos = new javax.swing.JComboBox<>();
        jRBMateriasInscriptas = new javax.swing.JRadioButton();
        jRBMateriasNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBAnularIns = new javax.swing.JButton();
        jBInscribir = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(645, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(645, 600));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un alumno;:");

        jCBAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumnosActionPerformed(evt);
            }
        });

        jRBMateriasInscriptas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRBMateriasInscriptas.setText("Materias Inscriptas");
        jRBMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasInscriptasActionPerformed(evt);
            }
        });

        jRBMateriasNoInscriptas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRBMateriasNoInscriptas.setText("Materias no inscriptas");
        jRBMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasNoInscriptasActionPerformed(evt);
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

        jBAnularIns.setText("Anular Inscripcion");
        jBAnularIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInsActionPerformed(evt);
            }
        });

        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Listado de Materias:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBMateriasInscriptas)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRBMateriasNoInscriptas)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCBAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBInscribir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBAnularIns)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBSalir)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel3)))
                .addGap(41, 143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBMateriasInscriptas)
                    .addComponent(jRBMateriasNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBAnularIns)
                    .addComponent(jBInscribir)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasNoInscriptasActionPerformed
/*          borrarFilaTabla();
        jRBMateriasInscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        jBInscribir.setEnabled(false);
        jBInscribir.setEnabled(true);*/
    }//GEN-LAST:event_jRBMateriasNoInscriptasActionPerformed

    private void jRBMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasInscriptasActionPerformed
         /*borrarFilaTabla();
        jRBMateriasNoInscriptas.setSelected(false);
        cargaDatosInscriptas();
        jBInscribir.setEnabled(true);
        jBInscribir.setEnabled(false);
*/
    }//GEN-LAST:event_jRBMateriasInscriptasActionPerformed

    private void jCBAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAlumnosActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
     /* int filaSeleccionada=jTable1.getSelectedRow();
        if(filaSeleccionada!=-1){
            Alumno a=(Alumno)jCBAlumnos.getSelectedItem();
            
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria=(String)modelo.getValueAt(filaSeleccionada, 1);
            int anio=(Integer)modelo.getValueAt(filaSeleccionada, 2);
            Materia m=new Materia(idMateria,nombreMateria,anio,true);
            
            Inscripcion i=new Inscripcion(a,m,0);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
        }*/
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAnularInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInsActionPerformed
        /*  int filaSeleccionada=jTable1.getSelectedRow();
        if(filaSeleccionada!=-1){
            Alumno a=(Alumno)jCBAlumnos.getSelectedItem();
            
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
      
            
            inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria); 
            borrarFilaTabla();
*/
    }//GEN-LAST:event_jBAnularInsActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed

      /*private void cargaAlumnos(){ // Carga al combo box
        for(Alumno item: ListaA){
            jCBAlumnos.addItem(item);
        }  
    }
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("dni");
        filaCabecera.add("Nombre");
        filaCabecera.add("Anio");
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jTable1.setModel(modelo);
        
        }
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for (int i = indice;i>=0;i--){
        modelo.removeRow(i);
        }
  
    }
    
    private void cargaDatosNoInscriptas(){ 
        //borrarFilasTabla();
        Alumno selec = (Alumno)jCBAlumno.getSelectecItem();
        ListaM = inscData.obtenerMateriasNOCursadas(selec.getIdAlumno());
        for(Materia m: ListaM){
            modelo.addRow(new Object[] { m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
            
        }    
    
    }

     private void cargaDatosInscriptas(){ 
        //borrarFilasTabla();
        Alumno selec = (Alumno)jCBAlumnos.getSelectecItem();
        List <Materia> Lista = inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for(Materia m: Lista){
            modelo.addRow(new Object[] { m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
    }   
}
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnularIns;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRBMateriasInscriptas;
    private javax.swing.JRadioButton jRBMateriasNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
