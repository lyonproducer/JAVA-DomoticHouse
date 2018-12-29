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
public class Porche extends javax.swing.JFrame {

    /**
     * Creates new form Porche
     */
    public Porche() {
        initComponents();
        
        this.setTitle("Porche");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        setIcon();
    }

    AudioClip Click = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse.wav"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_porche = new jcMousePanel.jcMousePanel();
        Atras_Porche = new javax.swing.JButton();
        Luces = new javax.swing.JLabel();
        BotonLuces = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_porche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen_principal/porche interno.jpg"))); // NOI18N

        Atras_Porche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 1.png"))); // NOI18N
        Atras_Porche.setContentAreaFilled(false);
        Atras_Porche.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 3.png"))); // NOI18N
        Atras_Porche.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 2.png"))); // NOI18N
        Atras_Porche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras_PorcheActionPerformed(evt);
            }
        });

        BotonLuces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 1.png"))); // NOI18N
        BotonLuces.setContentAreaFilled(false);
        BotonLuces.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 2.png"))); // NOI18N
        BotonLuces.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 3.png"))); // NOI18N
        BotonLuces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLucesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_porcheLayout = new javax.swing.GroupLayout(Panel_porche);
        Panel_porche.setLayout(Panel_porcheLayout);
        Panel_porcheLayout.setHorizontalGroup(
            Panel_porcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_porcheLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(BotonLuces, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Atras_Porche, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_porcheLayout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(Luces, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        Panel_porcheLayout.setVerticalGroup(
            Panel_porcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_porcheLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(Luces, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(Panel_porcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Atras_Porche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonLuces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_porche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_porche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Atras_PorcheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras_PorcheActionPerformed
        Click.play();
        dispose();
        
        Vista_Principal vp = new Vista_Principal();
        vp.setVisible(true);        
    }//GEN-LAST:event_Atras_PorcheActionPerformed

    private void BotonLucesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLucesActionPerformed
         Click.play();         
        if (Luz == false){
            
            Luz = true;          
            //Label_TV.setVisible(true);
            
            Luces.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/Accesorios/Luces porche.png")));
            
        }else{
            
            Luz = false;
            Luces.setIcon(null);
        }
        
    }//GEN-LAST:event_BotonLucesActionPerformed

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
            java.util.logging.Logger.getLogger(Porche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Porche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Porche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Porche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Porche().setVisible(true);
            }
        });
    }
    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_icon.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras_Porche;
    private javax.swing.JToggleButton BotonLuces;
    private javax.swing.JLabel Luces;
    private jcMousePanel.jcMousePanel Panel_porche;
    // End of variables declaration//GEN-END:variables
    private boolean Luz = false;


}
