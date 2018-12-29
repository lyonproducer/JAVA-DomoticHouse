
package proyecto.domotica;

import java.applet.AudioClip;
import java.awt.Toolkit;


public class Garage_Interno extends javax.swing.JFrame {

    
    public Garage_Interno() {
        initComponents();
        
        this.setTitle("Garage");
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        
        setIcon();
        
    }

    AudioClip Carro = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Car Sound.wav"));
    AudioClip Click2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse2.wav"));
    AudioClip Click = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse.wav"));
    
    public boolean Luces=false;
    public boolean Car=false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        Atras_garage_in = new javax.swing.JButton();
        BotonLuces = new javax.swing.JToggleButton();
        LucesGarage = new javax.swing.JLabel();
        BotonCarro = new javax.swing.JButton();
        CarON = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(720, 520));

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen_principal/Garage dentro.jpg"))); // NOI18N

        Atras_garage_in.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 1.png"))); // NOI18N
        Atras_garage_in.setToolTipText("Volver a la vista principal");
        Atras_garage_in.setContentAreaFilled(false);
        Atras_garage_in.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 3.png"))); // NOI18N
        Atras_garage_in.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Boton_Atras Nuevo 2.png"))); // NOI18N
        Atras_garage_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras_garage_inActionPerformed(evt);
            }
        });

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

        LucesGarage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LucesGarage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/luces garage.png"))); // NOI18N

        BotonCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Carro 1.png"))); // NOI18N
        BotonCarro.setToolTipText("Encender/Apagar vehículo");
        BotonCarro.setContentAreaFilled(false);
        BotonCarro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Carro 2.png"))); // NOI18N
        BotonCarro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton Carro 3.png"))); // NOI18N
        BotonCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCarroActionPerformed(evt);
            }
        });

        CarON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Carro OFF.jpg"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(BotonLuces, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(Atras_garage_in, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(CarON, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(LucesGarage, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LucesGarage, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(CarON, javax.swing.GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)))
                .addGap(213, 213, 213)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Atras_garage_in, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonCarro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonLuces, javax.swing.GroupLayout.Alignment.TRAILING))
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

        jcMousePanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Atras_garage_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras_garage_inActionPerformed
        Click.play();
        dispose();
        
        Vista_Principal obj = new Vista_Principal();
                
        obj.setVisible(true);
        
    }//GEN-LAST:event_Atras_garage_inActionPerformed

    private void BotonLucesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLucesActionPerformed
        Click2.play();
        if(Luces==false){
            Luces=true;
            LucesGarage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/luces garage ON.png")));
        }else{
            Luces=false;
            LucesGarage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/luces garage.png")));
    }
        
    }//GEN-LAST:event_BotonLucesActionPerformed

    private void BotonCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCarroActionPerformed
       Click2.play();
       Car=!Car;
       
       
        if (Car == false){
            //Carro.play();
            //Car=true;
            Carro.stop();
            CarON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Carro OFF.jpg")));
            //CarON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Carro-move.gif")));
            
            
        }else{
            Carro.play();
            //Car=false;
            CarON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Carro-move.gif")));
            //CarON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Carro OFF.jpg")));
            //Carro.stop();
        }
    }//GEN-LAST:event_BotonCarroActionPerformed

    
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
            java.util.logging.Logger.getLogger(Garage_Interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Garage_Interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Garage_Interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Garage_Interno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Garage_Interno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras_garage_in;
    private javax.swing.JButton BotonCarro;
    private javax.swing.JToggleButton BotonLuces;
    private javax.swing.JLabel CarON;
    private javax.swing.JLabel LucesGarage;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables

    
    
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_icon.png")));
    }


}
