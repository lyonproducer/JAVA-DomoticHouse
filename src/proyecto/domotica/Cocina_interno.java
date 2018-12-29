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
public class Cocina_interno extends javax.swing.JFrame {

    /**
     * Creates new form Cocina_interno
     */
    public Cocina_interno() {
        initComponents();
   
        this.setTitle("Cocina");
        this.setLocationRelativeTo(null);
        
        estufa.setVisible(false);
        microondas.setVisible(false);
        setIcon();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        Atras_Cocina = new javax.swing.JButton();
        LucesCocina = new javax.swing.JLabel();
        microondas = new javax.swing.JLabel();
        estufa = new javax.swing.JLabel();
        encender_microondas1 = new javax.swing.JToggleButton();
        encender_cocina = new javax.swing.JToggleButton();
        BotonLuces = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(720, 520));

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen_principal/cocina interna.jpg"))); // NOI18N
        jcMousePanel1.setPreferredSize(new java.awt.Dimension(720, 520));
        jcMousePanel1.setLayout(null);

        Atras_Cocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 1.png"))); // NOI18N
        Atras_Cocina.setToolTipText("Volver a la vista principal");
        Atras_Cocina.setContentAreaFilled(false);
        Atras_Cocina.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 3.png"))); // NOI18N
        Atras_Cocina.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 2.png"))); // NOI18N
        Atras_Cocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras_CocinaActionPerformed(evt);
            }
        });
        jcMousePanel1.add(Atras_Cocina);
        Atras_Cocina.setBounds(560, 416, 150, 110);

        LucesCocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/bombillo cocina apagado.png"))); // NOI18N
        jcMousePanel1.add(LucesCocina);
        LucesCocina.setBounds(408, 86, 43, 76);

        microondas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/microondas.gif"))); // NOI18N
        jcMousePanel1.add(microondas);
        microondas.setBounds(360, 150, 32, 32);

        estufa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estufa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/cocina.gif"))); // NOI18N
        jcMousePanel1.add(estufa);
        estufa.setBounds(310, 190, 20, 60);

        encender_microondas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton microondas.png"))); // NOI18N
        encender_microondas1.setToolTipText("Activar/Apagar microondas");
        encender_microondas1.setContentAreaFilled(false);
        encender_microondas1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton microondas2.png"))); // NOI18N
        encender_microondas1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton microondas3.png"))); // NOI18N
        encender_microondas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encender_microondas1ActionPerformed(evt);
            }
        });
        jcMousePanel1.add(encender_microondas1);
        encender_microondas1.setBounds(210, 420, 94, 103);

        encender_cocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton cocina.png"))); // NOI18N
        encender_cocina.setToolTipText("Prender/Apagar Cocina");
        encender_cocina.setContentAreaFilled(false);
        encender_cocina.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton cocina2.png"))); // NOI18N
        encender_cocina.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton cocina3.png"))); // NOI18N
        encender_cocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encender_cocinaActionPerformed(evt);
            }
        });
        jcMousePanel1.add(encender_cocina);
        encender_cocina.setBounds(310, 420, 94, 103);

        BotonLuces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 1.png"))); // NOI18N
        BotonLuces.setToolTipText("Luces");
        BotonLuces.setContentAreaFilled(false);
        BotonLuces.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 2.png"))); // NOI18N
        BotonLuces.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Luz 3.png"))); // NOI18N
        BotonLuces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLucesActionPerformed(evt);
            }
        });
        jcMousePanel1.add(BotonLuces);
        BotonLuces.setBounds(410, 420, 87, 103);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonLucesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLucesActionPerformed
        Click2.play();
           if(Luces==false){
            Luces=true;
            LucesCocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/bombillo cocina ON.png")));
        }else{
            Luces=false;
            LucesCocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/bombillo cocina apagado.png")));
    }
    }//GEN-LAST:event_BotonLucesActionPerformed

    private void encender_microondas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encender_microondas1ActionPerformed
        
        Click2.play();
        if(microondas_activo==false){
            microondas_activo=true;
            microondas.setVisible(true);
            Mic.play();
        }
        else{
            microondas_activo=false;
            microondas.setVisible(false);
            Mic.stop();
        }
    }//GEN-LAST:event_encender_microondas1ActionPerformed

    private void encender_cocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encender_cocinaActionPerformed
        Click2.play();
        
        if(estufa_encendida==false){
            estufa_encendida=true;
            estufa.setVisible(true);
            Kitchen.play();
        }
        else{
            estufa_encendida=false;
            estufa.setVisible(false);
        }
    }//GEN-LAST:event_encender_cocinaActionPerformed

    private void Atras_CocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras_CocinaActionPerformed
        Click.play();
        
        Vista_Principal vp = new Vista_Principal();

        vp.setVisible(true);

        dispose();

    }//GEN-LAST:event_Atras_CocinaActionPerformed
    public boolean microondas_activo=false;
    public boolean estufa_encendida=false;
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
            java.util.logging.Logger.getLogger(Cocina_interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cocina_interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cocina_interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cocina_interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cocina_interno().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras_Cocina;
    private javax.swing.JToggleButton BotonLuces;
    private javax.swing.JLabel LucesCocina;
    private javax.swing.JToggleButton encender_cocina;
    private javax.swing.JToggleButton encender_microondas1;
    private javax.swing.JLabel estufa;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JLabel microondas;
    // End of variables declaration//GEN-END:variables
    
    AudioClip Click = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse.wav"));
    AudioClip Click2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse2.wav"));
    AudioClip Kitchen = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Microondas.wav"));
    AudioClip Mic = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Micro 2.wav"));
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_icon.png")));
        
    }
}