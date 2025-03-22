/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author adhmin
 */
public class MDIApplication extends javax.swing.JFrame {

    /**
     * Creates new form MDIApplication
     */
    public MDIApplication() {
        initComponents();
        this.setTitle("Gestion des examens");
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        etudiantMenuEtudiant = new javax.swing.JMenuItem();
        ExamenMenuItem = new javax.swing.JMenuItem();
        InscriptionMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        ExamenParMatiereMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        EtudiantParExamenMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Gestion");

        etudiantMenuEtudiant.setMnemonic('o');
        etudiantMenuEtudiant.setText("Etudiant");
        etudiantMenuEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etudiantMenuEtudiantActionPerformed(evt);
            }
        });
        fileMenu.add(etudiantMenuEtudiant);

        ExamenMenuItem.setMnemonic('s');
        ExamenMenuItem.setText("Examen");
        ExamenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamenMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(ExamenMenuItem);

        InscriptionMenuItem.setMnemonic('x');
        InscriptionMenuItem.setText("Inscription Examen");
        InscriptionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscriptionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(InscriptionMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Filtrer");

        ExamenParMatiereMenuItem.setMnemonic('t');
        ExamenParMatiereMenuItem.setText("ExamenParMatiere");
        ExamenParMatiereMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamenParMatiereMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(ExamenParMatiereMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Rechercher");

        EtudiantParExamenMenuItem.setMnemonic('c');
        EtudiantParExamenMenuItem.setText("EtudiantParExamen");
        EtudiantParExamenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EtudiantParExamenMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(EtudiantParExamenMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InscriptionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscriptionMenuItemActionPerformed
         InscriptionExamenForm sf = new InscriptionExamenForm();
      desktopPane.add(sf);
      sf.setVisible(true);
    }//GEN-LAST:event_InscriptionMenuItemActionPerformed

    private void etudiantMenuEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etudiantMenuEtudiantActionPerformed
      EtudiantForm ef = new EtudiantForm();
      desktopPane.add(ef);
      ef.setVisible(true);
    }//GEN-LAST:event_etudiantMenuEtudiantActionPerformed

    private void ExamenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamenMenuItemActionPerformed
        ExamenForm exf = new ExamenForm();
      desktopPane.add(exf);
      exf.setVisible(true);
    }//GEN-LAST:event_ExamenMenuItemActionPerformed

    private void ExamenParMatiereMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamenParMatiereMenuItemActionPerformed
        ExamenParMatiereForm epm;
        epm = new ExamenParMatiereForm();
        desktopPane.add(epm);
      epm.setVisible(true);
    }//GEN-LAST:event_ExamenParMatiereMenuItemActionPerformed

    private void EtudiantParExamenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EtudiantParExamenMenuItemActionPerformed
     EtudiantParExamenForm epe;
      epe = new EtudiantParExamenForm();
        desktopPane.add(epe);
      epe.setVisible(true);
    }//GEN-LAST:event_EtudiantParExamenMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EtudiantParExamenMenuItem;
    private javax.swing.JMenuItem ExamenMenuItem;
    private javax.swing.JMenuItem ExamenParMatiereMenuItem;
    private javax.swing.JMenuItem InscriptionMenuItem;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem etudiantMenuEtudiant;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
