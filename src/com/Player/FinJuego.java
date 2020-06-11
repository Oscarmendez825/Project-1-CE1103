/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Player;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * FinJuego class
 * @author Oscar Méndez
 * @author Marco Picado
 * @author Keyner Gómez 
 * @author Hansel Hampton
 * @version 1.1
 * @since 2020
 */
public class FinJuego extends javax.swing.JFrame {

    /**
     * Creates new form FinJuego
     */
    File archivo;
    FileWriter escribir;
    PrintWriter linea;
    
    /***
     * Método Constructor
     */
    public FinJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
        setValores();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        J3 = new javax.swing.JLabel();
        J2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        J4 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        M4 = new javax.swing.JLabel();
        M3 = new javax.swing.JLabel();
        M1 = new javax.swing.JLabel();
        M2 = new javax.swing.JLabel();
        J1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        J3.setBackground(new java.awt.Color(102, 102, 0));
        J3.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        J3.setForeground(new java.awt.Color(255, 255, 255));
        J3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J3.setOpaque(true);
        jPanel1.add(J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 321, 312, 50));

        J2.setBackground(new java.awt.Color(102, 102, 0));
        J2.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        J2.setForeground(new java.awt.Color(255, 255, 255));
        J2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J2.setOpaque(true);
        jPanel1.add(J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 228, 312, 50));

        jLabel3.setBackground(new java.awt.Color(102, 102, 0));
        jLabel3.setFont(new java.awt.Font("Orbitron", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FIN DEL JUEGO");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 650, 60));

        J4.setBackground(new java.awt.Color(102, 102, 0));
        J4.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        J4.setForeground(new java.awt.Color(255, 255, 255));
        J4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J4.setOpaque(true);
        jPanel1.add(J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 414, 312, 50));

        E1.setBackground(new java.awt.Color(102, 102, 0));
        E1.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        E1.setForeground(new java.awt.Color(255, 255, 255));
        E1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E1.setOpaque(true);
        jPanel1.add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 120, 50));

        E2.setBackground(new java.awt.Color(102, 102, 0));
        E2.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        E2.setForeground(new java.awt.Color(255, 255, 255));
        E2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E2.setOpaque(true);
        jPanel1.add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 120, 50));

        E3.setBackground(new java.awt.Color(102, 102, 0));
        E3.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        E3.setForeground(new java.awt.Color(255, 255, 255));
        E3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E3.setOpaque(true);
        jPanel1.add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 120, 50));

        E4.setBackground(new java.awt.Color(102, 102, 0));
        E4.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        E4.setForeground(new java.awt.Color(255, 255, 255));
        E4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E4.setOpaque(true);
        jPanel1.add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 120, 50));

        M4.setBackground(new java.awt.Color(102, 102, 0));
        M4.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        M4.setForeground(new java.awt.Color(255, 255, 255));
        M4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M4.setOpaque(true);
        jPanel1.add(M4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 120, 50));

        M3.setBackground(new java.awt.Color(102, 102, 0));
        M3.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        M3.setForeground(new java.awt.Color(255, 255, 255));
        M3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M3.setOpaque(true);
        jPanel1.add(M3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 120, 50));

        M1.setBackground(new java.awt.Color(102, 102, 0));
        M1.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        M1.setForeground(new java.awt.Color(255, 255, 255));
        M1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M1.setOpaque(true);
        jPanel1.add(M1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 120, 50));

        M2.setBackground(new java.awt.Color(102, 102, 0));
        M2.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        M2.setForeground(new java.awt.Color(255, 255, 255));
        M2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M2.setOpaque(true);
        jPanel1.add(M2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 120, 50));

        J1.setBackground(new java.awt.Color(102, 102, 0));
        J1.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        J1.setForeground(new java.awt.Color(255, 255, 255));
        J1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J1.setOpaque(true);
        jPanel1.add(J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 135, 312, 50));

        jLabel14.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ESTRELLAS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 150, 30));

        jLabel15.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("MONEDAS");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 130, 30));

        jLabel16.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("JUGADOR");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 250, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/gamelogo.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 200, 220));

        jButton1.setBackground(new java.awt.Color(102, 102, 0));
        jButton1.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /***
     * Método setValores 
     * Se encarga de desplegar los puntajes finales en pantalla
     */
    private void setValores(){
        switch (GameUser.getCantidad()) {
            case 2:
                J1.setText(GameUser.getName1());
                J2.setText(GameUser.getName2());
                E1.setText(Tablero.getEstrella1().getText());
                E2.setText(Tablero.getEstrella2().getText());
                M1.setText(Tablero.getMoneda1().getText());
                M2.setText(Tablero.getMoneda2().getText());
                break;
            case 3:
                J1.setText(GameUser.getName1());
                J2.setText(GameUser.getName2());
                J3.setText(GameUser.getName3());
                E1.setText(Tablero.getEstrella1().getText());
                E2.setText(Tablero.getEstrella2().getText());
                E3.setText(Tablero.getEstrella3().getText());
                M1.setText(Tablero.getMoneda1().getText());
                M2.setText(Tablero.getMoneda2().getText());
                M3.setText(Tablero.getMoneda3().getText());
                break;
            case 4:
                J1.setText(GameUser.getName1());
                J2.setText(GameUser.getName2());
                J3.setText(GameUser.getName3());
                J4.setText(GameUser.getName4());
                E1.setText(Tablero.getEstrella1().getText());
                E2.setText(Tablero.getEstrella2().getText());
                E3.setText(Tablero.getEstrella3().getText());
                E4.setText(Tablero.getEstrella4().getText());
                M1.setText(Tablero.getMoneda1().getText());
                M2.setText(Tablero.getMoneda2().getText());
                M3.setText(Tablero.getMoneda3().getText());
                M4.setText(Tablero.getMoneda4().getText());
                break;
            default:
                break;
        }
    }
    /***
     * Método Salir
     * Se encarga de cerrar el juego y de llamar al método escribirTXT
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escribirTXT();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    /***
     * Método escribirTXT
     * Se encarga de escribir todos los puntajes de los jugadores en un TXT
     */
    public void escribirTXT(){
        archivo = new File("PUNTAJES.txt");
        if (!archivo.exists()){
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                linea.println("DATOS PARTY PUNTUACIONES");
                switch (GameUser.getCantidad()) {
                    case 2:
                        linea.println(GameUser.getName1()+"---->ESTRELLAS----->"+Tablero.getEstrella1().getText()+"---->MONEDAS----->"+Tablero.getMoneda1().getText());
                        linea.println(GameUser.getName2()+"---->ESTRELLAS----->"+Tablero.getEstrella2().getText()+"---->MONEDAS----->"+Tablero.getMoneda2().getText());
                        break;
                    case 3:
                        linea.println(GameUser.getName1()+"---->ESTRELLAS----->"+Tablero.getEstrella1().getText()+"---->MONEDAS----->"+Tablero.getMoneda1().getText());
                        linea.println(GameUser.getName2()+"---->ESTRELLAS----->"+Tablero.getEstrella2().getText()+"---->MONEDAS----->"+Tablero.getMoneda2().getText());
                        linea.println(GameUser.getName3()+"---->ESTRELLAS----->"+Tablero.getEstrella3().getText()+"---->MONEDAS----->"+Tablero.getMoneda3().getText());
                        break;
                    case 4:
                        linea.println(GameUser.getName1()+"---->ESTRELLAS----->"+Tablero.getEstrella1().getText()+"---->MONEDAS----->"+Tablero.getMoneda1().getText());
                        linea.println(GameUser.getName2()+"---->ESTRELLAS----->"+Tablero.getEstrella2().getText()+"---->MONEDAS----->"+Tablero.getMoneda2().getText());
                        linea.println(GameUser.getName3()+"---->ESTRELLAS----->"+Tablero.getEstrella3().getText()+"---->MONEDAS----->"+Tablero.getMoneda3().getText());
                        linea.println(GameUser.getName4()+"---->ESTRELLAS----->"+Tablero.getEstrella4().getText()+"---->MONEDAS----->"+Tablero.getMoneda4().getText());
                        break;
                    default:
                        break;
                }
                
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(FinJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                linea.println("\nDATOS PARTY PUNTUACIONES");
                switch (GameUser.getCantidad()) {
                    case 2:
                        linea.println(GameUser.getName1()+"---->ESTRELLAS----->"+Tablero.getEstrella1().getText()+"---->MONEDAS----->"+Tablero.getMoneda1().getText());
                        linea.println(GameUser.getName2()+"---->ESTRELLAS----->"+Tablero.getEstrella2().getText()+"---->MONEDAS----->"+Tablero.getMoneda2().getText());
                        break;
                    case 3:
                        linea.println(GameUser.getName1()+"---->ESTRELLAS----->"+Tablero.getEstrella1().getText()+"---->MONEDAS----->"+Tablero.getMoneda1().getText());
                        linea.println(GameUser.getName2()+"---->ESTRELLAS----->"+Tablero.getEstrella2().getText()+"---->MONEDAS----->"+Tablero.getMoneda2().getText());
                        linea.println(GameUser.getName3()+"---->ESTRELLAS----->"+Tablero.getEstrella3().getText()+"---->MONEDAS----->"+Tablero.getMoneda3().getText());
                        break;
                    case 4:
                        linea.println(GameUser.getName1()+"---->ESTRELLAS----->"+Tablero.getEstrella1().getText()+"---->MONEDAS----->"+Tablero.getMoneda1().getText());
                        linea.println(GameUser.getName2()+"---->ESTRELLAS----->"+Tablero.getEstrella2().getText()+"---->MONEDAS----->"+Tablero.getMoneda2().getText());
                        linea.println(GameUser.getName3()+"---->ESTRELLAS----->"+Tablero.getEstrella3().getText()+"---->MONEDAS----->"+Tablero.getMoneda3().getText());
                        linea.println(GameUser.getName4()+"---->ESTRELLAS----->"+Tablero.getEstrella4().getText()+"---->MONEDAS----->"+Tablero.getMoneda4().getText());
                        break;
                    default:
                        break;
                }
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(FinJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
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
            java.util.logging.Logger.getLogger(FinJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel J1;
    private javax.swing.JLabel J2;
    private javax.swing.JLabel J3;
    private javax.swing.JLabel J4;
    private javax.swing.JLabel M1;
    private javax.swing.JLabel M2;
    private javax.swing.JLabel M3;
    private javax.swing.JLabel M4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
