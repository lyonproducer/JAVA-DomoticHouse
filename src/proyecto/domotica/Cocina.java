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
public class Cocina extends javax.swing.JFrame {
    public Cocina() {
        initComponents();
        
        this.setTitle("Cocina");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        setIcon();
        
    }
    
    
    AudioClip Click = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse.wav"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        Atras_cocina = new javax.swing.JButton();
        Vista_cocina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen_principal/cocina arriba.jpg"))); // NOI18N

        Atras_cocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 1.png"))); // NOI18N
        Atras_cocina.setToolTipText("Volver a la vista principal");
        Atras_cocina.setContentAreaFilled(false);
        Atras_cocina.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 3.png"))); // NOI18N
        Atras_cocina.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 2.png"))); // NOI18N
        Atras_cocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras_cocinaActionPerformed(evt);
            }
        });

        Vista_cocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton vista 1.png"))); // NOI18N
        Vista_cocina.setToolTipText("Zoom");
        Vista_cocina.setContentAreaFilled(false);
        Vista_cocina.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton vista 3.png"))); // NOI18N
        Vista_cocina.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton vista 2.png"))); // NOI18N
        Vista_cocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vista_cocinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(Vista_cocina, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(Atras_cocina, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(406, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Atras_cocina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vista_cocina, javax.swing.GroupLayout.Alignment.TRAILING))
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

    private void Atras_cocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras_cocinaActionPerformed
        
        Click.play();
        dispose();
        
        Vista_Principal vp = new Vista_Principal();
        
        vp.setVisible(true);
        
    }//GEN-LAST:event_Atras_cocinaActionPerformed

    private void Vista_cocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vista_cocinaActionPerformed
        Click.play();
        dispose();
        
        Cocina_interno ci = new Cocina_interno();
        
        ci.setVisible(true);
        
    }//GEN-LAST:event_Vista_cocinaActionPerformed

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
            java.util.logging.Logger.getLogger(Cocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cocina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras_cocina;
    private javax.swing.JButton Vista_cocina;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_icon.png")));
    }
}
