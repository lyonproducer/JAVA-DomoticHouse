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
public class Cuarto_Interno extends javax.swing.JFrame {

    AudioClip Tronos = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Tronos.wav"));
    
    public Cuarto_Interno() {
        initComponents();
        
        this.setTitle("Cuarto");
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        //tv.setVisible(false);
        setIcon();
        
    }

    AudioClip Click = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse.wav"));
    AudioClip Click2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse2.wav"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        Atras_Cuarto = new javax.swing.JButton();
        Prende_tv = new javax.swing.JToggleButton();
        Boton_Bombillo = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        tv = new javax.swing.JLabel();
        BombilloCuarto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(720, 520));

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen_principal/Cuarto dentro.jpg"))); // NOI18N

        Atras_Cuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 1.png"))); // NOI18N
        Atras_Cuarto.setToolTipText("Volver a la vista principal");
        Atras_Cuarto.setContentAreaFilled(false);
        Atras_Cuarto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 3.png"))); // NOI18N
        Atras_Cuarto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 2.png"))); // NOI18N
        Atras_Cuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras_CuartoActionPerformed(evt);
            }
        });

        Prende_tv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton TV 1.png"))); // NOI18N
        Prende_tv.setToolTipText("Apagar/Prender TV");
        Prende_tv.setContentAreaFilled(false);
        Prende_tv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton TV 2.png"))); // NOI18N
        Prende_tv.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton TV 3.png"))); // NOI18N
        Prende_tv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prende_tvActionPerformed(evt);
            }
        });

        Boton_Bombillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 1.png"))); // NOI18N
        Boton_Bombillo.setToolTipText("Luces");
        Boton_Bombillo.setContentAreaFilled(false);
        Boton_Bombillo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 2.png"))); // NOI18N
        Boton_Bombillo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 3.png"))); // NOI18N
        Boton_Bombillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BombilloActionPerformed(evt);
            }
        });

        tv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        BombilloCuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Bombillo Cuarto.png"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(Prende_tv, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Bombillo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(Atras_Cuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(BombilloCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tv, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BombilloCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(tv, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Boton_Bombillo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prende_tv, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Atras_Cuarto))
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

    private void Atras_CuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras_CuartoActionPerformed
        
        Click.play();
        Vista_Principal vp = new Vista_Principal();
        
        vp.setVisible(true);
                
        dispose();
        
        if(tvencendida==true){
            Tronos.stop();
        }
    }//GEN-LAST:event_Atras_CuartoActionPerformed

    private void Prende_tvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prende_tvActionPerformed
        Click2.play();
        
        if(tvencendida==false){
            tvencendida=true;
            //tv.setVisible(true);
            Tronos.play();
            tv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/tv2.gif")));
        }
        else{
            tvencendida=false;
            //tv.setVisible(false);
            Tronos.stop();
            tv.setIcon(null);
        }
    }//GEN-LAST:event_Prende_tvActionPerformed

    private void Boton_BombilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BombilloActionPerformed
        Click2.play();
        if(Luces==false){
            Luces=true;
            BombilloCuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Bombillo Cuarto ON.png")));
            
        }else{
            Luces=false;
            BombilloCuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Bombillo Cuarto.png")));
    }
        
    }//GEN-LAST:event_Boton_BombilloActionPerformed
    
    public boolean tvencendida=false;
    public boolean Luces=false;
    
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
            java.util.logging.Logger.getLogger(Cuarto_Interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuarto_Interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuarto_Interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuarto_Interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuarto_Interno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras_Cuarto;
    private javax.swing.JLabel BombilloCuarto;
    private javax.swing.JToggleButton Boton_Bombillo;
    private javax.swing.JToggleButton Prende_tv;
    private javax.swing.JLabel jLabel1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JLabel tv;
    // End of variables declaration//GEN-END:variables
    
    
    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_icon.png")));
        
    }
}
