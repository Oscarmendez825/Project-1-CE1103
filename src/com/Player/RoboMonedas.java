/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Player;

/**
 *
 * @author oscar
 */
public class RoboMonedas extends javax.swing.JFrame {

    /**
     * Creates new form RoboMonedas
     */
    public RoboMonedas() {
        initComponents();
        this.setLocationRelativeTo(null);
        name1.setText(GameUser.getName1());
        name2.setText(GameUser.getName2());
        name3.setText(GameUser.getName3());
        name4.setText(GameUser.getName4());
        activarBotones();
    }
    private void activarBotones(){
        if (GameUser.getCantidad() == 2){
            boton3.setEnabled(false);
            boton4.setEnabled(false);
            
        }else if(GameUser.getCantidad() == 3){
            boton4.setEnabled(false);
        }
        activePlayer();
    }
    private void activePlayer(){
        switch (Evento.getJugador()) {
            case 1:
                boton1.setEnabled(false);
                break;
            case 2:
                boton2.setEnabled(false);
                break;
            case 3:
                boton3.setEnabled(false);
                break;
            case 4:
                boton4.setEnabled(false);
                break;
            default:
                break;
        }
    
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
        jPanel2 = new javax.swing.JPanel();
        name2 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name2.setBackground(new java.awt.Color(204, 0, 153));
        name2.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 255, 255));
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 90, 40));

        name1.setBackground(new java.awt.Color(204, 0, 153));
        name1.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 342, 90, 40));

        name3.setBackground(new java.awt.Color(204, 0, 153));
        name3.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 90, 40));

        name4.setBackground(new java.awt.Color(51, 51, 51));
        name4.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        name4.setForeground(new java.awt.Color(255, 255, 255));
        name4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 90, 40));

        jLabel5.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SELECCIONE AL JUGADOR QUE DESEA ROBARLE LAS MONEDAS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 470, 70));

        jLabel6.setFont(new java.awt.Font("Orbitron", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DATOS PARTY");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 420, 70));

        jLabel7.setFont(new java.awt.Font("Orbitron", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ROBO DE MONEDAS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 420, 70));

        boton2.setBackground(new java.awt.Color(51, 51, 51));
        boton2.setText("B");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        jPanel2.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        boton3.setBackground(new java.awt.Color(51, 51, 51));
        boton3.setText("C");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        jPanel2.add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        boton4.setBackground(new java.awt.Color(51, 51, 51));
        boton4.setText("D");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        jPanel2.add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        boton1.setBackground(new java.awt.Color(51, 51, 51));
        boton1.setText("A");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel2.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/rgb.gif"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        int monedas = Integer.parseInt(Tablero.getMoneda1().getText());
        int cantidad = Evento.getNumero(5);
        monedas = monedas-cantidad;
        Tablero.getMoneda1().setText(""+monedas);
        switch (Evento.getJugador()) {
            case 1:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda1().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda1().setText(""+monedas2);
                    break;
                }
            case 2:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda2().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda2().setText(""+monedas2);
                    break;
                }
            case 3:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda3().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda3().setText(""+monedas2);
                    break;
                }
            case 4:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda4().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda4().setText(""+monedas2);
                    break;
                }
            default:
                break;
        }
        this.setVisible(false);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        int monedas = Integer.parseInt(Tablero.getMoneda2().getText());
        int cantidad = Evento.getNumero(5);
        monedas = monedas-cantidad;
        Tablero.getMoneda1().setText(""+monedas);
        switch (Evento.getJugador()) {
            case 1:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda1().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda1().setText(""+monedas2);
                    break;
                }
            case 2:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda2().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda2().setText(""+monedas2);
                    break;
                }
            case 3:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda3().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda3().setText(""+monedas2);
                    break;
                }
            case 4:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda4().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda4().setText(""+monedas2);
                    break;
                }
            default:
                break;
        }
        this.setVisible(false);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        int monedas = Integer.parseInt(Tablero.getMoneda3().getText());
        int cantidad = Evento.getNumero(5);
        monedas = monedas-cantidad;
        Tablero.getMoneda1().setText(""+monedas);
        switch (Evento.getJugador()) {
            case 1:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda1().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda1().setText(""+monedas2);
                    break;
                }
            case 2:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda2().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda2().setText(""+monedas2);
                    break;
                }
            case 3:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda3().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda3().setText(""+monedas2);
                    break;
                }
            case 4:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda4().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda4().setText(""+monedas2);
                    break;
                }
            default:
                break;
        }
        this.setVisible(false);
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        int monedas = Integer.parseInt(Tablero.getMoneda4().getText());
        int cantidad = Evento.getNumero(5);
        monedas = monedas-cantidad;
        Tablero.getMoneda1().setText(""+monedas);
        switch (Evento.getJugador()) {
            case 1:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda1().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda1().setText(""+monedas2);
                    break;
                }
            case 2:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda2().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda2().setText(""+monedas2);
                    break;
                }
            case 3:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda3().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda3().setText(""+monedas2);
                    break;
                }
            case 4:
                {
                    int monedas2 = Integer.parseInt(Tablero.getMoneda4().getText());
                    monedas2 = monedas2 + cantidad;
                    Tablero.getMoneda4().setText(""+monedas2);
                    break;
                }
            default:
                break;
        }
        this.setVisible(false);
    }//GEN-LAST:event_boton4ActionPerformed

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
            java.util.logging.Logger.getLogger(RoboMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoboMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoboMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoboMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoboMonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    // End of variables declaration//GEN-END:variables
}
