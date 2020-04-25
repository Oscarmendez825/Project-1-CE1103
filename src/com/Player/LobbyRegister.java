
package com.Player;


import com.GameMap.MapTablero;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class LobbyRegister extends javax.swing.JFrame {
    
    int personaje = 0;
    String ip = "";
    String name = "";
    public LobbyRegister() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon fondo = new ImageIcon("fondolobby.gif");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(fondolbl.getWidth(), fondolbl.getHeight(), Image.SCALE_DEFAULT));
        fondolbl.setIcon(icono);
        this.repaint();
        setIconImage(new ImageIcon(getClass().getResource("/com/ImagesSelec/gamelogo.png")).getImage());
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        op1 = new javax.swing.JButton();
        op2 = new javax.swing.JButton();
        op3 = new javax.swing.JButton();
        op4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        namebox = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ipbox = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        fondolbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        op1.setBackground(new java.awt.Color(0, 0, 0));
        op1.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        op1.setForeground(new java.awt.Color(255, 255, 255));
        op1.setText("SELECCIONAR");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });
        getContentPane().add(op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        op2.setBackground(new java.awt.Color(0, 0, 0));
        op2.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        op2.setForeground(new java.awt.Color(255, 255, 255));
        op2.setText("SELECCIONAR");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });
        getContentPane().add(op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, -1));

        op3.setBackground(new java.awt.Color(0, 0, 0));
        op3.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        op3.setForeground(new java.awt.Color(255, 255, 255));
        op3.setText("SELECCIONAR");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });
        getContentPane().add(op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, -1, -1));

        op4.setBackground(new java.awt.Color(0, 0, 0));
        op4.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        op4.setForeground(new java.awt.Color(255, 255, 255));
        op4.setText("SELECCIONAR");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });
        getContentPane().add(op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, -1, -1));

        jLabel1.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GOKU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 130, 49));

        jLabel2.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MAZINGER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 130, 49));

        jLabel3.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CRASH");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 130, 49));

        jLabel4.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HALO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 130, 49));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/rsz_1halo-helmet-topic.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 138, 103));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/rsz_2854ab80ac87f9283721c2b9717f50e8.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 138, 103));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/rsz_1unnamed.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 138, 103));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/rsz_ec10f10ee54ea14dd8c4ada9258c6c86.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 138, 103));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/gamelogo.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 18, 365, -1));

        jLabel10.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SELECCIONE SU PERSONAJE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 250, 27));

        jLabel12.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ESCRIBA LA IP DEL SERVIDOR");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, 30));

        namebox.setBackground(new java.awt.Color(0, 0, 0));
        namebox.setColumns(20);
        namebox.setForeground(new java.awt.Color(255, 255, 255));
        namebox.setRows(5);
        jScrollPane4.setViewportView(namebox);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 380, 120));

        ipbox.setBackground(new java.awt.Color(0, 0, 0));
        ipbox.setColumns(20);
        ipbox.setForeground(new java.awt.Color(255, 255, 255));
        ipbox.setRows(5);
        jScrollPane2.setViewportView(ipbox);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 360, 120));

        jLabel13.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ESCRIBA SU NOMBRE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, 30));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("CONTINUAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));
        getContentPane().add(fondolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        
        personaje = 1;
        JOptionPane.showMessageDialog(null, "Ha seleccionado Halo");
        
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        
        personaje = 2; 
        JOptionPane.showMessageDialog(null, "Ha seleccionado a Goku");
        
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        
        personaje = 3;
        JOptionPane.showMessageDialog(null, "Ha seleccionado a Mazinger");
        
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        
        personaje = 4;
        JOptionPane.showMessageDialog(null, "Ha seleccionado a Crash");
        
    }//GEN-LAST:event_op4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ip = ipbox.getText();
        name = namebox.getText();
        
        setData();
    }//GEN-LAST:event_jButton5ActionPerformed
    public void setData(){
        if(!name.equals("") && !ip.equals("") && personaje != 0){
            GameUser.ip = ip;
            GameUser.name = name;
            GameUser.personaje = personaje;
            JOptionPane.showMessageDialog(null, "Bienvenido "+ GameUser.name);
            this.setVisible(false);
            new MapTablero().setVisible(true);
        
        }
        else{
            JOptionPane.showMessageDialog(null, "Usted no ha brindado toda la información necesaria");
        
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LobbyRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LobbyRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LobbyRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LobbyRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LobbyRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondolbl;
    private javax.swing.JTextArea ipbox;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea namebox;
    private javax.swing.JButton op1;
    private javax.swing.JButton op2;
    private javax.swing.JButton op3;
    private javax.swing.JButton op4;
    // End of variables declaration//GEN-END:variables
}
