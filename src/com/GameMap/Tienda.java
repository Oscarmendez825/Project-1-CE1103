/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GameMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Tienda extends javax.swing.JFrame {

    /**
     * Creates new form Tienda
     */
    JLabel monedalbl;
    JLabel estrellalbl;
    public Tienda() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/com/ImagesSelec/gamelogo.png")).getImage());
    }
    public Tienda(JLabel monedalbl, JLabel estrellalbl){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(0);
        this.monedalbl = monedalbl;
        this.estrellalbl = estrellalbl;
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/com/ImagesSelec/gamelogo.png")).getImage());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        op2 = new javax.swing.JButton();
        op3 = new javax.swing.JButton();
        op4 = new javax.swing.JButton();
        op5 = new javax.swing.JButton();
        op1 = new javax.swing.JButton();
        continuar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Orbitron", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIENDA DATOS PARTY");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 410, 39));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/estrella (1).gif"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 50));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/estrella (1).gif"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, 50));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/estrella (1).gif"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, 50));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/estrella (1).gif"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 50, 50));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/estrella (1).gif"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 50));

        jLabel2.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1 ESTRELLAS X 2 MONEDAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 210, 30));

        jLabel3.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("10 ESTRELLAS X 14 MONEDAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 210, 30));

        jLabel4.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("3 ESTRELLAS X 5 MONEDAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 210, 30));

        jLabel5.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("7 ESTRELLAS X 10 MONEDAS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 210, 30));

        jLabel11.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("20 ESTRELLAS X 22 MONEDAS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 230, 30));

        op2.setBackground(new java.awt.Color(0, 0, 0));
        op2.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        op2.setForeground(new java.awt.Color(255, 255, 255));
        op2.setText("COMPRAR");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });
        getContentPane().add(op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        op3.setBackground(new java.awt.Color(0, 0, 0));
        op3.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        op3.setForeground(new java.awt.Color(255, 255, 255));
        op3.setText("COMPRAR");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });
        getContentPane().add(op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        op4.setBackground(new java.awt.Color(0, 0, 0));
        op4.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        op4.setForeground(new java.awt.Color(255, 255, 255));
        op4.setText("COMPRAR");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });
        getContentPane().add(op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        op5.setBackground(new java.awt.Color(0, 0, 0));
        op5.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        op5.setForeground(new java.awt.Color(255, 255, 255));
        op5.setText("COMPRAR");
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });
        getContentPane().add(op5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        op1.setBackground(new java.awt.Color(0, 0, 0));
        op1.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        op1.setForeground(new java.awt.Color(255, 255, 255));
        op1.setText("COMPRAR");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });
        getContentPane().add(op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        continuar.setBackground(new java.awt.Color(0, 0, 0));
        continuar.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        continuar.setForeground(new java.awt.Color(255, 255, 255));
        continuar.setText("CONTINUAR");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        getContentPane().add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        // TODO add your handling code here:
        comprar(1);
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        // TODO add your handling code here:
        comprar(2);
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        // TODO add your handling code here:
        comprar(3);
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        // TODO add your handling code here:
        comprar(4);
    }//GEN-LAST:event_op4ActionPerformed

    private void op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op5ActionPerformed
        // TODO add your handling code here:
        comprar(5);
    }//GEN-LAST:event_op5ActionPerformed

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_continuarActionPerformed
    public void comprar(int opcion){
        switch (opcion) {
            case 1:
                if (MapTablero.monedas>=2){
                    MapTablero.monedas-=2;
                    MapTablero.estrellas+=1;
                    monedalbl.setText(""+MapTablero.monedas);
                    estrellalbl.setText(""+MapTablero.estrellas);
                    break;
                    
                }else{
                    JOptionPane.showMessageDialog(null, "No tiene monedas suficientes");
                    break;
                }
            case 2:
                if (MapTablero.monedas>=5){
                    MapTablero.monedas-=5;
                    MapTablero.estrellas+=3;
                    monedalbl.setText(""+MapTablero.monedas);
                    estrellalbl.setText(""+MapTablero.estrellas);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "No tiene monedas suficientes");
                    break;
                }
                
            case 3:
                if (MapTablero.monedas>=10){
                    MapTablero.monedas-=10;
                    MapTablero.estrellas+=7;
                    monedalbl.setText(""+MapTablero.monedas);
                    estrellalbl.setText(""+MapTablero.estrellas);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "No tiene monedas suficientes");
                    break;
                }
            case 4:
                if (MapTablero.monedas>=14){
                    MapTablero.monedas-=14;
                    MapTablero.estrellas+=10;
                    monedalbl.setText(""+MapTablero.monedas);
                    estrellalbl.setText(""+MapTablero.estrellas);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "No tiene monedas suficientes");
                    break;
                }
            case 5:
                if (MapTablero.monedas>=22){
                    MapTablero.monedas-=22;
                    MapTablero.estrellas+=20;
                    monedalbl.setText(""+MapTablero.monedas);
                    estrellalbl.setText(""+MapTablero.estrellas);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "No tiene monedas suficientes");
                    break;
                }
            default:
                break;
    
    
    }}
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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton op1;
    private javax.swing.JButton op2;
    private javax.swing.JButton op3;
    private javax.swing.JButton op4;
    private javax.swing.JButton op5;
    // End of variables declaration//GEN-END:variables
}
