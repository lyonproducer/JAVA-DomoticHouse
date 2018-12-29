
package proyecto.domotica;

import java.applet.AudioClip;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Temperatura extends javax.swing.JFrame {

    private int numClicks=20;

    public Temperatura() {
        initComponents();
        
        this.setTitle("Temperatura");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIcon();
    }
    
    AudioClip Click2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Mouse2.wav"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        BotonMenos = new javax.swing.JButton();
        BotonMas = new javax.swing.JButton();
        Temp = new javax.swing.JLabel();
        medidor = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/Temperatura.jpg"))); // NOI18N

        BotonMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/boton menos.png"))); // NOI18N
        BotonMenos.setContentAreaFilled(false);
        BotonMenos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/boton menos 3.png"))); // NOI18N
        BotonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosActionPerformed(evt);
            }
        });

        BotonMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/boton mas.png"))); // NOI18N
        BotonMas.setContentAreaFilled(false);
        BotonMas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/boton menos3.png"))); // NOI18N
        BotonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMasActionPerformed(evt);
            }
        });

        Temp.setFont(new java.awt.Font("Dialog", 0, 60)); // NOI18N
        Temp.setForeground(new java.awt.Color(255, 255, 255));
        Temp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Temp.setText("20°C");

        medidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accesorios/dibujo temp.png"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(medidor)
                        .addGap(18, 18, 18)
                        .addComponent(Temp, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(medidor, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(Temp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosActionPerformed
        Click2.play();
        numClicks--;
        Temp.setText(String.valueOf(numClicks + "°C"));
        Temp.setForeground(new java.awt.Color(255, 255, 255));

        if(numClicks==-9){
            numClicks=20;
        }
        if(numClicks<33 && numClicks>=-9){

            medidor.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/Accesorios/dibujo-temp-azul_2.gif")));
        }else 
            medidor.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/Accesorios/dibujo-temp-rojo_2.gif")));
    }//GEN-LAST:event_BotonMenosActionPerformed

    private void BotonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMasActionPerformed
        Click2.play();
        numClicks++;
        Temp.setText(String.valueOf(numClicks + "°C"));
        Temp.setForeground(new java.awt.Color(255, 255, 255));
        if(numClicks==50){
            numClicks=20;// se reinicia el contador  
        }
        if(numClicks>33 && numClicks<=50){
            medidor.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/Accesorios/dibujo-temp-rojo_2.gif")));
        }else
            medidor.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/Accesorios/dibujo-temp-azul_2.gif")));
    }//GEN-LAST:event_BotonMasActionPerformed

    
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
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temperatura().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonMas;
    private javax.swing.JButton BotonMenos;
    private javax.swing.JLabel Temp;
    private javax.swing.JTextField jTextField1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JLabel medidor;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/temp icon.png")));
    }

    
}
