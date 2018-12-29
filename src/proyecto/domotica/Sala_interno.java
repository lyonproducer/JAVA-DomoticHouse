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
public class Sala_interno extends javax.swing.JFrame {

    
    
    public Sala_interno() {
        initComponents();
        
        
        
        this.setTitle("Sala");
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        
        setIcon();
        //Reproductor_boton.setSelected(true);
        
        Label_TV.setVisible(false);
        //Label_TV.setIcon(null);
        
    }

    AudioClip Click = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse.wav"));
    AudioClip Click2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse2.wav"));
    AudioClip Champion = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/champions.wav"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        Atras_sala_interno = new javax.swing.JButton();
        Label_TV = new javax.swing.JLabel();
        Prende_tv = new javax.swing.JToggleButton();
        Boton_pasillo = new javax.swing.JButton();
        Alarma_Boton = new javax.swing.JToggleButton();
        Reproductor_boton = new javax.swing.JToggleButton();
        BotonLuz = new javax.swing.JToggleButton();
        BombilloSala = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(720, 520));

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen_principal/sala adentro.jpg"))); // NOI18N
        jcMousePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Atras_sala_interno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 1.png"))); // NOI18N
        Atras_sala_interno.setToolTipText("Volver a la vista principal");
        Atras_sala_interno.setContentAreaFilled(false);
        Atras_sala_interno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 3.png"))); // NOI18N
        Atras_sala_interno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 2.png"))); // NOI18N
        Atras_sala_interno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras_sala_internoActionPerformed(evt);
            }
        });
        jcMousePanel1.add(Atras_sala_interno, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 411, 135, -1));

        Label_TV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_TV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Champions.gif"))); // NOI18N
        jcMousePanel1.add(Label_TV, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 27, 250, 149));

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
        jcMousePanel1.add(Prende_tv, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 420, 91, 77));

        Boton_pasillo.setContentAreaFilled(false);
        Boton_pasillo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/puerta SALA-PASILLO.png"))); // NOI18N
        Boton_pasillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_pasilloActionPerformed(evt);
            }
        });
        jcMousePanel1.add(Boton_pasillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 53, 120, 169));

        Alarma_Boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Alarma 1.png"))); // NOI18N
        Alarma_Boton.setToolTipText("Alarma");
        Alarma_Boton.setContentAreaFilled(false);
        Alarma_Boton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Alarma 3.png"))); // NOI18N
        Alarma_Boton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Alarma 2.png"))); // NOI18N
        Alarma_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alarma_BotonActionPerformed(evt);
            }
        });
        jcMousePanel1.add(Alarma_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 88, 77));

        Reproductor_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton reproductor.png"))); // NOI18N
        Reproductor_boton.setToolTipText("prender/apagar reproductor");
        Reproductor_boton.setContentAreaFilled(false);
        Reproductor_boton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton reproductor2.png"))); // NOI18N
        Reproductor_boton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton reproductor3.png"))); // NOI18N
        Reproductor_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reproductor_botonActionPerformed(evt);
            }
        });
        jcMousePanel1.add(Reproductor_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 420, 85, 77));

        BotonLuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 1.png"))); // NOI18N
        BotonLuz.setToolTipText("Luces");
        BotonLuz.setContentAreaFilled(false);
        BotonLuz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 2.png"))); // NOI18N
        BotonLuz.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 3.png"))); // NOI18N
        BotonLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLuzActionPerformed(evt);
            }
        });
        jcMousePanel1.add(BotonLuz, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 422, 84, 73));

        BombilloSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Bombillo sala.png"))); // NOI18N
        jcMousePanel1.add(BombilloSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 0, -1, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Atras_sala_internoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras_sala_internoActionPerformed
        Click.play();
        dispose();
        
        Vista_Principal vp = new Vista_Principal();
        vp.setVisible(true);
        
        if(TV==true){
            
            Champion.stop();
        }
        
    }//GEN-LAST:event_Atras_sala_internoActionPerformed

    private void Prende_tvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prende_tvActionPerformed
        Click2.play();
        
        if (TV == false){
            Champion.play();
            TV = true;          
            Label_TV.setVisible(true);
            
            //Label_TV.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/accesorios/Champions.gif")));
            
        }else{
            Champion.stop();
            TV = false;
            //Label_TV.setIcon(null);
            Label_TV.setVisible(false);
        }
        
    }//GEN-LAST:event_Prende_tvActionPerformed

    private void Boton_pasilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_pasilloActionPerformed
        Click.play();        
        Pasillo_interno pi = new Pasillo_interno();
        
        pi.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_Boton_pasilloActionPerformed

    private void Alarma_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alarma_BotonActionPerformed
        Click2.play();
       
       
        if (Alarm == false){
            
       Alarm=true;
       
       //AudioClip Alarma;
       
       //Alarma = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Alarma.wav"));
       Alarma.play();
     
        }else{
      
       Alarm=false;
       //AudioClip Alarma;
       
       //Alarma = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Alarma.wav"));
       Alarma.stop();
       
        }
        
    }//GEN-LAST:event_Alarma_BotonActionPerformed

    private void Reproductor_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reproductor_botonActionPerformed
        
        Click2.play();
        if(Reprod==false){

            Reprod=true;
            reproductor.setVisible(true);
        }
        else{
            Reprod=false;
            reproductor.dispose();
        }
        
    }//GEN-LAST:event_Reproductor_botonActionPerformed

    private void BotonLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLuzActionPerformed
        Click2.play();
        if(Bombillo==false){
            Bombillo=true;
            BombilloSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Bombillo sala prendido.png")));
            
        }else{
            Bombillo=false;
            BombilloSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Bombillo sala.png")));
    }
        
    }//GEN-LAST:event_BotonLuzActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(Sala_interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sala_interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sala_interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sala_interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sala_interno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Alarma_Boton;
    private javax.swing.JButton Atras_sala_interno;
    private javax.swing.JLabel BombilloSala;
    private javax.swing.JToggleButton BotonLuz;
    private javax.swing.JButton Boton_pasillo;
    private javax.swing.JLabel Label_TV;
    private javax.swing.JToggleButton Prende_tv;
    private javax.swing.JToggleButton Reproductor_boton;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables
    
    Musica reproductor = new Musica();
    private boolean TV = false;
    private boolean Alarm = false;
    private boolean Reprod = false;
    private boolean Bombillo = false;
    
    AudioClip Alarma = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Alarma.wav"));
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_icon.png")));
    }
}
