package com.SoupGame;



import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/***
 * JFrame SopaGame class
 * @author Oscar Méndez
 * @version 0.9
 * @since 2020
 */
public class SopaGame extends javax.swing.JFrame{
    //Instancias y Atributos//
    public static int seg = 0;
    private String[] words;
    private int[] startx;
    private int[] starty;
    private boolean iwin; 
    private boolean[] direction;
    private JLabel[][] letters;
    private JLabel[] word;
    public static JFrame ventana;
    public static boolean iniciarHilo = true;
    public static int puntaje = 0;
    
    
    /***
     * Método Constructor
     */
    public SopaGame() {
        initComponents();
        JOptionPane.showMessageDialog(null, "Usted cuenta con 1 minuto para encontrar la mayor cantidad de palabras.");
        this.setLocationRelativeTo(null);
        word = new JLabel[]{word1,word2,word3,word4,word5,word6,word7,word8,word9,word10};
        update();
        words = new String[10];
        word = new JLabel[]{word1,word2,word3,word4,word5,word6,word7,word8,word9,word10};
        for (int i = 0; i < letters.length; i++) {
            words[i] = word[i].getText();
        }
        iniciarCrono();
        ventana = this;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        box = new javax.swing.JDesktopPane();
        panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        word2 = new javax.swing.JLabel();
        word1 = new javax.swing.JLabel();
        word4 = new javax.swing.JLabel();
        word3 = new javax.swing.JLabel();
        word6 = new javax.swing.JLabel();
        word5 = new javax.swing.JLabel();
        word8 = new javax.swing.JLabel();
        word7 = new javax.swing.JLabel();
        word9 = new javax.swing.JLabel();
        word10 = new javax.swing.JLabel();
        labelC = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATOS PARTY");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        box.setBackground(new java.awt.Color(51, 51, 51));

        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.setLayout(new java.awt.GridLayout(10, 14));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        word2.setBackground(new java.awt.Color(204, 51, 0));
        word2.setFont(new java.awt.Font("URW Gothic L", 1, 11)); // NOI18N
        word2.setForeground(new java.awt.Color(255, 255, 255));
        word2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word2.setText("FELIZ");
        word2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        word2.setOpaque(true);

        word1.setBackground(new java.awt.Color(204, 51, 0));
        word1.setFont(new java.awt.Font("URW Gothic L", 1, 11)); // NOI18N
        word1.setForeground(new java.awt.Color(255, 255, 255));
        word1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word1.setText("CUADRO");
        word1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        word1.setOpaque(true);

        word4.setBackground(new java.awt.Color(204, 51, 0));
        word4.setFont(new java.awt.Font("URW Gothic L", 1, 11)); // NOI18N
        word4.setForeground(new java.awt.Color(255, 255, 255));
        word4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word4.setText("CARRO");
        word4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        word4.setOpaque(true);

        word3.setBackground(new java.awt.Color(204, 51, 0));
        word3.setFont(new java.awt.Font("URW Gothic L", 1, 11)); // NOI18N
        word3.setForeground(new java.awt.Color(255, 255, 255));
        word3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word3.setText("SOL");
        word3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        word3.setOpaque(true);

        word6.setBackground(new java.awt.Color(204, 51, 0));
        word6.setFont(new java.awt.Font("URW Gothic L", 1, 11)); // NOI18N
        word6.setForeground(new java.awt.Color(255, 255, 255));
        word6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word6.setText("BALON");
        word6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        word6.setOpaque(true);

        word5.setBackground(new java.awt.Color(204, 51, 0));
        word5.setFont(new java.awt.Font("URW Gothic L", 1, 11)); // NOI18N
        word5.setForeground(new java.awt.Color(255, 255, 255));
        word5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word5.setText("SILLA");
        word5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        word5.setOpaque(true);

        word8.setBackground(new java.awt.Color(204, 51, 0));
        word8.setFont(new java.awt.Font("URW Gothic L", 1, 11)); // NOI18N
        word8.setForeground(new java.awt.Color(255, 255, 255));
        word8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word8.setText("CORTINA");
        word8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        word8.setOpaque(true);

        word7.setBackground(new java.awt.Color(204, 51, 0));
        word7.setFont(new java.awt.Font("URW Gothic L", 1, 11)); // NOI18N
        word7.setForeground(new java.awt.Color(255, 255, 255));
        word7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word7.setText("HOLA");
        word7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        word7.setOpaque(true);

        word9.setBackground(new java.awt.Color(204, 51, 0));
        word9.setFont(new java.awt.Font("URW Gothic L", 1, 11)); // NOI18N
        word9.setForeground(new java.awt.Color(255, 255, 255));
        word9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word9.setText("BOTELLA");
        word9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        word9.setOpaque(true);

        word10.setBackground(new java.awt.Color(204, 51, 0));
        word10.setFont(new java.awt.Font("URW Gothic L", 1, 11)); // NOI18N
        word10.setForeground(new java.awt.Color(255, 255, 255));
        word10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word10.setText("MANTEL");
        word10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        word10.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(word6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(word7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(word5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(word3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(word4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(word8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(word9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(word2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(word1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(word10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(word1)
                    .addComponent(word2)
                    .addComponent(word3)
                    .addComponent(word4)
                    .addComponent(word5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(word6)
                    .addComponent(word7)
                    .addComponent(word8)
                    .addComponent(word9)
                    .addComponent(word10))
                .addGap(284, 284, 284))
        );

        box.setLayer(panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        box.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout boxLayout = new javax.swing.GroupLayout(box);
        box.setLayout(boxLayout);
        boxLayout.setHorizontalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        boxLayout.setVerticalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 40, 830, 430));

        labelC.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelC.setText("00:00:00");
        getContentPane().add(labelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 110, 30));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /***
     * Método iniciarCrono
     * Inicializa el cronómetro
     */
    private void iniciarCrono() {
            CronoSopa crono = new CronoSopa(labelC);
            crono.start();
    }

    /***
     * Método putwords
     * Se encarga de agregar las palabras en la matriz general
     */
    private void putwords() {
        String[] word = {word1.getText(),word2.getText(),word3.getText(),word4.getText(),word5.getText(),
                         word6.getText(),word7.getText(),word8.getText(),word9.getText(),word10.getText()};
        Random random = new Random();
        int startsx = 0;
        int startsy;
        int[] only = noRepetitions(10);
        startx = only;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() < 14) {
                startsx = only[i];
                startsy = (int)(random.nextDouble()*14-1);
                int extract = 0;
                if (startsy + word[i].length()<14) {
                    for (int j = startsy; j < startsy+word[i].length(); j++) {
                        letters[startsx][j].setText(word[i].substring(extract, extract+1));
                        letters[startsx][j].setName("1");
                        extract++;
                        starty[i] = startsy;
                        direction[i] = true;
                    }
                } else if (startsy-word[i].length()>0){
                    for (int j = startsy; j > startsy - word[i].length(); j--) {
                        letters[startsx][j].setText(word[i].substring(extract, extract+1));
                        letters[startsx][j].setName("1");
                        extract++;
                        starty[i] = startsy;
                        direction[i] = false;
                    }
                }
            }
        }
    }
    /***
     * Método letterspace 
     * se encarga de darle formato a las letras en la matriz
     */
    private void letterspace() {
        letters = new JLabel[10][14];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                letters[i][j] = new JLabel("", javax.swing.SwingConstants.CENTER);
                letters[i][j].setName("");
                letters[i][j].setBackground(Color.LIGHT_GRAY);
                letters[i][j].setFont(new java.awt.Font("Orbitron", 1, 15)); 
                letters[i][j].setForeground(Color.BLACK);
                letters[i][j].setOpaque(true);
                letters[i][j].setBorder(new javax.swing.border.LineBorder(Color.RED, 3));
                letters[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        clicked(evt);
                    }
                });
                panel.add(letters[i][j]);
            }
        }
    }
    /***
     * Método clicked
     * Se encarga de saber si un Label fue marcado y le cambia de color
     * @param evt 
     */
    private void clicked(java.awt.event.MouseEvent evt) {
        if (!iwin) {
            if (evt.getComponent().getBackground().equals(Color.LIGHT_GRAY)) {
                evt.getComponent().setBackground(Color.YELLOW);
                eliminate();
            }else if(evt.getComponent().getName().equals("")){
                evt.getComponent().setBackground(Color.LIGHT_GRAY);
            }
        }
    }
    
    
    /***
     * Método emptyspaces
     * Se encarga de rellenar los espacios vacíos
     */
    private void emptyspaces() {
        
        String[] abecedary = {"A","B","C","D","E","F","G","H","I","J","K","L",
                              "M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                if (letters[i][j].getText().equals("")) {
                    letters[i][j].setText(abecedary[(int)(random.nextDouble()*abecedary.length-1)]);
                }
            }
        }
    }
    /***
     * Método eliminate word
     * @param x int
     * @param y int 
     * @param size int
     * @param direction boolean
     * @return boolean
     */
    private boolean  eliminateword(int x,int y,int size,boolean direction) {
        boolean answer = true;
        if (direction) {
            for (int i = y; i < size+y; i++) {
                if (letters[x][i].getBackground().equals(Color.LIGHT_GRAY)) {
                    answer = false;
                    break;
                }
            }
        }else
        {
            for (int j = y; j >y-size; j--) {
                if (letters[x][j].getBackground().equals(Color.LIGHT_GRAY)) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
    /***
     * Método noRepetitions
     * verifica que no haya repeticiones de palabras
     * @param repetitions int
     * @return 
     */
    private int[] noRepetitions(int repetitions) {
        int[] numbers = new int[repetitions];
        for (int i = 0; i < repetitions; i++) {
            numbers[i] =-1;
        }
        Random random = new Random();
        boolean aux;
        int number = 0;
        for (int x = 0; x < repetitions; x++) {
            aux = true;
            while (aux) {  
                aux = false;
                number = (int)(random.nextDouble()*11-1);
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[j] == number) {
                        aux = true;
                        break;
                    }
                }
            }
            numbers[x] = number;
        }
        return numbers;
    }
    /***
     * Método eliminate
     * se encarga de eliminar una palabra una vez fue encontrada
     */
    private void eliminate() {
        for (int i = 0; i < 10; i++) {
            if (!word[i].getBackground().equals(Color.black)) {
                if (eliminateword(startx[i],starty[i],word[i].getText().length(),direction[i])){
                    word[i].setBackground(Color.black);                
                    puntaje++;
                    break;
                    
                }
            }
        }
        boolean aux = true;
        for (int i = 0; i < letters.length; i++){
            if (!word[i].getBackground().equals(Color.black)){
                aux=false;
                break;
            }
        
        }
        if (aux == true) {
            iwin=true;
            JOptionPane.showMessageDialog(null, "Lo lograste");
            SoupScores.setPuntaje();
            this.dispose();

        }
        
    }
    /***
     * Método update 
     * se encarga de inicializar elementos necesarios en el juego
     */
    private void update(){
        direction = new boolean[10];
        iwin = false;
        starty = new int[10];
        startx = new int[10];
        
        letterspace();
        putwords();
        emptyspaces();
    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SopaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SopaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SopaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SopaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new SopaGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JDesktopPane box;
    javax.swing.JLabel jLabel1;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JLabel labelC;
    javax.swing.JPanel panel;
    javax.swing.JLabel word1;
    javax.swing.JLabel word10;
    javax.swing.JLabel word2;
    javax.swing.JLabel word3;
    javax.swing.JLabel word4;
    javax.swing.JLabel word5;
    javax.swing.JLabel word6;
    javax.swing.JLabel word7;
    javax.swing.JLabel word8;
    javax.swing.JLabel word9;
    // End of variables declaration//GEN-END:variables

    



}
