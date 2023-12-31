/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Vistas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jDPEscritorio = new javax.swing.JDesktopPane();
        jMenuListadoPorMaterias = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMenuFormularioAlumno = new javax.swing.JMenuItem();
        jMMateria = new javax.swing.JMenu();
        jMenuFormularioMateria = new javax.swing.JMenuItem();
        jMAdministracion = new javax.swing.JMenu();
        jMenuInscripciones = new javax.swing.JMenuItem();
        jMenuNotas = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar4.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar5.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar5.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar6.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar6.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDPEscritorio.setPreferredSize(new java.awt.Dimension(650, 600));

        javax.swing.GroupLayout jDPEscritorioLayout = new javax.swing.GroupLayout(jDPEscritorio);
        jDPEscritorio.setLayout(jDPEscritorioLayout);
        jDPEscritorioLayout.setHorizontalGroup(
            jDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jDPEscritorioLayout.setVerticalGroup(
            jDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jMAlumno.setText("Alumno");

        jMenuFormularioAlumno.setText("Formulario de Alumno");
        jMenuFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormularioAlumnoActionPerformed(evt);
            }
        });
        jMAlumno.add(jMenuFormularioAlumno);

        jMenuListadoPorMaterias.add(jMAlumno);

        jMMateria.setText("Materia");

        jMenuFormularioMateria.setText("Formulario de Materia");
        jMenuFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormularioMateriaActionPerformed(evt);
            }
        });
        jMMateria.add(jMenuFormularioMateria);

        jMenuListadoPorMaterias.add(jMMateria);

        jMAdministracion.setText("Administracion");

        jMenuInscripciones.setText("Manejo Inscripciones");
        jMenuInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInscripcionesActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMenuInscripciones);

        jMenuNotas.setText("Notas");
        jMenuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNotasActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMenuNotas);

        jMenuListadoPorMaterias.add(jMAdministracion);

        jMConsultas.setText("Consultas");

        jMenuItem5.setText("Alumnos por Materia");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMConsultas.add(jMenuItem5);

        jMenuListadoPorMaterias.add(jMConsultas);

        setJMenuBar(jMenuListadoPorMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormularioAlumnoActionPerformed
        //abrir menu formulario Alumno  >> maxi
        
        jDPEscritorio.removeAll();
        jDPEscritorio.repaint();
        MenuAlumno MA = new MenuAlumno();
        MA.setVisible(true);
        jDPEscritorio.add(MA);
        jDPEscritorio.moveToFront(MA);
        
    }//GEN-LAST:event_jMenuFormularioAlumnoActionPerformed

    private void jMenuFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormularioMateriaActionPerformed
        // abrir menu formulario materias >>maxi
        jDPEscritorio.removeAll();
        jDPEscritorio.repaint();
        MenuMaterias MM = new MenuMaterias();
        MM.setVisible(true);
        jDPEscritorio.add(MM);
        jDPEscritorio.moveToFront(MM);
        
        
        
        
    }//GEN-LAST:event_jMenuFormularioMateriaActionPerformed

    private void jMenuInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInscripcionesActionPerformed
        // Abrir menu manejo inscripciones
        jDPEscritorio.removeAll();
        jDPEscritorio.repaint();
        MenuInscripciones MI = null;
        try {
            MI = new MenuInscripciones();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
         MI.setVisible(true);
        }
       
        jDPEscritorio.add(MI);
        jDPEscritorio.moveToFront(MI);
        
    }//GEN-LAST:event_jMenuInscripcionesActionPerformed

    private void jMenuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNotasActionPerformed
        // abrir menu carga notas 
        jDPEscritorio.removeAll();
        jDPEscritorio.repaint();
        MenuCargaNotas MC; 
        try {
            MC = new MenuCargaNotas();
            MC.setVisible(true);
        jDPEscritorio.add(MC);
        jDPEscritorio.moveToFront(MC);
        
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuNotasActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       // abrir menu consulta de alumnos x materia
        jDPEscritorio.removeAll();
        jDPEscritorio.repaint();
        MenuConsultaAlumnos MCA = new MenuConsultaAlumnos();
        MCA.setVisible(true);
        jDPEscritorio.add(MCA);
        jDPEscritorio.moveToFront(MCA);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDPEscritorio;
    private javax.swing.JMenu jMAdministracion;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenu jMMateria;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuFormularioAlumno;
    private javax.swing.JMenuItem jMenuFormularioMateria;
    private javax.swing.JMenuItem jMenuInscripciones;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuBar jMenuListadoPorMaterias;
    private javax.swing.JMenuItem jMenuNotas;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables
}
