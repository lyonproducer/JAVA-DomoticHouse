/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.domotica;

import java.applet.AudioClip;
import java.awt.Toolkit;

/**
 *
 * @author Leo Family
 */
public class Main_Pasillo extends javax.swing.JFrame {

    public Main_Pasillo() {
        initComponents();
        this.setTitle("Pasillo");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        setIcon();
    }

    AudioClip Click = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse.wav"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        Boton_Atras = new javax.swing.JButton();
        Vista_pasillo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen_principal/proyecto Pasillo.jpg"))); // NOI18N

        Boton_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 1.png"))); // NOI18N
        Boton_Atras.setToolTipText("Volver a la vista principal");
        Boton_Atras.setContentAreaFilled(false);
        Boton_Atras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 3.png"))); // NOI18N
        Boton_Atras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 2.png"))); // NOI18N
        Boton_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AtrasActionPerformed(evt);
            }
        });

        Vista_pasillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton vista 1.png"))); // NOI18N
        Vista_pasillo.setToolTipText("Zoom");
        Vista_pasillo.setContentAreaFilled(false);
        Vista_pasillo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton vista 3.png"))); // NOI18N
        Vista_pasillo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton vista 2.png"))); // NOI18N
        Vista_pasillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vista_pasilloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(Vista_pasillo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(Boton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(406, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton_Atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vista_pasillo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AtrasActionPerformed
        Click.play();
        dispose();
        Vista_Principal obj = new Vista_Principal();
        obj.setVisible(true);
    }//GEN-LAST:event_Boton_AtrasActionPerformed

    private void Vista_pasilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vista_pasilloActionPerformed
        Click.play();
        Pasillo_interno pi = new Pasillo_interno();
        pi.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_Vista_pasilloActionPerformed

    
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
            java.util.logging.Logger.getLogger(Main_Pasillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Pasillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Pasillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Pasillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Pasillo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Atras;
    private javax.swing.JButton Vista_pasillo;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_icon.png")));
    }

}
