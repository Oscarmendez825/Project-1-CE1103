
package com.Player;


import java.applet.AudioClip;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class LobbyRegister extends javax.swing.JFrame {
    AudioClip sonido;
    private String personaje1 = "";
    private String personaje2 = "";
    private String personaje3 = "";
    private String personaje4 = "";
    
    int cantidadvalor = 0;
    
    private String name1 = "";
    private String name2 = "";
    private String name3 = "";
    private String name4 = "";
    
    public LobbyRegister() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon fondo = new ImageIcon("fondolobby.gif");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(fondolbl.getWidth(), fondolbl.getHeight(), Image.SCALE_DEFAULT));
        fondolbl.setIcon(icono);
        this.repaint();
        setIconImage(new ImageIcon(getClass().getResource("/com/ImagesSelec/gamelogo.png")).getImage());
        this.setTitle("DATOS PARTY");
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/com/Songs/startsong.wav"));
        sonido.loop();
        
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        namebox1 = new javax.swing.JTextPane();
        barra1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        namebox2 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        namebox3 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        namebox4 = new javax.swing.JTextPane();
        barra2 = new javax.swing.JComboBox<>();
        barra3 = new javax.swing.JComboBox<>();
        barra4 = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        cantidad = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fondolbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GOKU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 130, 49));

        jLabel2.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MAZINGER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 410, 130, 49));

        jLabel3.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CRASH");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 130, 49));

        jLabel4.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HALO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, 130, 49));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/rsz_1halo-helmet-topic.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 138, 103));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/rsz_2854ab80ac87f9283721c2b9717f50e8.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, 138, 103));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/rsz_1unnamed.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 450, 138, 103));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/rsz_ec10f10ee54ea14dd8c4ada9258c6c86.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 138, 103));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/gamelogo.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 280, 170));

        jLabel13.setFont(new java.awt.Font("Orbitron", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ESCRIBA SU NOMBRE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, 30));

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

        namebox1.setBackground(new java.awt.Color(0, 0, 0));
        namebox1.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(namebox1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 110, -1));

        barra1.setBackground(new java.awt.Color(0, 0, 0));
        barra1.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        barra1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Halo", "Mazinger", "Goku", "Crash" }));
        getContentPane().add(barra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 170, -1));

        namebox2.setBackground(new java.awt.Color(0, 0, 0));
        namebox2.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(namebox2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 110, -1));

        namebox3.setBackground(new java.awt.Color(0, 0, 0));
        namebox3.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(namebox3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 110, -1));

        namebox4.setBackground(new java.awt.Color(0, 0, 0));
        namebox4.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(namebox4);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 110, -1));

        barra2.setBackground(new java.awt.Color(0, 0, 0));
        barra2.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        barra2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Halo", "Mazinger", "Goku", "Crash" }));
        getContentPane().add(barra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 170, -1));

        barra3.setBackground(new java.awt.Color(0, 0, 0));
        barra3.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        barra3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Halo", "Mazinger", "Goku", "Crash" }));
        getContentPane().add(barra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 170, -1));

        barra4.setBackground(new java.awt.Color(0, 0, 0));
        barra4.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        barra4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Halo", "Mazinger", "Goku", "Crash" }));
        getContentPane().add(barra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 170, -1));

        cantidad.setBackground(new java.awt.Color(0, 0, 0));
        cantidad.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(cantidad);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 110, -1));

        jLabel11.setFont(new java.awt.Font("Orbitron", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SELECCIONE SU PERSONAJE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, 27));

        jLabel12.setFont(new java.awt.Font("Orbitron", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(" Datos Party 1 es un juego para la familia, donde pueden participar de 2 a 4 jugadores, el punto es recorrer");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 27));

        jLabel14.setFont(new java.awt.Font("Orbitron", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(" un tablero de juego recolectando la mayor cantidad de monedas posibles para comprar estrellas,");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 550, 27));

        jLabel15.setFont(new java.awt.Font("Orbitron", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(" gana el jugador que tenga la mayor cantidad de Estrellas compradas y mayor cantidad de monedas (dándole prioridad a las estrellas). ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 760, 27));

        jLabel16.setFont(new java.awt.Font("Orbitron", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Cantidad de Jugadores");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 140, 27));
        getContentPane().add(fondolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 1060, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        name1 = namebox1.getText();
        name2 = namebox2.getText();
        name3 = namebox3.getText();
        name4 = namebox4.getText();
        try{
            cantidadvalor = Integer.parseInt(cantidad.getText());
        }catch(NumberFormatException e){
        }
        personaje1 = (String)barra1.getSelectedItem();
        personaje2 = (String)barra2.getSelectedItem();
        personaje3 = (String)barra3.getSelectedItem();
        personaje4 = (String)barra4.getSelectedItem();
        setData();
    }//GEN-LAST:event_jButton5ActionPerformed
    public void setData(){
        
        switch(cantidadvalor){
            case 2:
                if (!name1.equals("") && !name2.equals("")){
                    GameUser.setName1(name1);
                    GameUser.setName2(name2);
                    GameUser.personaje1 = personaje1;
                    GameUser.personaje2 = personaje2;
                    GameUser.setCantidad(cantidadvalor);
                    JOptionPane.showMessageDialog(null, "Bienvenidos");
                    this.setVisible(false);
                    sonido.stop();
                    new Tablero().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se han escrito todos los nombres de los jugadores");
                }
                break;
            case 3:
                if (!name1.equals("") && !name2.equals("") && !name3.equals("")){
                    GameUser.setName1(name1);
                    GameUser.setName2(name2);
                    GameUser.setName3(name3);
                    
                    GameUser.personaje1 = personaje1;
                    GameUser.personaje2 = personaje2;
                    GameUser.personaje3 = personaje3;
                    
                    GameUser.setCantidad(cantidadvalor);
                    JOptionPane.showMessageDialog(null, "Bienvenidos");
                    this.setVisible(false);
                    sonido.stop();
                    new Tablero().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se han escrito todos los nombres de los jugadores");
                }
                break;
            case 4:
                if (!name1.equals("") && !name2.equals("") && !name3.equals("") && !name4.equals("")){
                    GameUser.setName1(name1);
                    GameUser.setName2(name2);
                    GameUser.setName3(name3);
                    GameUser.setName4(name4);

                    GameUser.personaje1 = personaje1;
                    GameUser.personaje2 = personaje2;
                    GameUser.personaje3 = personaje3;
                    GameUser.personaje4 = personaje4;
                    
                    GameUser.setCantidad(cantidadvalor);
                    JOptionPane.showMessageDialog(null, "Bienvenidos");
                    this.setVisible(false);
                    sonido.stop();
                    new Tablero().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se han escrito todos los nombres de los jugadores");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "El número de jugadores digitado es incorrecto");
                break;
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
    private javax.swing.JComboBox<String> barra1;
    private javax.swing.JComboBox<String> barra2;
    private javax.swing.JComboBox<String> barra3;
    private javax.swing.JComboBox<String> barra4;
    private javax.swing.JTextPane cantidad;
    private javax.swing.JLabel fondolbl;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane namebox1;
    private javax.swing.JTextPane namebox2;
    private javax.swing.JTextPane namebox3;
    private javax.swing.JTextPane namebox4;
    // End of variables declaration//GEN-END:variables
}
