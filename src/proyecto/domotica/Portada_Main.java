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
public class Portada_Main extends javax.swing.JFrame {

   
    public Portada_Main() {
        initComponents();
        
        this.setTitle("Domotic House");
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        
        
        
        setIcon();
    }

    AudioClip Timbre = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/timbre .wav"));
    AudioClip Click = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse.wav"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        Comnzar = new javax.swing.JButton();
        Salir_main = new javax.swing.JButton();
        Logo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen_principal/Main_portada.jpg"))); // NOI18N

        Comnzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Comenzar 1.png"))); // NOI18N
        Comnzar.setContentAreaFilled(false);
        Comnzar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Comenzar 3.png"))); // NOI18N
        Comnzar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Comenzar 2.png"))); // NOI18N
        Comnzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComnzarActionPerformed(evt);
            }
        });

        Salir_main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_salir_main 1.png"))); // NOI18N
        Salir_main.setContentAreaFilled(false);
        Salir_main.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_salir_main 3.png"))); // NOI18N
        Salir_main.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_salir_main 2.png"))); // NOI18N
        Salir_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_mainActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Logo_Main OFF.png"))); // NOI18N
        Logo.setContentAreaFilled(false);
        Logo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Logo_Main OFF.png"))); // NOI18N
        Logo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Logo_Main ON.png"))); // NOI18N
        Logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Salir_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Comnzar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Comnzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir_main)
                .addGap(75, 75, 75))
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

    private void ComnzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComnzarActionPerformed
        
        Vista_Principal vp = new Vista_Principal();
        vp.setVisible(true);
        dispose();
        Click.play();
    }//GEN-LAST:event_ComnzarActionPerformed

    private void Salir_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_mainActionPerformed
        Click.play();
        System.exit(0);
        
    }//GEN-LAST:event_Salir_mainActionPerformed

    private void LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoActionPerformed
        Timbre.play();
    }//GEN-LAST:event_LogoActionPerformed

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
            java.util.logging.Logger.getLogger(Portada_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Portada_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Portada_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Portada_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portada_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comnzar;
    private javax.swing.JButton Logo;
    private javax.swing.JButton Salir_main;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_icon.png")));
    }
}
