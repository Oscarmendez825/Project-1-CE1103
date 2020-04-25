/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GameMap;

import ListaEnlazadaSimple.ListaEnlazada;
import com.Player.ClientThread;
import com.ListaCircularDoblementeEnlazada.ListCircDobEn;
import com.ListaDobleE.ListaDoble;
import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class MapTablero extends javax.swing.JFrame {
    boolean tiro = false;
    int valor;
    ImageIcon imageValor;
    int valordado;
    ImageIcon imageGif;
    ListCircDobEn<JLabel> tablerop;
    JLabel jugador1 = new JLabel();
    ClientThread client;
    ListaEnlazada<JLabel> faseA;
    ListaEnlazada<JLabel> faseB;
    ListaDoble<JLabel> faseC;
    ListCircDobEn<JLabel> faseD;
    static int monedas = 50;
    static int estrellas = 10;
    public MapTablero() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        ImageIcon fondo = new ImageIcon("fondogame.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(fondogame.getWidth(), fondogame.getHeight(), Image.SCALE_DEFAULT));
        fondogame.setIcon(icono);
        this.repaint();
        setIconImage(new ImageIcon(getClass().getResource("/com/ImagesSelec/gamelogo.png")).getImage());
        cuadrovalor.setEditable(false);
        tablerop = new ListCircDobEn<JLabel>();
        tablerop.add(t1);
        tablerop.add(t2);
        tablerop.add(t3);
        tablerop.add(t4);
        tablerop.add(t5);
        tablerop.add(t6);
        tablerop.add(t7);
        tablerop.add(t8);
        tablerop.add(t9);
        tablerop.add(t10);
        tablerop.add(t11);
        tablerop.add(t12);
        tablerop.add(t13);
        tablerop.add(t14);
        tablerop.add(t15);
        tablerop.add(t16);
        tablerop.add(t17);
        tablerop.add(t18);
        tablerop.add(t19);
        tablerop.add(t20);
        tablerop.add(t21);
        tablerop.add(t22);
        tablerop.add(t23);
        tablerop.add(t24);
        tablerop.add(t25);
        tablerop.add(t26);
        tablerop.add(t27);
        tablerop.add(t28);
        tablerop.add(t29);
        //Fin Tablero//
        faseA = new ListaEnlazada<JLabel>();
        faseA.add(a1);
        faseA.add(a2);
        faseA.add(a3);
        faseA.add(a4);
        faseA.add(a5);
        //Fin Fase A//
        faseB = new ListaEnlazada<JLabel>();
        faseB.add(b1);
        faseB.add(b2);
        faseB.add(b3);
        faseB.add(b4);
        //Fin Fase B//
        faseC = new ListaDoble<JLabel>();
        faseC.add(c1);
        faseC.add(c2);
        faseC.add(c3);
        faseC.add(c4);
        //Fin Fase C//        
        faseD = new ListCircDobEn<JLabel>();
        faseD.add(d1);
        faseD.add(d2);
        faseD.add(d3);
        faseD.add(d4);
        faseD.add(d5);
        faseD.add(d6);
        faseD.add(d7);
        faseD.add(d8);
        //Fin Fase D//
        
        
        
        
        client = new ClientThread(L1,L2,L3,L4,tablerop,faseA,faseB,faseC,faseD);
        Thread thread = new Thread(client);
        thread.start();
        getContentPane().setComponentZOrder(this.L1, 0);
        getContentPane().setComponentZOrder(this.L2, 0);
        getContentPane().setComponentZOrder(this.L3, 0);
        getContentPane().setComponentZOrder(this.L4, 0);
        
        //System.out.println(tablerop.getSize());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t12 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t18 = new javax.swing.JLabel();
        t29 = new javax.swing.JLabel();
        t28 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        t26 = new javax.swing.JLabel();
        t24 = new javax.swing.JLabel();
        t25 = new javax.swing.JLabel();
        t27 = new javax.swing.JLabel();
        t23 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        t21 = new javax.swing.JLabel();
        t20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        t22 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        cuadrovalor = new javax.swing.JTextField();
        botontirar = new javax.swing.JButton();
        dadoLabel1 = new javax.swing.JLabel();
        dadoLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        a3 = new javax.swing.JLabel();
        t14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        t11 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t13 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        t16 = new javax.swing.JLabel();
        t17 = new javax.swing.JLabel();
        t19 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d8 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d7 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        t15 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        monedaLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tiendaboton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        estrellalabel = new javax.swing.JLabel();
        fondogame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L3.setBackground(new java.awt.Color(0, 102, 102));
        L3.setOpaque(true);
        getContentPane().add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 30, 30));

        L4.setBackground(new java.awt.Color(0, 102, 102));
        L4.setOpaque(true);
        getContentPane().add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 30, 30));

        L1.setBackground(new java.awt.Color(0, 102, 102));
        L1.setOpaque(true);
        getContentPane().add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 30, 30));

        L2.setBackground(new java.awt.Color(204, 0, 153));
        L2.setOpaque(true);
        getContentPane().add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 30, 30));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/logo.png"))); // NOI18N
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 160, 184, 150));

        t7.setBackground(new java.awt.Color(0, 0, 204));
        t7.setOpaque(true);
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 60, 50));

        t12.setBackground(new java.awt.Color(0, 255, 51));
        t12.setOpaque(true);
        getContentPane().add(t12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 60, 50));

        t4.setBackground(new java.awt.Color(255, 255, 0));
        t4.setOpaque(true);
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 60, 50));

        t5.setBackground(new java.awt.Color(255, 0, 0));
        t5.setOpaque(true);
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 60, 50));

        t2.setBackground(new java.awt.Color(0, 255, 51));
        t2.setOpaque(true);
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 60, 50));

        t3.setBackground(new java.awt.Color(255, 0, 0));
        t3.setOpaque(true);
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 60, 50));

        t10.setBackground(new java.awt.Color(255, 0, 0));
        t10.setOpaque(true);
        getContentPane().add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 250, 60, 50));

        t1.setBackground(new java.awt.Color(0, 0, 204));
        t1.setOpaque(true);
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 60, 50));

        t18.setBackground(new java.awt.Color(0, 255, 51));
        t18.setOpaque(true);
        getContentPane().add(t18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 60, 50));

        t29.setBackground(new java.awt.Color(255, 0, 0));
        t29.setOpaque(true);
        getContentPane().add(t29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 60, 50));

        t28.setBackground(new java.awt.Color(0, 255, 51));
        t28.setOpaque(true);
        getContentPane().add(t28, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 50));

        c3.setBackground(new java.awt.Color(0, 0, 204));
        c3.setOpaque(true);
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 60, 50));

        c1.setBackground(new java.awt.Color(255, 0, 0));
        c1.setOpaque(true);
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 60, 50));

        t6.setBackground(new java.awt.Color(0, 255, 51));
        t6.setOpaque(true);
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 60, 50));

        d1.setBackground(new java.awt.Color(255, 255, 0));
        d1.setOpaque(true);
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 330, 60, 50));

        a5.setBackground(new java.awt.Color(0, 0, 204));
        a5.setOpaque(true);
        getContentPane().add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 60, 50));

        t26.setBackground(new java.awt.Color(255, 0, 0));
        t26.setOpaque(true);
        getContentPane().add(t26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 60, 50));

        t24.setBackground(new java.awt.Color(255, 255, 0));
        t24.setOpaque(true);
        getContentPane().add(t24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 60, 50));

        t25.setBackground(new java.awt.Color(0, 255, 51));
        t25.setOpaque(true);
        getContentPane().add(t25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 60, 50));

        t27.setBackground(new java.awt.Color(0, 0, 204));
        t27.setOpaque(true);
        getContentPane().add(t27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 60, 50));

        t23.setBackground(new java.awt.Color(255, 0, 0));
        t23.setOpaque(true);
        getContentPane().add(t23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 60, 50));

        t8.setBackground(new java.awt.Color(255, 0, 0));
        t8.setOpaque(true);
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, 60, 50));

        a4.setBackground(new java.awt.Color(255, 255, 0));
        a4.setOpaque(true);
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, 60, 50));

        t21.setBackground(new java.awt.Color(255, 0, 0));
        t21.setOpaque(true);
        getContentPane().add(t21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 630, 60, 50));

        t20.setBackground(new java.awt.Color(0, 0, 204));
        t20.setOpaque(true);
        getContentPane().add(t20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 60, 50));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 30, 20));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, 40));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, 40));
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, 40));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 30, 20));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 210, 20, 40));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, 30, 20));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 30, 20));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 30, 20));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 30, 20));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 30, 20));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 30, 20));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 20, 40));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 20, 40));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 120, 20, 40));

        c4.setBackground(new java.awt.Color(255, 255, 0));
        c4.setOpaque(true);
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 60, 50));

        t22.setBackground(new java.awt.Color(0, 255, 51));
        t22.setOpaque(true);
        getContentPane().add(t22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 60, 50));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 20, 40));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 300, 20, 40));
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, 40));
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, -1, 40));
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, 40));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 340, 30, 20));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 30, 20));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 40, 20));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 30, 20));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 30, 20));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 630, 30, 20));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 650, 30, 20));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 30, 20));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 40));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 20, 40));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 20, 40));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 20, 40));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, 40));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 20, 40));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 20, 40));

        cuadrovalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadrovalorActionPerformed(evt);
            }
        });
        getContentPane().add(cuadrovalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 120, 37, 24));

        botontirar.setText("Tirar");
        botontirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botontirarActionPerformed(evt);
            }
        });
        getContentPane().add(botontirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 150, -1, -1));

        dadoLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/dadogif.gif"))); // NOI18N
        getContentPane().add(dadoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 90, 100));

        dadoLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/dadogif.gif"))); // NOI18N
        getContentPane().add(dadoLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 90, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/start.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 40, 30));

        jButton1.setText("Mover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 150, -1, -1));

        a3.setBackground(new java.awt.Color(255, 0, 0));
        a3.setOpaque(true);
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 520, 60, 50));

        t14.setBackground(new java.awt.Color(255, 0, 0));
        t14.setOpaque(true);
        getContentPane().add(t14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 60, 50));

        jLabel1.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FASE C");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 80, 50));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 480, 20, 40));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 380, 20, 40));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, 30, 20));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 30, 20));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 390, 20, 40));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 20, 40));

        b2.setBackground(new java.awt.Color(255, 255, 0));
        b2.setOpaque(true);
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 60, 50));

        t9.setBackground(new java.awt.Color(0, 255, 51));
        t9.setOpaque(true);
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 160, 60, 50));

        t11.setBackground(new java.awt.Color(0, 0, 204));
        t11.setOpaque(true);
        getContentPane().add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 60, 50));

        a1.setBackground(new java.awt.Color(0, 0, 204));
        a1.setOpaque(true);
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 340, 60, 50));

        jLabel2.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FASE D");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 280, 80, 50));

        t13.setBackground(new java.awt.Color(255, 255, 0));
        t13.setOpaque(true);
        getContentPane().add(t13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 60, 50));

        b3.setBackground(new java.awt.Color(255, 255, 0));
        b3.setOpaque(true);
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 60, 50));

        b4.setBackground(new java.awt.Color(255, 255, 0));
        b4.setOpaque(true);
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 60, 50));

        b1.setBackground(new java.awt.Color(255, 255, 0));
        b1.setOpaque(true);
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 60, 50));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 30, 20));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 30, 20));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 30, 20));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 20, 40));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 20, 40));

        jLabel3.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FASE B");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 80, 50));

        a2.setBackground(new java.awt.Color(0, 255, 51));
        a2.setOpaque(true);
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 60, 50));

        c2.setBackground(new java.awt.Color(0, 255, 51));
        c2.setOpaque(true);
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 60, 50));

        t16.setBackground(new java.awt.Color(0, 0, 204));
        t16.setOpaque(true);
        getContentPane().add(t16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 60, 50));

        t17.setBackground(new java.awt.Color(255, 0, 0));
        t17.setOpaque(true);
        getContentPane().add(t17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 60, 50));

        t19.setBackground(new java.awt.Color(255, 255, 0));
        t19.setOpaque(true);
        getContentPane().add(t19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 630, 60, 50));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 30, 20));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 30, 20));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 20, 40));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 20, 40));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, 20, 40));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 20, 40));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 20, 40));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 20, 40));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 20, 40));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 20, 40));

        d2.setBackground(new java.awt.Color(255, 255, 0));
        d2.setOpaque(true);
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 330, 60, 50));

        d8.setBackground(new java.awt.Color(255, 255, 0));
        d8.setOpaque(true);
        getContentPane().add(d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 420, 60, 50));

        d3.setBackground(new java.awt.Color(255, 255, 0));
        d3.setOpaque(true);
        getContentPane().add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 420, 60, 50));

        d7.setBackground(new java.awt.Color(255, 255, 0));
        d7.setOpaque(true);
        getContentPane().add(d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 510, 60, 50));

        d4.setBackground(new java.awt.Color(255, 255, 0));
        d4.setOpaque(true);
        getContentPane().add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 510, 60, 50));

        d5.setBackground(new java.awt.Color(255, 255, 0));
        d5.setOpaque(true);
        getContentPane().add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 600, 60, 50));

        t15.setBackground(new java.awt.Color(0, 255, 51));
        t15.setOpaque(true);
        getContentPane().add(t15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 60, 50));

        d6.setBackground(new java.awt.Color(255, 255, 0));
        d6.setOpaque(true);
        getContentPane().add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 600, 60, 50));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 470, 20, 40));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 560, 20, 40));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 380, 20, 40));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 470, 20, 40));

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 560, 20, 40));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        getContentPane().add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 20, 40));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 560, 20, 40));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 470, 20, 40));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 380, 20, 40));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 380, 20, 40));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 470, 20, 40));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 560, 20, 40));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        getContentPane().add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 20, 40));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 360, 30, 20));

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        getContentPane().add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 30, 20));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        getContentPane().add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 610, 30, 20));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        getContentPane().add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 30, 20));

        jLabel4.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FASE A");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 80, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/tienda (2).gif"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 60, 40));

        monedaLabel.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        monedaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monedaLabel.setText("50");
        getContentPane().add(monedaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/estrella1.gif"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 40, 40));

        tiendaboton.setText("TIENDA");
        tiendaboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiendabotonActionPerformed(evt);
            }
        });
        getContentPane().add(tiendaboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/moneda.gif"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        estrellalabel.setBackground(new java.awt.Color(255, 255, 255));
        estrellalabel.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        estrellalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrellalabel.setText("10");
        getContentPane().add(estrellalabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 30, 20));
        getContentPane().add(fondogame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuadrovalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadrovalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadrovalorActionPerformed

    private void botontirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botontirarActionPerformed
        if(tiro == false){
            L2.setBackground(null);
            int valor1 = gennumero();
            int valor2 = gennumero();

            dadoLabel1.setIcon(setImage(valor1));
            dadoLabel2.setIcon(setImage(valor2));
            int total = +valor1+valor2;


            cuadrovalor.setText(""+total);
            if(valor == 0){
            valor += total-1;
            }else{
                valor+=total;
            }
            if (valor>tablerop.getSize()){
                valor =  valor - tablerop.getSize();
            
        }
         
        
        tiro = true;
        }else{
            JOptionPane.showMessageDialog(null, "No puede tirar 2 veces los dados");
        }
        

    }//GEN-LAST:event_botontirarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tiro == true){
            L1.setLocation(tablerop.get(valor).getX(),tablerop.get(valor).getY());
            L1.setBackground(tablerop.get(valor).getBackground());
            tiro = false;
            
            System.out.println(L2.getLocation());
        }else{
            JOptionPane.showMessageDialog(null, "No ha tirado los dados aún");
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tiendabotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiendabotonActionPerformed
        // TODO add your handling code here
        monedas = Integer.parseInt(monedaLabel.getText());
        estrellas = Integer.parseInt(estrellalabel.getText());
        new Tienda(monedaLabel,estrellalabel).setVisible(true);
    }//GEN-LAST:event_tiendabotonActionPerformed
    
    public ImageIcon dadoGif(){
        imageGif = new ImageIcon("dadogif.gif");
        return imageGif;
    
    }
    public int gennumero(){
        Random random = new Random();
        valordado = random.nextInt(6)+1;
        return valordado;
    
    }
    public ImageIcon setImage(int valor){
        switch (valor) {
            case 1:
                imageValor = new ImageIcon("1.gif");
                break;
            case 2:
                imageValor = new ImageIcon("2.png");
                break;
            case 3:
                imageValor = new ImageIcon("3.jpeg");
                break;
            case 4:
                imageValor = new ImageIcon("4.png");
                break;
            case 5:
                imageValor = new ImageIcon("5.jpg");
                break;
            case 6:
                imageValor = new ImageIcon("6.png");
                break;
            default:
                break;
        }

        return imageValor;    

 
 
    
    }
    
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
            java.util.logging.Logger.getLogger(MapTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JButton botontirar;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JTextField cuadrovalor;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d5;
    private javax.swing.JLabel d6;
    private javax.swing.JLabel d7;
    private javax.swing.JLabel d8;
    private javax.swing.JLabel dadoLabel1;
    private javax.swing.JLabel dadoLabel2;
    private javax.swing.JLabel estrellalabel;
    private javax.swing.JLabel fondogame;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel monedaLabel;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t10;
    private javax.swing.JLabel t11;
    private javax.swing.JLabel t12;
    private javax.swing.JLabel t13;
    private javax.swing.JLabel t14;
    private javax.swing.JLabel t15;
    private javax.swing.JLabel t16;
    private javax.swing.JLabel t17;
    private javax.swing.JLabel t18;
    private javax.swing.JLabel t19;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t20;
    private javax.swing.JLabel t21;
    private javax.swing.JLabel t22;
    private javax.swing.JLabel t23;
    private javax.swing.JLabel t24;
    private javax.swing.JLabel t25;
    private javax.swing.JLabel t26;
    private javax.swing.JLabel t27;
    private javax.swing.JLabel t28;
    private javax.swing.JLabel t29;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    private javax.swing.JButton tiendaboton;
    // End of variables declaration//GEN-END:variables
}
