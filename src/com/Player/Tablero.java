/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Player;

import com.ListaCircular.ListaCircular;
import com.ListaCircularDoblementeEnlazada.ListCircDobEn;
import com.ListaDobleE.ListaDoble;
import com.ListaEnlazadaSimple.ListaEnlazada;
import com.ObserverPattern.ContentCreatorSubject;
import com.ObserverPattern.SubscriberConcreteObserver;
import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *  Tablero Class
 * @author Oscar Méndez
 * @author Marco Picado
 * @author Hansel Hampton
 * @author Keyner Gómez
 * @version 1.1
 * @since 2020
 */
public class Tablero extends javax.swing.JFrame {
    //ATRIBUTOS E INSTANCIAS//
    private boolean turnoA = true;
    private boolean turnoB = false;
    private boolean turnoC = false;
    private boolean turnoD = false;
    private int pasadas = 0;
    private static boolean tiro = false;
    private static int valor;
    ImageIcon imageValor;
    private int valordado;
    ImageIcon imageGif;
    private static ListaCircular<JLabel> tablero;
    private static int valorA = 0;
    private static int valorB = 0;
    private static int valorC = 0;
    private static int valorD = 0;
    private int vueltasGen;
    private boolean hayDuelo = false;
    private int posicionCarta = 20;
    private int posicionEstrella = 25;  
    private static int valorFase;   
    private static int FaseInd1;
    private static int FaseInd2;
    private static int FaseInd3;
    private static int FaseInd4;
    private static int posicion1 = -1;
    private static int posicion2 = -1;
    private static int posicion3 = -1;
    private static int posicion4 = -1;
    private static boolean FaseJug1 = false;
    private static boolean FaseJug2 = false;
    private static boolean FaseJug3 = false;
    private static boolean FaseJug4 = false;
    ListaEnlazada<JLabel> faseA;
    ListaEnlazada<JLabel> faseB;
    static ListaDoble<JLabel> faseC;
    static ListCircDobEn<JLabel> faseD;
    GameUser jugadores;
    SubscriberConcreteObserver subscriber1 = new SubscriberConcreteObserver();
    ContentCreatorSubject contentcreator = new ContentCreatorSubject();
    //FIN ATRIBUTOS E INSTANCIAS//
    
    
    /***
     * Método Constructor
     */
    public Tablero() {
        initComponents();
        this.setLocationRelativeTo(null);
        cuadrovalor.setEditable(false);
        jname1.setText(GameUser.getName1());
        jname2.setText(GameUser.getName2());
        jname3.setText(GameUser.getName3());
        jname4.setText(GameUser.getName4());
        tablero = new ListaCircular<JLabel>();
        tablero.add(t1);
        tablero.add(t2);
        tablero.add(t3);
        tablero.add(t4);
        tablero.add(t5);
        tablero.add(t6);
        tablero.add(t7);
        tablero.add(t8);
        tablero.add(t9);
        tablero.add(t10);
        tablero.add(t11);
        tablero.add(t12);
        tablero.add(t13);
        tablero.add(t14);
        tablero.add(t15);
        tablero.add(t16);
        tablero.add(t17);
        tablero.add(t18);
        tablero.add(t19);
        tablero.add(t20);
        tablero.add(t21);
        tablero.add(t22);
        tablero.add(t23);
        tablero.add(t24);
        tablero.add(t25);
        tablero.add(t26);
        tablero.add(t27);
        tablero.add(t28);
        tablero.add(t29);
        tablero.add(t30);
        tablero.add(t31);
        tablero.add(t32);
        tablero.add(t33);
        tablero.add(t34);
       //FIN TABLERO//
        faseD = new ListCircDobEn<JLabel>();
        faseD.add(d1);
        faseD.add(d2);
        faseD.add(d3);
        faseD.add(d4);
        faseD.add(d5);
        faseD.add(d6);
        faseD.add(d7);
        faseD.add(d8);
        faseD.add(d9);
        faseD.add(d10);
        //FIN FASE D//
        faseC = new ListaDoble<JLabel>();
        faseC.add(c1);
        faseC.add(c2);
        faseC.add(c3);
        faseC.add(c4);
        faseC.add(c5);
        faseC.add(c6);
        //FIN FASE C//
        faseB = new ListaEnlazada<JLabel>();
        faseB.add(b1);
        faseB.add(b2);
        faseB.add(b3);
        faseB.add(b4);
        faseB.add(b5);
        faseB.add(b6);
        faseB.add(b7);
        //FIN FASE B//
        faseA = new ListaEnlazada<JLabel>();
        faseA.add(a1);
        faseA.add(a2);
        faseA.add(a3);
        faseA.add(a4);
        faseA.add(a5);
        //FIN FASE A//
        getContentPane().setComponentZOrder(this.L1, 0);
        getContentPane().setComponentZOrder(this.L2, 0);
        getContentPane().setComponentZOrder(this.L3, 0);
        getContentPane().setComponentZOrder(this.L4, 0);
        getContentPane().setComponentZOrder(this.estrellaLabel, 0);
        getContentPane().setComponentZOrder(this.unoLabel, 0);
        getContentPane().setComponentZOrder(this.exitlbl, 0);
        getContentPane().setComponentZOrder(this.exitlbl2, 0);       
        estrellaLabel.setOpaque(true);
        estrellaLabel.setBackground(Color.BLACK);
        jugadores = new GameUser(L1,L2,L3,L4);
        contentcreator.linkObserver(subscriber1);
        unoLabel.setLocation(tablero.get(20).getLocation());
        cuadroFase.setEditable(false);
        estrellaLabel.setLocation(tablero.get(25).getLocation());     
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
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        t11 = new javax.swing.JLabel();
        t33 = new javax.swing.JLabel();
        t28 = new javax.swing.JLabel();
        d10 = new javax.swing.JLabel();
        d8 = new javax.swing.JLabel();
        t23 = new javax.swing.JLabel();
        t22 = new javax.swing.JLabel();
        t21 = new javax.swing.JLabel();
        t16 = new javax.swing.JLabel();
        t13 = new javax.swing.JLabel();
        t12 = new javax.swing.JLabel();
        t14 = new javax.swing.JLabel();
        t25 = new javax.swing.JLabel();
        t24 = new javax.swing.JLabel();
        t19 = new javax.swing.JLabel();
        t18 = new javax.swing.JLabel();
        t17 = new javax.swing.JLabel();
        t29 = new javax.swing.JLabel();
        t26 = new javax.swing.JLabel();
        t34 = new javax.swing.JLabel();
        t27 = new javax.swing.JLabel();
        t15 = new javax.swing.JLabel();
        t20 = new javax.swing.JLabel();
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
        jLabel91 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        d7 = new javax.swing.JLabel();
        t32 = new javax.swing.JLabel();
        t31 = new javax.swing.JLabel();
        t30 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        d9 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dadoLabel1 = new javax.swing.JLabel();
        dadoLabel2 = new javax.swing.JLabel();
        jname2 = new javax.swing.JLabel();
        jname4 = new javax.swing.JLabel();
        jname3 = new javax.swing.JLabel();
        jname1 = new javax.swing.JLabel();
        unoLabel = new javax.swing.JLabel();
        estrellaLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        estrella2 = new javax.swing.JLabel();
        estrella3 = new javax.swing.JLabel();
        estrella4 = new javax.swing.JLabel();
        moneda1 = new javax.swing.JLabel();
        moneda2 = new javax.swing.JLabel();
        moneda3 = new javax.swing.JLabel();
        moneda4 = new javax.swing.JLabel();
        estrella1 = new javax.swing.JLabel();
        cuadrovalor = new javax.swing.JTextField();
        moverbutton = new javax.swing.JButton();
        tirarbutton = new javax.swing.JButton();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dadoFase = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        moverFase = new javax.swing.JButton();
        cuadroFase = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        exitlbl2 = new javax.swing.JLabel();
        exitlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setBackground(new java.awt.Color(255, 255, 0));
        t1.setOpaque(true);
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, 50));

        t2.setBackground(new java.awt.Color(255, 0, 0));
        t2.setOpaque(true);
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 60, 50));

        t3.setBackground(new java.awt.Color(0, 0, 204));
        t3.setOpaque(true);
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 60, 50));

        t4.setBackground(new java.awt.Color(255, 255, 0));
        t4.setOpaque(true);
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 60, 50));

        t5.setBackground(new java.awt.Color(255, 0, 0));
        t5.setOpaque(true);
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 60, 50));

        t6.setBackground(new java.awt.Color(0, 0, 204));
        t6.setOpaque(true);
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 60, 50));

        t7.setBackground(new java.awt.Color(0, 0, 204));
        t7.setOpaque(true);
        jPanel1.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 60, 50));

        t8.setBackground(new java.awt.Color(0, 255, 0));
        t8.setOpaque(true);
        jPanel1.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 60, 50));

        t9.setBackground(new java.awt.Color(255, 255, 0));
        t9.setOpaque(true);
        jPanel1.add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 60, 50));

        t10.setBackground(new java.awt.Color(255, 0, 0));
        t10.setOpaque(true);
        jPanel1.add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 60, 50));

        t11.setBackground(new java.awt.Color(0, 255, 0));
        t11.setOpaque(true);
        jPanel1.add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 60, 50));

        t33.setBackground(new java.awt.Color(255, 0, 0));
        t33.setOpaque(true);
        jPanel1.add(t33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 60, 50));

        t28.setBackground(new java.awt.Color(0, 255, 0));
        t28.setOpaque(true);
        jPanel1.add(t28, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 60, 50));

        d10.setBackground(new java.awt.Color(255, 255, 0));
        d10.setOpaque(true);
        jPanel1.add(d10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 60, 50));

        d8.setBackground(new java.awt.Color(255, 255, 0));
        d8.setOpaque(true);
        jPanel1.add(d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 60, 50));

        t23.setBackground(new java.awt.Color(0, 255, 0));
        t23.setOpaque(true);
        jPanel1.add(t23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 60, 50));

        t22.setBackground(new java.awt.Color(255, 0, 0));
        t22.setOpaque(true);
        jPanel1.add(t22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 590, 60, 50));

        t21.setBackground(new java.awt.Color(0, 255, 0));
        t21.setOpaque(true);
        jPanel1.add(t21, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 60, 50));

        t16.setBackground(new java.awt.Color(255, 255, 0));
        t16.setOpaque(true);
        jPanel1.add(t16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, 60, 50));

        t13.setBackground(new java.awt.Color(255, 255, 0));
        t13.setOpaque(true);
        jPanel1.add(t13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 130, 60, 50));

        t12.setBackground(new java.awt.Color(0, 0, 204));
        t12.setOpaque(true);
        jPanel1.add(t12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, 60, 50));

        t14.setBackground(new java.awt.Color(0, 255, 0));
        t14.setOpaque(true);
        jPanel1.add(t14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 220, 60, 50));

        t25.setBackground(new java.awt.Color(255, 0, 0));
        t25.setOpaque(true);
        jPanel1.add(t25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 60, 50));

        t24.setBackground(new java.awt.Color(0, 0, 204));
        t24.setOpaque(true);
        jPanel1.add(t24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 60, 50));

        t19.setBackground(new java.awt.Color(255, 0, 0));
        t19.setOpaque(true);
        jPanel1.add(t19, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, 60, 50));

        t18.setBackground(new java.awt.Color(0, 255, 0));
        t18.setOpaque(true);
        jPanel1.add(t18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 590, 60, 50));

        t17.setBackground(new java.awt.Color(0, 0, 204));
        t17.setOpaque(true);
        jPanel1.add(t17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 500, 60, 50));

        t29.setBackground(new java.awt.Color(255, 255, 0));
        t29.setOpaque(true);
        jPanel1.add(t29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 60, 50));

        t26.setBackground(new java.awt.Color(0, 255, 0));
        t26.setOpaque(true);
        jPanel1.add(t26, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 60, 50));

        t34.setBackground(new java.awt.Color(0, 0, 204));
        t34.setOpaque(true);
        jPanel1.add(t34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, 50));

        t27.setBackground(new java.awt.Color(0, 0, 204));
        t27.setOpaque(true);
        jPanel1.add(t27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 60, 50));

        t15.setBackground(new java.awt.Color(255, 0, 0));
        t15.setOpaque(true);
        jPanel1.add(t15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 320, 60, 50));

        t20.setBackground(new java.awt.Color(255, 255, 0));
        t20.setOpaque(true);
        jPanel1.add(t20, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, 60, 50));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 30, 20));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 30, 20));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 30, 20));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 30, 20));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 250, 30, 20));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 30, 20));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 30, 20));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 30, 20));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 30, 20));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 30, 20));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 30, 20));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 180, 20, 40));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, 20, 40));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, 20, 40));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 460, 20, 40));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 550, 20, 40));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 20, 40));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, 30, 20));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, 30, 20));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 610, 30, 20));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 610, 30, 20));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, 30, 20));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 30, 20));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, 30, 20));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 30, 20));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 30, 20));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 30, 20));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 30, 20));

        b1.setBackground(new java.awt.Color(255, 255, 0));
        b1.setOpaque(true);
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 60, 50));

        d7.setBackground(new java.awt.Color(255, 255, 0));
        d7.setOpaque(true);
        jPanel1.add(d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 60, 50));

        t32.setBackground(new java.awt.Color(255, 255, 0));
        t32.setOpaque(true);
        jPanel1.add(t32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 60, 50));

        t31.setBackground(new java.awt.Color(255, 0, 0));
        t31.setOpaque(true);
        jPanel1.add(t31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 60, 50));

        t30.setBackground(new java.awt.Color(0, 255, 0));
        t30.setOpaque(true);
        jPanel1.add(t30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 60, 50));

        d1.setBackground(new java.awt.Color(255, 255, 0));
        d1.setOpaque(true);
        jPanel1.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 60, 50));

        a1.setBackground(new java.awt.Color(0, 0, 204));
        a1.setOpaque(true);
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 60, 50));

        d9.setBackground(new java.awt.Color(255, 255, 0));
        d9.setOpaque(true);
        jPanel1.add(d9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 60, 50));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 20, 40));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 20, 40));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 20, 40));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 20, 40));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 20, 40));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 20, 40));

        a3.setBackground(new java.awt.Color(0, 0, 204));
        a3.setOpaque(true);
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 60, 50));

        a2.setBackground(new java.awt.Color(0, 255, 0));
        a2.setOpaque(true);
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 60, 50));

        a4.setBackground(new java.awt.Color(255, 0, 0));
        a4.setOpaque(true);
        jPanel1.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 60, 50));

        a5.setBackground(new java.awt.Color(0, 0, 204));
        a5.setOpaque(true);
        jPanel1.add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 60, 50));

        b3.setBackground(new java.awt.Color(255, 255, 0));
        b3.setOpaque(true);
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 60, 50));

        d2.setBackground(new java.awt.Color(255, 255, 0));
        d2.setOpaque(true);
        jPanel1.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 60, 50));

        d3.setBackground(new java.awt.Color(255, 255, 0));
        d3.setOpaque(true);
        jPanel1.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 60, 50));

        d4.setBackground(new java.awt.Color(255, 255, 0));
        d4.setOpaque(true);
        jPanel1.add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 60, 50));

        b2.setBackground(new java.awt.Color(255, 255, 0));
        b2.setOpaque(true);
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 60, 50));

        d5.setBackground(new java.awt.Color(255, 255, 0));
        d5.setOpaque(true);
        jPanel1.add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 60, 50));

        d6.setBackground(new java.awt.Color(255, 255, 0));
        d6.setOpaque(true);
        jPanel1.add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 60, 50));

        b4.setBackground(new java.awt.Color(255, 255, 0));
        b4.setOpaque(true);
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 60, 50));

        c1.setBackground(new java.awt.Color(255, 0, 0));
        c1.setOpaque(true);
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, 60, 50));

        b5.setBackground(new java.awt.Color(255, 255, 0));
        b5.setOpaque(true);
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 60, 50));

        b6.setBackground(new java.awt.Color(255, 255, 0));
        b6.setOpaque(true);
        jPanel1.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 60, 50));

        b7.setBackground(new java.awt.Color(255, 255, 0));
        b7.setOpaque(true);
        jPanel1.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 60, 50));

        c2.setBackground(new java.awt.Color(0, 255, 0));
        c2.setOpaque(true);
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 60, 50));

        c3.setBackground(new java.awt.Color(0, 0, 204));
        c3.setOpaque(true);
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 60, 50));

        c4.setBackground(new java.awt.Color(0, 255, 0));
        c4.setOpaque(true);
        jPanel1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 60, 50));

        c5.setBackground(new java.awt.Color(255, 0, 0));
        c5.setOpaque(true);
        jPanel1.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 60, 50));

        c6.setBackground(new java.awt.Color(0, 255, 0));
        c6.setOpaque(true);
        jPanel1.add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 60, 50));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 30, 20));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, 30, 20));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 20, 40));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 20, 40));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 20, 40));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 20, 40));

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 20, 40));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 20, 40));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 20, 40));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 20, 40));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 20, 40));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 20, 40));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 20, 40));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 20, 40));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 20, 40));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 20, 40));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 20, 40));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 30, 20));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 30, 20));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 20, 40));

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 20, 40));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 30, 20));

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 30, 20));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 30, 20));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 30, 20));

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 30, 20));

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 30, 20));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 30, 20));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 30, 20));

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 350, 30, 20));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 20, 40));

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 20, 40));

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 30, 20));

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 30, 20));

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 30, 20));

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 30, 20));

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 30, 20));

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 30, 20));

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 510, 30, 20));

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 530, 30, 20));

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 30, 20));

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 30, 20));

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/izq.png"))); // NOI18N
        jPanel1.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 30, 20));

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/der.png"))); // NOI18N
        jPanel1.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 30, 20));

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 20, 40));

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 20, 40));

        jLabel1.setFont(new java.awt.Font("Orbitron", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FASE A");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 140, 30));

        jLabel2.setFont(new java.awt.Font("Orbitron", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FASE B");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 140, 30));

        jLabel3.setFont(new java.awt.Font("Orbitron", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FASE D");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 140, 30));

        jLabel4.setFont(new java.awt.Font("Orbitron", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FASE C");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 140, 30));

        dadoLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/dadogif.gif"))); // NOI18N
        jPanel1.add(dadoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 90, 100));

        dadoLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/dadogif.gif"))); // NOI18N
        jPanel1.add(dadoLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 90, 100));

        jname2.setBackground(new java.awt.Color(255, 204, 102));
        jname2.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        jname2.setForeground(new java.awt.Color(255, 255, 255));
        jname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 150, 50, 30));

        jname4.setBackground(new java.awt.Color(255, 204, 102));
        jname4.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        jname4.setForeground(new java.awt.Color(255, 255, 255));
        jname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 150, 50, 30));

        jname3.setBackground(new java.awt.Color(255, 204, 102));
        jname3.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        jname3.setForeground(new java.awt.Color(255, 255, 255));
        jname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 150, 50, 30));

        jname1.setBackground(new java.awt.Color(255, 204, 102));
        jname1.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        jname1.setForeground(new java.awt.Color(255, 255, 255));
        jname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 150, 50, 30));

        unoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/UNO.png"))); // NOI18N
        jPanel1.add(unoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 600, 30, 30));

        estrellaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrellaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/estrella.png"))); // NOI18N
        jPanel1.add(estrellaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 30, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/estrella.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 180, 30, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/moneda.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 240, 30, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/estrella.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 180, 30, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/moneda.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 240, 30, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/moneda.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 240, 30, 30));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/moneda.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 240, 30, 30));

        estrella2.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        estrella2.setForeground(new java.awt.Color(255, 255, 255));
        estrella2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrella2.setText("10");
        jPanel1.add(estrella2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 210, 50, 30));

        estrella3.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        estrella3.setForeground(new java.awt.Color(255, 255, 255));
        estrella3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrella3.setText("10");
        jPanel1.add(estrella3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 210, 50, 30));

        estrella4.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        estrella4.setForeground(new java.awt.Color(255, 255, 255));
        estrella4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrella4.setText("10");
        jPanel1.add(estrella4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 210, 50, 30));

        moneda1.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        moneda1.setForeground(new java.awt.Color(255, 255, 255));
        moneda1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneda1.setText("20");
        jPanel1.add(moneda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 270, 50, 30));

        moneda2.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        moneda2.setForeground(new java.awt.Color(255, 255, 255));
        moneda2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneda2.setText("20");
        jPanel1.add(moneda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 270, 50, 30));

        moneda3.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        moneda3.setForeground(new java.awt.Color(255, 255, 255));
        moneda3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneda3.setText("20");
        jPanel1.add(moneda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 270, 50, 30));

        moneda4.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        moneda4.setForeground(new java.awt.Color(255, 255, 255));
        moneda4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneda4.setText("20");
        jPanel1.add(moneda4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 270, 50, 30));

        estrella1.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        estrella1.setForeground(new java.awt.Color(255, 255, 255));
        estrella1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrella1.setText("10");
        jPanel1.add(estrella1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 210, 50, 30));

        cuadrovalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadrovalorActionPerformed(evt);
            }
        });
        jPanel1.add(cuadrovalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 110, 37, 24));

        moverbutton.setBackground(new java.awt.Color(0, 0, 0));
        moverbutton.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        moverbutton.setForeground(new java.awt.Color(255, 255, 255));
        moverbutton.setText("MOVER");
        moverbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(moverbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 110, -1, -1));

        tirarbutton.setBackground(new java.awt.Color(0, 0, 0));
        tirarbutton.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        tirarbutton.setForeground(new java.awt.Color(255, 255, 255));
        tirarbutton.setText("TIRAR");
        tirarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tirarbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(tirarbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, -1, -1));

        L1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 320, 30, 30));

        L2.setBackground(new java.awt.Color(204, 0, 153));
        jPanel1.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 320, 30, 30));

        L3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 320, 30, 30));

        L4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 320, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/start.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 40, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/gamelogo.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 510, 200, 180));

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/arriba.png"))); // NOI18N
        jPanel1.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 20, 40));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/abajo.png"))); // NOI18N
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 20, 40));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/estrella.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 180, 30, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/estrella.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 180, 30, 30));

        dadoFase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesDado/dadogif.gif"))); // NOI18N
        jPanel1.add(dadoFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 370, 90, 100));

        jButton1.setText("TIRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 480, -1, 30));

        moverFase.setText("MOVER");
        moverFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverFaseActionPerformed(evt);
            }
        });
        jPanel1.add(moverFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 480, -1, 30));
        jPanel1.add(cuadroFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 480, 50, 30));

        jLabel6.setFont(new java.awt.Font("Orbitron", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DADO FASES");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 350, 130, 30));

        exitlbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/SALIR.png"))); // NOI18N
        jPanel1.add(exitlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 30, 30));

        exitlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ImagesSelec/SALIR.png"))); // NOI18N
        jPanel1.add(exitlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuadrovalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadrovalorActionPerformed
    }//GEN-LAST:event_cuadrovalorActionPerformed
    /***
     * Método ImageIcon
     * @return image
     */
    private ImageIcon dadoGif(){
        
        imageGif = new ImageIcon("dadogif.gif");
        return imageGif;
    
    }
    /***
     * Método gennumero
     * @return Integer
     */
    private int gennumero(){
        Random random = new Random();
        valordado = random.nextInt(6);
        return valordado;
    
    }
    /***
     * 
     * @param valor Integer
     * @return ImageIcon
     */
    private ImageIcon setImage(int valor){
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
    /***
     * Método colocarEstrella 
     */

    private void colocarEstrella(){
        int posicion = Evento.getNumero(33);
        estrellaLabel.setLocation(tablero.get(posicion).getLocation());
        posicionEstrella = posicion;
        
    }
    /***
     * Método tirarDado
     * @param evt 
     */
    private void tirarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tirarbuttonActionPerformed
 
        if(tiro == false){  
            if ((FaseJug1 == true && turnoA == true)||(FaseJug2 == true && turnoB == true)||(FaseJug3 == true && turnoC == true)||(FaseJug4 == true && turnoD == true)){
                JOptionPane.showMessageDialog(null, "DEBE LANZAR EL DADO CORRESPONDIENTE A LOS EVENTOS");
            }else if (tiro == false){
                int valor1 = gennumero()+1;
                int valor2 = gennumero()+1;

                dadoLabel1.setIcon(setImage(valor1));
                dadoLabel2.setIcon(setImage(valor2));
                int total =+valor1+valor2;
                
                tiro = true;
                cuadrovalor.setText(""+total);
                if(valor == 0){
                    valor += total-1;
                }else{
                    valor+=total;
                }
                if (valor>=tablero.getSize()){
                    tiro = true;
                    valor =  Math.abs((valor - tablero.getSize()));
                    if (pasadas == GameUser.getCantidad()){
                        vueltasGen++;
                        pasadas = 0;
                    }else if (vueltasGen == 4){
                        controlObserver(vueltasGen,false,0,0);

                    }else{
                        pasadas++;
                    }
            }

                tiro = true;
                
            }
        
        }else{
            JOptionPane.showMessageDialog(null, "No puede tirar 2 veces los dados");
        }
    }//GEN-LAST:event_tirarbuttonActionPerformed
/***
 * Método Mover
 * @param evt 
 */
    private void moverbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverbuttonActionPerformed
        if (tiro == true){
        switch (GameUser.getCantidad()) {
            
            case 2:
                if (tiro == true){
                    if (turnoA == true && FaseJug1 == false){
                        L1.setLocation(tablero.get(valor).getLocation());
                        L1.setBackground(tablero.get(valor).getBackground());
                        valorA = valor;
                        Casilla.casilla(tablero.get(valor).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                        crearFase(1, valorA);
                        carta();
                        estrella();
                    }else if (turnoB == true && FaseJug2 == false){
                        
                        L2.setLocation(tablero.get(valor).getLocation());
                        L2.setBackground(tablero.get(valor).getBackground());
                        
                        valorB = valor;
                        Casilla.casilla(tablero.get(valor).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        crearFase(2,valorB);
                        verificar();
                        carta();
                        estrella();
                        activarRonda();
                    }else{
                        JOptionPane.showMessageDialog(null, "USTED ESTÁ EN UNA FASE UTILICE EL OTRO DADO");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Debe tirar los dados antes");
                    
                }   break;
            case 3:
                if (tiro == true ){
                    if (turnoA == true && FaseJug1 == false){
                        L1.setLocation(tablero.get(valor).getLocation());
                        L1.setBackground(tablero.get(valor).getBackground());
                        valorA = valor;
                        Casilla.casilla(tablero.get(valor).getBackground().toString(), moneda1,1);
                        
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                        crearFase(1,valorA);
                        carta();
                        estrella();
                        
                    }else if (turnoB == true && FaseJug2 == false){
                        L2.setLocation(tablero.get(valor).getLocation());
                        L2.setBackground(tablero.get(valor).getBackground());
                        valorB = valor;
                        Casilla.casilla(tablero.get(valor).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                        crearFase(2,valorB);
                        carta();
                        estrella();
                    }else if (turnoC == true && FaseJug3 == false){
                        L3.setLocation(tablero.get(valor).getLocation());
                        L3.setBackground(tablero.get(valor).getBackground());
                        
                        valorC = valor;
                        Casilla.casilla(tablero.get(valor).getBackground().toString(), moneda3,3);
                        
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        crearFase(3,valorC);
                        verificar();
                        carta();
                        estrella();
                        activarRonda();
                    }else{
                        JOptionPane.showMessageDialog(null, "USTED ESTÁ EN UNA FASE UTILICE EL OTRO DADO");
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "Debe tirar los dados antes");
                }
                break;
            case 4:
                if (tiro == true ){
                    if (turnoA == true && FaseJug1 == false){
                        L1.setLocation(tablero.get(valor).getLocation());
                        L1.setBackground(tablero.get(valor).getBackground());
                        
                        valorA = valor;
                        Casilla.casilla(tablero.get(valor).getBackground().toString(), moneda1,1);
                       
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                        
                        crearFase(1,valorA);
                        carta();
                        estrella();
                        
                    }else if (turnoB == true && FaseJug2 == false){
                        L2.setLocation(tablero.get(valor).getLocation());
                        L2.setBackground(tablero.get(valor).getBackground());
                        
                        valorB = valor;
                        Casilla.casilla(tablero.get(valor).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                        
                        crearFase(2, valorB);
                        carta();
                        estrella();
                    }else if (turnoC == true && FaseJug3 == false){
                        L3.setLocation(tablero.get(valor).getLocation());
                        L3.setBackground(tablero.get(valor).getBackground());
                        
                        valorC = valor;
                        Casilla.casilla(tablero.get(valor).getBackground().toString(), moneda3,3);
                        
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        valor = valorD;
                        
                        crearFase(3,valorC);
                        carta();
                        estrella();
                    }else if (turnoD==true && FaseJug4 == false){
                        L4.setLocation(tablero.get(valor).getLocation());
                        L4.setBackground(tablero.get(valor).getBackground());
                        
                        valorD = valor;
                        Casilla.casilla(tablero.get(valor).getBackground().toString(), moneda4,4);
                        
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        
                        
                        crearFase(4, valorD);
                        verificar();
                        carta();
                        estrella();
                        activarRonda();
                    }else{
                        JOptionPane.showMessageDialog(null, "USTED ESTÁ EN UNA FASE UTILICE EL OTRO DADO");
                    }
                     
                }else{
                    JOptionPane.showMessageDialog(null, "Debe tirar los dados antes");
                }
                break;
            default:
                break;
             
        }}
        
        
    }//GEN-LAST:event_moverbuttonActionPerformed
/***
 * Método moverenFases
 * @param evt 
 */
    private void moverFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverFaseActionPerformed
        if ((FaseJug1 == true && turnoA == true)||(FaseJug2 == true && turnoB == true)||(FaseJug3 == true && turnoC == true)||(FaseJug4 == true && turnoD == true)){
            if ((FaseInd1 == 1 && turnoA == true)||(FaseInd2 == 1 && turnoB == true)||(FaseInd3 == 1 && turnoC == true)||(FaseInd4 == 1&& turnoD == true)){
                movimientoA();
            }else if ((FaseInd1 == 2 && turnoA == true)||(FaseInd2 == 2 && turnoB == true)||(FaseInd3 == 2 && turnoC == true)||(FaseInd4 == 2 && turnoD == true)){
                manejoFaseB();
            }else if ((FaseInd1 == 3 && turnoA == true)||(FaseInd2 == 3 && turnoB == true)||(FaseInd3 == 3 && turnoC == true)||(FaseInd4 == 3 && turnoD == true)){
                faseCMovimiento();
            }else if ((FaseInd1 == 4 && turnoA == true)||(FaseInd2 == 4 && turnoB == true)||(FaseInd3 == 4 && turnoC == true)||(FaseInd4 == 4 && turnoD == true)){
                movimientoCTras();
            }else if ((FaseInd1 == 5 && turnoA == true)||(FaseInd2 == 5 && turnoB == true)||(FaseInd3 == 5 && turnoC == true)||(FaseInd4 == 5 && turnoD == true)){
                movimientoFaseDD();
            }else if ((FaseInd1 == 6 && turnoA == true)||(FaseInd2 == 6 && turnoB == true)||(FaseInd3 == 6 && turnoC == true)||(FaseInd4 == 6 && turnoD == true)){
                faseDReversa();
            }
        }else{
            JOptionPane.showMessageDialog(null,"NO ES POSIBLE MOVER AÚN");
        
        }
    
    }//GEN-LAST:event_moverFaseActionPerformed
    /***
     * Método activarRonda
     * activa un minijuego una vez finalizada cada ronda
     */
    private void activarRonda(){
        Evento evento = Evento.getInstance(1);
        evento.duelo();
    
    }
    /***
     * Método crearFase
     * @param jugador Integer
     * @param posicion Integer
     */
    public static void crearFase(int jugador,int posicion){
        if (jugador == 1 && FaseJug1 == false){
            switch (posicion) {
                case 6:
                    tiro = false;
                    FaseJug1 = true;
                    FaseInd1 = 1;
                    break;
                case 5:
                    tiro = false;
                    FaseJug1 = true;
                    FaseInd1 = 2;
                    break;
                case 16:
                    tiro = false;
                    FaseJug1 = true;
                    FaseInd1 = 3; 
                    break;
                case 23:
                    tiro = true;
                    FaseJug1 = true;
                    FaseInd1 = 4;
                    posicion1 = faseC.getSize();
                    break;
                case 100:
                    tiro = false;
                    FaseInd1 = 5;
                    FaseJug1 = true;
                    break;
                case 59:
                    posicion1 = faseD.getSize();
                    tiro = false;
                    FaseInd1 = 6;
                    FaseJug1 = true;
                    break;
                default:
                    break;
            }
        }else if (jugador == 2 && FaseJug2 == false){
            switch (posicion) {
                case 6:
                    tiro =  false;
                    FaseJug2 = true;
                    FaseInd2 = 1;
                    break;
                case 5:
                    tiro = false;
                    FaseJug2 = true;
                    FaseInd2 = 2;
                    break;
                case 16:
                    tiro = false;
                    FaseJug2 = true;
                    FaseInd2 = 3; 
                    break;
                case 23:
                    FaseJug2 = true;
                    FaseInd2 = 4;
                    posicion2 = faseC.getSize();
                    break;
                case 100:
                    tiro = false;
                    FaseInd2 = 5;
                    FaseJug2 = true;
                    break;
                case 59:
                    posicion2 = faseD.getSize();
                    tiro = false;
                    FaseInd2 = 6;
                    FaseJug2 = true;
                    break;
                default:
                    break;
            }
        }else if (jugador == 3 && FaseJug3 == false){
            switch (posicion) {
                case 6:
                    tiro = false;
                    FaseJug3 = true;
                    FaseInd3 = 1;
                    break;
                case 5:
                    tiro = false;
                    FaseJug3 = true;
                    FaseInd3 = 2;
                    break;
                case 16:
                    tiro = false;
                    FaseJug3 = true;
                    FaseInd3 = 3; 
                    break;
                case 23:
                    tiro = false;
                    FaseJug3 = true;
                    FaseInd3 = 4;
                    posicion3 = faseC.getSize();
                    break;
                case 100:
                    tiro = false;
                    FaseInd3 = 5;
                    FaseJug3 = true;
                    break;
                case 59:
                    posicion3 = faseD.getSize();
                    tiro = false;
                    FaseInd3 = 6;
                    FaseJug3 = true;
                    break;
                default:
                    break;
            }
        }else if (jugador == 4 && FaseJug4 == false){
            switch (posicion) {
                case 6:
                    tiro = false;
                    FaseJug4 = true;
                    FaseInd4 = 1;
                    break;
                case 5:
                    tiro = false;
                    FaseJug4 = true;
                    FaseInd4 = 2;
                    break;
                case 16:
                    tiro = false;
                    FaseJug4 = true;
                    FaseInd4 = 3; 
                    break;
                case 23:
                    tiro = false;
                    FaseJug4 = true;
                    FaseInd4 = 4;
                    posicion4 = faseC.getSize();
                    break;
                case 100:
                    tiro = false;
                    FaseInd4 = 5;
                    FaseJug4 = true;
                    break;
                case 59:
                    posicion4 = faseD.getSize();
                    tiro = false;
                    FaseInd4 = 6;
                    FaseJug4 = true;
                    break;
                default:
                    break;
            }
        }
    }
    /***
     * Método movimientoA 
     * Movimiento en FaseA
     */
    private void movimientoA(){
        
        switch (GameUser.getCantidad()) {
            case 2:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseA.getSize()){
                        valorA=13+Math.abs(posicion1-faseA.getSize());
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseA.get(posicion1).getLocation());
                        L1.setBackground(faseA.get(posicion1).getBackground());
                        Casilla.casilla(faseA.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                    }
                }else if (turnoB == true){
                    posicion2 += valorFase;
                    if(posicion2>=faseA.getSize()){
                        valorB = 13+Math.abs(posicion2-faseA.getSize());
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorA;
                        activarRonda();
                    }else{
                        
                        L2.setLocation(faseA.get(posicion2).getLocation());
                        L2.setBackground(faseA.get(posicion2).getBackground());
                        Casilla.casilla(faseA.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }   break;
            case 3:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseA.getSize()){
                        valorA=13+Math.abs(posicion1-faseA.getSize());
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseA.get(posicion1).getLocation());
                        L1.setBackground(faseA.get(posicion1).getBackground());
                        Casilla.casilla(faseA.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                    }
                }else if (turnoB == true){
                    posicion2 += valorFase;
                    if(posicion2>=faseA.getSize()){
                        valorB = 13+Math.abs(posicion2-faseA.getSize());
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorC;
                    }else{
                        
                        L2.setLocation(faseA.get(posicion2).getLocation());
                        L2.setBackground(faseA.get(posicion2).getBackground());
                        Casilla.casilla(faseA.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                    }
                }else if(turnoC == true){
                    posicion3 += valorFase;
                    if(posicion3>=faseA.getSize()){
                        valorC = 13+Math.abs(posicion3-faseA.getSize());
                        L3.setLocation(tablero.get(valorC).getLocation());
                        L3.setBackground(tablero.get(valorC).getBackground());
                        Casilla.casilla(tablero.get(valorC).getBackground().toString(), moneda3,3);
                        
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        posicion3 = -1;
                        FaseJug3 = false;
                        valor = valorA;
                        activarRonda();
                    }else{
                        
                        L3.setLocation(faseA.get(posicion3).getLocation());
                        L3.setBackground(faseA.get(posicion3).getBackground());
                        Casilla.casilla(faseA.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }break;
            case 4:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseA.getSize()){
                        valorA=13+Math.abs(posicion1-faseA.getSize());
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseA.get(posicion1).getLocation());
                        L1.setBackground(faseA.get(posicion1).getBackground());
                        Casilla.casilla(faseA.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                    }
                }else if (turnoB == true){
                    posicion2 += valorFase;
                    if(posicion2>=faseA.getSize()){
                        valorB = 13+Math.abs(posicion2-faseA.getSize());
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorC;
                    }else{
                        
                        L2.setLocation(faseA.get(posicion2).getLocation());
                        L2.setBackground(faseA.get(posicion2).getBackground());
                        Casilla.casilla(faseA.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                    }
                }else if(turnoC == true){
                    posicion3 += valorFase;
                    if(posicion3>=faseA.getSize()){
                        valorC = 13+Math.abs(posicion3-faseA.getSize());
                        L3.setLocation(tablero.get(valorC).getLocation());
                        L3.setBackground(tablero.get(valorC).getBackground());
                        Casilla.casilla(tablero.get(valorC).getBackground().toString(), moneda3,3);
                        
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        posicion3 = -1;
                        FaseJug3 = false;
                        valor = valorD;
                    }else{
                        
                        L3.setLocation(faseA.get(posicion3).getLocation());
                        L3.setBackground(faseA.get(posicion3).getBackground());
                        Casilla.casilla(faseA.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        valor = valorD;
                    }
                }else if(turnoD == true){
                    posicion4 += valorFase;
                    if(posicion4>=faseA.getSize()){
                        valorD = 13+Math.abs(posicion4-faseA.getSize());
                        L4.setLocation(tablero.get(valorD).getLocation());
                        L4.setBackground(tablero.get(valorD).getBackground());
                        Casilla.casilla(tablero.get(valorD).getBackground().toString(), moneda4,4);
                        
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        posicion4 = -1;
                        FaseJug4 = false;
                        valor = valorA;
                        activarRonda();
                    }else{
                        
                        L4.setLocation(faseA.get(posicion4).getLocation());
                        L4.setBackground(faseA.get(posicion4).getBackground());
                        Casilla.casilla(faseA.get(posicion4).getBackground().toString(), moneda4,4);
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }
                break;
            default:
                break;
        }
    }
    /***
     * Método manejoFaseB
     * Se encarga el movimiento de los personajes en la fase B
     */
    private void manejoFaseB(){
        
        switch (GameUser.getCantidad()) {
            case 2:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseB.getSize()){
                        valorA=14+Math.abs(posicion1-faseB.getSize());
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseB.get(posicion1).getLocation());
                        L1.setBackground(faseB.get(posicion1).getBackground());
                        Casilla.casilla(faseB.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                    }
                }else if (turnoB == true){
                    posicion2 += valorFase;
                    if(posicion2>=faseB.getSize()){
                        valorB = 14+Math.abs(posicion2-faseB.getSize());
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorA;
                        activarRonda();
                    }else{
                        
                        L2.setLocation(faseB.get(posicion2).getLocation());
                        L2.setBackground(faseB.get(posicion2).getBackground());
                        Casilla.casilla(faseB.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }   break;
            case 3:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseB.getSize()){
                        valorA=14+Math.abs(posicion1-faseB.getSize());
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseB.get(posicion1).getLocation());
                        L1.setBackground(faseB.get(posicion1).getBackground());
                        Casilla.casilla(faseB.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                    }
                }else if (turnoB == true){
                    posicion2 += valorFase;
                    if(posicion2>=faseB.getSize()){
                        valorB = 14+Math.abs(posicion2-faseB.getSize());
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorC;
                    }else{
                        
                        L2.setLocation(faseB.get(posicion2).getLocation());
                        L2.setBackground(faseB.get(posicion2).getBackground());
                        Casilla.casilla(faseB.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                    }
                }else if(turnoC == true){
                    posicion3 += valorFase;
                    if(posicion3>=faseB.getSize()){
                        valorC = 14+Math.abs(posicion3-faseB.getSize());
                        L3.setLocation(tablero.get(valorC).getLocation());
                        L3.setBackground(tablero.get(valorC).getBackground());
                        Casilla.casilla(tablero.get(valorC).getBackground().toString(), moneda3,3);
                        
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        posicion3 = -1;
                        FaseJug3 = false;
                        valor = valorA;
                        activarRonda();
                    }else{
                        
                        L3.setLocation(faseB.get(posicion3).getLocation());
                        L3.setBackground(faseB.get(posicion3).getBackground());
                        Casilla.casilla(faseB.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }break;
            case 4:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseB.getSize()){
                        valorA=14+Math.abs(posicion1-faseB.getSize());
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseB.get(posicion1).getLocation());
                        L1.setBackground(faseB.get(posicion1).getBackground());
                        Casilla.casilla(faseB.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                    }
                }else if (turnoB == true){
                    posicion2 += valorFase;
                    if(posicion2>=faseB.getSize()){
                        valorB = 14+Math.abs(posicion2-faseB.getSize());
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorC;
                    }else{
                        
                        L2.setLocation(faseB.get(posicion2).getLocation());
                        L2.setBackground(faseB.get(posicion2).getBackground());
                        Casilla.casilla(faseB.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                    }
                }else if(turnoC == true){
                    posicion3 += valorFase;
                    if(posicion3>=faseB.getSize()){
                        valorC = 14+Math.abs(posicion3-faseB.getSize());
                        L3.setLocation(tablero.get(valorC).getLocation());
                        L3.setBackground(tablero.get(valorC).getBackground());
                        Casilla.casilla(tablero.get(valorC).getBackground().toString(), moneda3,3);
                        
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        posicion3 = -1;
                        FaseJug3 = false;
                        valor = valorD;
                    }else{
                        
                        L3.setLocation(faseB.get(posicion3).getLocation());
                        L3.setBackground(faseB.get(posicion3).getBackground());
                        Casilla.casilla(faseB.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        valor = valorD;
                    }
                }else if(turnoD == true){
                    posicion4 += valorFase;
                    if(posicion4>=faseB.getSize()){
                        valorD = 14+Math.abs(posicion4-faseB.getSize());
                        L4.setLocation(tablero.get(valorD).getLocation());
                        L4.setBackground(tablero.get(valorD).getBackground());
                        Casilla.casilla(tablero.get(valorD).getBackground().toString(), moneda4,4);
                        
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        posicion4 = -1;
                        FaseJug4 = false;
                        valor = valorA;
                        activarRonda();
                        
                    }else{
                        
                        L4.setLocation(faseB.get(posicion4).getLocation());
                        L4.setBackground(faseB.get(posicion4).getBackground());
                        Casilla.casilla(faseB.get(posicion4).getBackground().toString(), moneda4,4);
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }
                break;
            default:
                break;
        }
    
    }
    /***
     * Método faseCMovimiento
     * Se encarga del movimiento de los personajes en una dirección en la FaseC
     */
    private void faseCMovimiento(){
        
        switch (GameUser.getCantidad()) {
            
            case 2:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseC.getSize()){
                        valorA=23+Math.abs(posicion1-faseC.getSize());
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseC.get(posicion1).getLocation());
                        L1.setBackground(faseC.get(posicion1).getBackground());
                        Casilla.casilla(faseC.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                    }
                }else if (turnoB == true){
                    posicion2 += valorFase;
                    if(posicion2>=faseC.getSize()){
                        valorB = 23+Math.abs(posicion2-faseC.getSize());
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorA;
                        activarRonda();
                    }else{
                        
                        L2.setLocation(faseC.get(posicion2).getLocation());
                        L2.setBackground(faseC.get(posicion2).getBackground());
                        Casilla.casilla(faseC.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }   break;
            case 3:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseC.getSize()){
                        valorA=23+Math.abs(posicion1-faseC.getSize());
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseC.get(posicion1).getLocation());
                        L1.setBackground(faseC.get(posicion1).getBackground());
                        Casilla.casilla(faseC.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                        
                    }
                }else if (turnoB == true){
                    posicion2 += valorFase;
                    if(posicion2>=faseC.getSize()){
                        valorB = 23+Math.abs(posicion2-faseC.getSize());
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorC;
                        
                    }else{
                        
                        L2.setLocation(faseC.get(posicion2).getLocation());
                        L2.setBackground(faseC.get(posicion2).getBackground());
                        Casilla.casilla(faseC.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                        
                    }
                }else if(turnoC == true){
                    posicion3 += valorFase;
                    if(posicion3>=faseC.getSize()){
                        valorC = 23+Math.abs(posicion3-faseC.getSize());
                        L3.setLocation(tablero.get(valorC).getLocation());
                        L3.setBackground(tablero.get(valorC).getBackground());
                        Casilla.casilla(tablero.get(valorC).getBackground().toString(), moneda3,3);
                        
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        posicion3 = -1;
                        FaseJug3 = false;
                        valor = valorA;
                        activarRonda();
                    }else{
                        
                        L3.setLocation(faseC.get(posicion3).getLocation());
                        L3.setBackground(faseC.get(posicion3).getBackground());
                        Casilla.casilla(faseC.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }break;
            case 4:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseC.getSize()){
                        valorA=23+Math.abs(posicion1-faseC.getSize());
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseC.get(posicion1).getLocation());
                        L1.setBackground(faseC.get(posicion1).getBackground());
                        Casilla.casilla(faseC.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                    }
                }else if (turnoB == true){
                    posicion2 += valorFase;
                    if(posicion2>=faseC.getSize()){
                        valorB = 23+Math.abs(posicion2-faseC.getSize());
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorC;
                    }else{
                        
                        L2.setLocation(faseC.get(posicion2).getLocation());
                        L2.setBackground(faseC.get(posicion2).getBackground());
                        Casilla.casilla(faseC.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                    }
                }else if(turnoC == true){
                    posicion3 += valorFase;
                    if(posicion3>=faseC.getSize()){
                        valorC = 23+Math.abs(posicion3-faseC.getSize());
                        L3.setLocation(tablero.get(valorC).getLocation());
                        L3.setBackground(tablero.get(valorC).getBackground());
                        Casilla.casilla(tablero.get(valorC).getBackground().toString(), moneda3,3);
                        
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        posicion3 = -1;
                        FaseJug3 = false;
                        valor = valorD;
                    }else{
                        
                        L3.setLocation(faseC.get(posicion3).getLocation());
                        L3.setBackground(faseC.get(posicion3).getBackground());
                        Casilla.casilla(faseC.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        valor = valorD;
                    }
                }else if(turnoD == true){
                    posicion4 += valorFase;
                    if(posicion4>=faseC.getSize()){
                        valorD = 23+Math.abs(posicion4-faseC.getSize());
                        L4.setLocation(tablero.get(valorD).getLocation());
                        L4.setBackground(tablero.get(valorD).getBackground());
                        Casilla.casilla(tablero.get(valorD).getBackground().toString(), moneda4,4);
                        
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        posicion4 = -1;
                        FaseJug4 = false;
                        valor = valorA;
                        activarRonda();
                    }else{
                        
                        L4.setLocation(faseC.get(posicion4).getLocation());
                        L4.setBackground(faseC.get(posicion4).getBackground());
                        Casilla.casilla(faseC.get(posicion4).getBackground().toString(), moneda4,4);
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }
                break;
            default:
                break;
        }
    
    }
    
    /***
     * Método movimientoCTras
     * Se encarga del movimiento de los personajes en la faseC en la otra dirección
     */
    private void movimientoCTras(){
        
        switch (GameUser.getCantidad()) {
            case 2:
                if (turnoA == true){
                    posicion1 = posicion1 - valorFase;
                    if(posicion1<0){
                        valorA=16+(Math.abs(posicion1)-1);
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseC.get(posicion1).getLocation());
                        L1.setBackground(faseC.get(posicion1).getBackground());
                        Casilla.casilla(faseC.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                        
                    }

                }else if (turnoB == true){
                    posicion2 = posicion2- valorFase;
                    if(posicion2<0){
                        valorB = 16+(Math.abs(posicion2)-1);
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorA;
                        activarRonda();
                    }else{
                        
                        L2.setLocation(faseC.get(posicion2).getLocation());
                        L2.setBackground(faseC.get(posicion2).getBackground());
                        Casilla.casilla(faseC.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }   break;
            case 3:
                if (turnoA == true){
                    posicion1 = posicion1 - valorFase;
                    if(posicion1<0){
                        valorA=16+(Math.abs(posicion1)-1);
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseC.get(posicion1).getLocation());
                        L1.setBackground(faseC.get(posicion1).getBackground());
                        Casilla.casilla(faseC.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                    }

                }else if (turnoB == true){
                    posicion2 = posicion2- valorFase;
                    if(posicion2<0){
                        valorB = 16+(Math.abs(posicion2)-1);
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorC;
                    }else{
                        
                        L2.setLocation(faseC.get(posicion2).getLocation());
                        L2.setBackground(faseC.get(posicion2).getBackground());
                        Casilla.casilla(faseC.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                    }
                }else if (turnoC == true){
                    posicion3 = posicion3 - valorFase;
                    if(posicion3<0){
                        valorC = 16+(Math.abs(posicion3)-1);
                        L3.setLocation(tablero.get(valorC).getLocation());
                        L3.setBackground(tablero.get(valorC).getBackground());
                        Casilla.casilla(tablero.get(valorC).getBackground().toString(), moneda3,3);
                        
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        posicion3 = -1;
                        FaseJug3 = false;
                        valor = valorA;
                        activarRonda();
                    }else{
                        
                        L3.setLocation(faseC.get(posicion3).getLocation());
                        L3.setBackground(faseC.get(posicion3).getBackground());
                        Casilla.casilla(faseC.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }break;
            case 4:
                if (turnoA == true){
                    posicion1 = posicion1 - valorFase;
                    if(posicion1<0){
                        valorA=16+(Math.abs(posicion1)-1);
                        
                        L1.setLocation(tablero.get(valorA).getLocation());
                        L1.setBackground(tablero.get(valorA).getBackground());
                        Casilla.casilla(tablero.get(valorA).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        posicion1 = -1;
                        FaseJug1 = false;
                        valor = valorB;
                        
                    }else{
                        L1.setLocation(faseC.get(posicion1).getLocation());
                        L1.setBackground(faseC.get(posicion1).getBackground());
                        Casilla.casilla(faseC.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                    }

                }else if (turnoB == true){
                    posicion2 = posicion2- valorFase;
                    if(posicion2<0){
                        valorB = 16+(Math.abs(posicion2)-1);
                        L2.setLocation(tablero.get(valorB).getLocation());
                        L2.setBackground(tablero.get(valorB).getBackground());
                        Casilla.casilla(tablero.get(valorB).getBackground().toString(), moneda2,2);
                        
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        posicion2 = -1;
                        FaseJug2 = false;
                        valor = valorC;
                    }else{
                        
                        L2.setLocation(faseC.get(posicion2).getLocation());
                        L2.setBackground(faseC.get(posicion2).getBackground());
                        Casilla.casilla(faseC.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                    }
                }else if (turnoC == true){
                    posicion3 = posicion3 - valorFase;
                    if(posicion3<0){
                        valorC = 16+(Math.abs(posicion3)-1);
                        L3.setLocation(tablero.get(valorC).getLocation());
                        L3.setBackground(tablero.get(valorC).getBackground());
                        Casilla.casilla(tablero.get(valorC).getBackground().toString(), moneda3,3);
                        
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        posicion3 = -1;
                        FaseJug3 = false;
                        valor = valorD;
                    }else{
                        
                        L3.setLocation(faseC.get(posicion3).getLocation());
                        L3.setBackground(faseC.get(posicion3).getBackground());
                        Casilla.casilla(faseC.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        valor = valorD;
                    }
                }else if (turnoD == true){
                    posicion4 = posicion4 - valorFase;
                    if(posicion4<0){
                        valorD = 16+(Math.abs(posicion4)-1);
                        L4.setLocation(tablero.get(valorD).getLocation());
                        L4.setBackground(tablero.get(valorD).getBackground());
                        Casilla.casilla(tablero.get(valorD).getBackground().toString(), moneda4,4);
                        
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        posicion4 = -1;
                        FaseJug4 = false;
                        valor = valorA;
                        activarRonda();
                    }else{
                        
                        L4.setLocation(faseC.get(posicion4).getLocation());
                        L4.setBackground(faseC.get(posicion4).getBackground());
                        Casilla.casilla(faseC.get(posicion4).getBackground().toString(), moneda4,4);
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        activarRonda();
                    }
                }break;
        }
    
    }
    /***
     * Método movimientoFaseDD
     * Se encarga del movimiento en la fase D en una direccion
     */
    public void movimientoFaseDD(){
        switch (GameUser.getCantidad()) {
            case 2:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseD.getSize()){
                        posicion1 = Math.abs(posicion1-faseD.getSize());
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                        salirFaseD(1,posicion1);
                        
                    }else{
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(1,posicion1);
                    }
                }else if (turnoB == true){
                    posicion2+=valorFase;
                    if(posicion2>=faseD.getSize()){
                        posicion2 = Math.abs(posicion2-faseD.getSize());
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(2,posicion2);
                        
                    }else{
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(2,posicion2);
                        activarRonda();
                    }
                }   break;
            case 3:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseD.getSize()){
                        posicion1 = Math.abs(posicion1-faseD.getSize());
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                        salirFaseD(1,posicion1);
                        
                    }else{
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(1,posicion1);
                    }
                }else if (turnoB == true){
                    posicion2+=valorFase;
                    if(posicion2>=faseD.getSize()){
                        posicion2 = Math.abs(posicion2-faseD.getSize());
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                        salirFaseD(2,posicion2);
                        
                    }else{
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                        salirFaseD(2,posicion2);
                    }
                }else if (turnoC == true){
                    posicion3+=valorFase;
                    if(posicion3>=faseD.getSize()){
                        posicion3 = Math.abs(posicion3-faseD.getSize());
                        L3.setLocation(faseD.get(posicion3).getLocation());
                        L3.setBackground(faseD.get(posicion3).getBackground());
                        Casilla.casilla(faseD.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(3,posicion3);
                        
                    }else{
                        L3.setLocation(faseD.get(posicion3).getLocation());
                        L3.setBackground(faseD.get(posicion3).getBackground());
                        Casilla.casilla(faseD.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(3,posicion3);
                        activarRonda();
                    }
                }   break;
            case 4:
                if (turnoA == true){
                    posicion1+=valorFase;
                    if(posicion1>=faseD.getSize()){
                        posicion1 = Math.abs(posicion1-faseD.getSize());
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                        salirFaseD(1,posicion1);
                        
                    }else{
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(1,posicion1);
                    }
                }else if (turnoB == true){
                    posicion2+=valorFase;
                    if(posicion2>=faseD.getSize()){
                        posicion2 = Math.abs(posicion2-faseD.getSize());
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                        salirFaseD(2,posicion2);
                        
                    }else{
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                        salirFaseD(2,posicion2);
                    }
                }else if (turnoC == true){
                    posicion3+=valorFase;
                    if(posicion3>=faseD.getSize()){
                        posicion3 = Math.abs(posicion3-faseD.getSize());
                        L3.setLocation(faseD.get(posicion3).getLocation());
                        L3.setBackground(faseD.get(posicion3).getBackground());
                        Casilla.casilla(faseD.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        valor = valorD;
                        salirFaseD(3,posicion3);
                        
                    }else{
                        L3.setLocation(faseD.get(posicion3).getLocation());
                        L3.setBackground(faseD.get(posicion3).getBackground());
                        Casilla.casilla(faseD.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        valor = valorD;
                        salirFaseD(3,posicion3);
                    }
                }else if (turnoD == true){
                    posicion4+=valorFase;
                    if(posicion4>=faseD.getSize()){
                        posicion4 = Math.abs(posicion4-faseD.getSize());
                        L4.setLocation(faseD.get(posicion4).getLocation());
                        L4.setBackground(faseD.get(posicion4).getBackground());
                        Casilla.casilla(faseD.get(posicion4).getBackground().toString(), moneda4,4);
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(4,posicion4);
                        
                    }else{
                        L4.setLocation(faseD.get(posicion4).getLocation());
                        L4.setBackground(faseD.get(posicion4).getBackground());
                        Casilla.casilla(faseD.get(posicion4).getBackground().toString(), moneda4,4);
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(4,posicion4);
                        activarRonda();
                    }
                }   break;
            default:
                break;
        }
    
    
    }
    /***
     * Método faseDReversa
     * Se encarga del movimiento en la fase D en la otra direccion
     */
    public void faseDReversa(){
        switch (GameUser.getCantidad()) {
            case 2:
                if (turnoA == true){
                    posicion1-=valorFase;
                    if(posicion1<0){
                        posicion1 = faseD.getSize()-Math.abs(posicion1);
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                        salirFaseD(1,posicion1);
                        
                    }else{
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(1,posicion1);
                    }
                }else if (turnoB == true){
                    posicion2-=valorFase;
                    if(posicion2<0){
                        posicion2 = faseD.getSize()-Math.abs(posicion2);
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(2,posicion2);
                        activarRonda();
                        
                    }else{
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(2,posicion2);
                        activarRonda();
                    }
                }   break;
            case 3:
                if (turnoA == true){
                    posicion1-=valorFase;
                    if(posicion1<0){
                        posicion1 = faseD.getSize()-Math.abs(posicion1);
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                        salirFaseD(1,posicion1);
                        
                    }else{
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(1,posicion1);
                    }
                }else if (turnoB == true){
                    posicion2-=valorFase;
                    if(posicion2<0){
                        posicion2 = faseD.getSize()-Math.abs(posicion2);
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                        salirFaseD(2,posicion2);
                        
                    }else{
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                        salirFaseD(2,posicion2);
                    }
                }else if (turnoC == true){
                    posicion3-=valorFase;
                    if(posicion3<0){
                        posicion3 = faseD.getSize()-Math.abs(posicion3);
                        L3.setLocation(faseD.get(posicion3).getLocation());
                        L3.setBackground(faseD.get(posicion3).getBackground());
                        Casilla.casilla(faseD.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(3,posicion3);
                        activarRonda();
                        
                    }else{
                        L3.setLocation(faseD.get(posicion3).getLocation());
                        L3.setBackground(faseD.get(posicion3).getBackground());
                        Casilla.casilla(faseD.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(3,posicion3);
                        activarRonda();
                    }
                }   break;
            case 4:
                if (turnoA == true){
                    posicion1-=valorFase;
                    if(posicion1<0){
                        posicion1 = faseD.getSize()-Math.abs(posicion1);
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorB;
                        salirFaseD(1,posicion1);
                        
                    }else{
                        L1.setLocation(faseD.get(posicion1).getLocation());
                        L1.setBackground(faseD.get(posicion1).getBackground());
                        Casilla.casilla(faseD.get(posicion1).getBackground().toString(), moneda1,1);
                        turnoA = false;
                        turnoB = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(1,posicion1);
                    }
                }else if (turnoB == true){
                    posicion2-=valorFase;
                    if(posicion2<0){
                        posicion2 = faseD.getSize()-Math.abs(posicion2);
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                        salirFaseD(2,posicion2);
                        
                    }else{
                        L2.setLocation(faseD.get(posicion2).getLocation());
                        L2.setBackground(faseD.get(posicion2).getBackground());
                        Casilla.casilla(faseD.get(posicion2).getBackground().toString(), moneda2,2);
                        turnoB = false;
                        turnoC = true;
                        tiro = false;
                        valor = valorC;
                        salirFaseD(2,posicion2);
                    }
                }else if (turnoC == true){
                    posicion3-=valorFase;
                    if(posicion3<0){
                        posicion3 = faseD.getSize()-Math.abs(posicion3);
                        L3.setLocation(faseD.get(posicion3).getLocation());
                        L3.setBackground(faseD.get(posicion3).getBackground());
                        Casilla.casilla(faseD.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        valor = valorD;
                        salirFaseD(3,posicion3);
                        
                    }else{
                        L3.setLocation(faseD.get(posicion3).getLocation());
                        L3.setBackground(faseD.get(posicion3).getBackground());
                        Casilla.casilla(faseD.get(posicion3).getBackground().toString(), moneda3,3);
                        turnoC = false;
                        turnoD = true;
                        tiro = false;
                        valor = valorD;
                        salirFaseD(3,posicion3);
                    }
                }else if (turnoD == true){
                    posicion4-=valorFase;
                    if(posicion4<0){
                        posicion4 = faseD.getSize()-Math.abs(posicion4);
                        L4.setLocation(faseD.get(posicion4).getLocation());
                        L4.setBackground(faseD.get(posicion4).getBackground());
                        Casilla.casilla(faseD.get(posicion4).getBackground().toString(), moneda4,4);
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(4,posicion4);
                        activarRonda();
                        
                    }else{
                        L4.setLocation(faseD.get(posicion4).getLocation());
                        L4.setBackground(faseD.get(posicion4).getBackground());
                        Casilla.casilla(faseD.get(posicion4).getBackground().toString(), moneda4,4);
                        turnoD = false;
                        turnoA = true;
                        tiro = false;
                        valor = valorA;
                        salirFaseD(4,posicion4);
                        activarRonda();
                    }
                }   break;
            default:
                break;
        }
    
    }
    /***
     * Método salirFaseD
     * se encarga de teletransportar al jugador para que salga de la faseD
     * @param jugador Integer
     * @param posicion Integer
     */
    private void salirFaseD(int jugador, int posicion){
        if (jugador == 1 && (faseD.get(0) == faseD.get(posicion)|| faseD.get(5) == faseD.get(posicion))){
            FaseJug1 = false;
            L1.setLocation(tablero.get(1).getLocation());
            L1.setBackground(tablero.get(1).getBackground());
            valorA = 1;
            posicion1 = -1;
            JOptionPane.showMessageDialog(null, "HA LOGRADO SALIR DE LA FASE D");
        }else if (jugador == 2 && (faseD.get(0) == faseD.get(posicion)|| faseD.get(5) == faseD.get(posicion))){
            FaseJug2 = false;
            L2.setLocation(tablero.get(1).getLocation());
            L2.setBackground(tablero.get(1).getBackground());
            valorB = 1;
            posicion2 = -1;
            JOptionPane.showMessageDialog(null, "HA LOGRADO SALIR DE LA FASE D");
        }else if (jugador == 3 && (faseD.get(0) == faseD.get(posicion)|| faseD.get(5) == faseD.get(posicion))){
            FaseJug3 = false;
            L3.setLocation(tablero.get(1).getLocation());
            L3.setBackground(tablero.get(1).getBackground());
            valorC = 1;
            posicion3 = -1;
            JOptionPane.showMessageDialog(null, "HA LOGRADO SALIR DE LA FASE D");
        }else if (jugador == 4 && (faseD.get(0) == faseD.get(posicion)|| faseD.get(5) == faseD.get(posicion))){
            FaseJug4 = false;
            L4.setLocation(tablero.get(1).getLocation());
            L4.setBackground(tablero.get(1).getBackground());
            valorD = 1;
            posicion4 = -1;
            JOptionPane.showMessageDialog(null, "HA LOGRADO SALIR DE LA FASE D");
        }
    }
    /***
     * Método Tirar Dado para las fases
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        if (((FaseJug1 == true && turnoA == true)||(FaseJug2 == true && turnoB == true)||(FaseJug3 == true && turnoC == true)||(FaseJug4 == true && turnoD == true))&& tiro == false){
                valorFase = gennumero()+1;
                dadoFase.setIcon(setImage(valorFase));
                cuadroFase.setText(""+valorFase);
                tiro = true;
            
        }else{
            JOptionPane.showMessageDialog(null, "NO SE PUEDE LANZAR EL DADO");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    /***
     * Método Teletransporte
     * Se encarga de teletransportar a un jugador de un lugar a otro
     * @param usuario Integer
     * @param lugar Integer
     */
    public static void teletransporte(int usuario, int lugar){
        JOptionPane.showMessageDialog(null, "SERÁS TELESTRANSPORTADO A UN NUEVO LUGAR");
        switch (usuario) {
            case 1:
                L1.setLocation(tablero.get(lugar).getLocation());
                L1.setBackground(tablero.get(lugar).getBackground());
                valorA = lugar;
                
                break;
            case 2:
                L2.setLocation(tablero.get(lugar).getLocation());
                L2.setBackground(tablero.get(lugar).getBackground());
                valorB = lugar;
                
                break;
            case 3:
                L3.setLocation(tablero.get(lugar).getLocation());
                L3.setBackground(tablero.get(lugar).getBackground());
                valorC = lugar;
                break;
            case 4:
                L4.setLocation(tablero.get(lugar).getLocation());
                L4.setBackground(tablero.get(lugar).getBackground());
                valorD = lugar;
                break;
            default:
                break;
        }
    }
    /***
     * Método cambioLugar
     * Se encarga de cambiar de lugar a dos personajes
     * @param jugador1 Integer
     * @param jugador2 Integer
     */
    public static void cambioLugar(int jugador1, int jugador2){
        JOptionPane.showMessageDialog(null, "UN AMIGO Y VOS CAMBIARÁN DE LUGAR SIMULTANEAMENTE!!!!!");
        if ((jugador1 == 1 && jugador2 == 2) || (jugador1 == 2 && jugador2 == 1)){
            
            int temp = valorB;
             L1.setLocation(tablero.get(valorB).getLocation());
             L1.setBackground(tablero.get(valorB).getBackground());
             L2.setLocation(tablero.get(valorA).getLocation());
             L2.setBackground(tablero.get(valorA).getBackground());
             valorB = valorA;
             valorA = temp; 
        }else if ((jugador1 == 1 && jugador2 == 3) || (jugador1 == 3 && jugador2 == 1)){
            int temp = valorC;
            L1.setLocation(tablero.get(valorC).getLocation());
            L1.setBackground(tablero.get(valorC).getBackground());
            L3.setLocation(tablero.get(valorA).getLocation());
            L3.setBackground(tablero.get(valorA).getBackground());
            valorC = valorA;
            valorA = temp; 
        }else if ((jugador1 == 1 && jugador2 == 4) || (jugador1 == 4 && jugador2 == 1)){
            int temp = valorD;
            L1.setLocation(tablero.get(valorD).getLocation());
            L1.setBackground(tablero.get(valorD).getBackground());
            L4.setLocation(tablero.get(valorA).getLocation());
            L4.setBackground(tablero.get(valorA).getBackground());
            valorD = valorA;
            valorA = temp; 
        }else if ((jugador1 == 2 && jugador2 == 3) || (jugador1 == 3 && jugador2 == 2)){
            int temp = valorC;
            L2.setLocation(tablero.get(valorC).getLocation());
            L2.setBackground(tablero.get(valorC).getBackground());
            L3.setLocation(tablero.get(valorB).getLocation());
            L3.setBackground(tablero.get(valorB).getBackground());
            valorC = valorB;
            valorB = temp; 
        }else if ((jugador1 == 2 && jugador2 == 4) || (jugador1 == 4 && jugador2 == 2)){
            int temp = valorD;
            L2.setLocation(tablero.get(valorD).getLocation());
            L2.setBackground(tablero.get(valorD).getBackground());
            L4.setLocation(tablero.get(valorB).getLocation());
            L4.setBackground(tablero.get(valorB).getBackground());
            valorD = valorB;
            valorB = temp; 
        }else if ((jugador1 == 3 && jugador2 == 4) || (jugador1 == 4 && jugador2 == 3)){
            int temp = valorD;
            L3.setLocation(tablero.get(valorD).getLocation());
            L3.setBackground(tablero.get(valorD).getBackground());
            L4.setLocation(tablero.get(valorC).getLocation());
            L4.setBackground(tablero.get(valorC).getBackground());
            valorD = valorC;
            valorC = temp; 
        }
    }
    /***
     * Método getMoneda1
     * @return JLabel 
     */
    public static JLabel getMoneda1() {
        return moneda1;
    }
    /***
     * Método getMoneda2
     * @return JLabel 
     */
    public static JLabel getMoneda2() {
        return moneda2;
    }
    /***
     * Método getMoneda3
     * @return JLabel 
     */
    public static JLabel getMoneda3() {
        return moneda3;
    }
    /***
     * Método getMoneda4
     * @return JLabel 
     */
    public static JLabel getMoneda4() {
        return moneda4;
    }
    /***
     * Método getEstrella1
     * @return JLabel 
     */
    public static JLabel getEstrella1() {
        return estrella1;
    }
    /***
     * Método getEstrella1
     * @return JLabel 
     */
    public static JLabel getEstrella2() {
        return estrella2;
    }
    /***
     * Método getEstrella1
     * @return JLabel 
     */
    public static JLabel getEstrella3() {
        return estrella3;
    }
    /***
     * Método getEstrella1
     * @return JLabel 
     */
    public static JLabel getEstrella4() {
        return estrella4;
    }


    
    /***
     * Método Verificar
     * se encarga de ver si dos jugadores están en la misma posicion para activar un duelo y notificar al observer
     * se encarga de ver si ya se cumplieron el numero de vueltas requeridas para terminar el juego y notificar al observer
     */
    private void verificar(){
        if ((valorA==valorB)&&(valorA!=0&&valorB!=0)){
            hayDuelo = true;
            controlObserver(vueltasGen,hayDuelo,1,2);
            hayDuelo = false;
        }else if ((valorA==valorC)&&(valorA!=0&&valorC!=0)){
            hayDuelo = true;
            controlObserver(vueltasGen,hayDuelo,1,3);
            hayDuelo = false;
        }else if ((valorA==valorD)&&(valorA!=0&&valorD!=0)){
            hayDuelo = true;
            controlObserver(vueltasGen,hayDuelo,1,4);
            hayDuelo = false;
        }else if ((valorC==valorB)&&(valorC!=0&&valorB!=0)){
            hayDuelo = true;
            controlObserver(vueltasGen,hayDuelo,2,3);
            hayDuelo = false;
        }else if ((valorD==valorB)&&(valorD!=0&&valorB!=0)){
            hayDuelo = true;
            controlObserver(vueltasGen,hayDuelo,2,4);
            hayDuelo = false;
        }else if ((valorC==valorD)&&(valorC!=0&&valorD!=0)){
            hayDuelo = true;
            controlObserver(vueltasGen,hayDuelo,3,4);
            hayDuelo = false;
        }
        
    }
    /***
     * Método controlObserver
     * Se encarga de informar al subject si es tiempo de terminar el juego o de si hay 2 jugadores en la misma casilla
     * @param vueltasT Integer
     * @param dueloActivator Integer
     */
    private void controlObserver(int vueltasT, boolean dueloActivator,int jug1, int jug2){
        contentcreator.avisar(vueltasGen,hayDuelo, jug1,jug2);
    }
    /***
     * Método colocarCarta 
     * Se encarga de colocar la carta en una posicion aleatoria del tablero
     */
    private void colocarCarta(){
        posicionCarta = Evento.getNumero(33);
        unoLabel.setLocation(tablero.get(posicionCarta).getLocation());
    }
    /***
     * Método estrella 
     * A través de este metodo se puede comprar una estrella
     */
    private void estrella(){
        if (posicionEstrella == valorA){
            int comprar = JOptionPane.showConfirmDialog(null, "QUIERES COMPRAR LA ESTRELLA POR 5 MONEDAS");
            if (JOptionPane.OK_OPTION == comprar && Integer.parseInt(moneda1.getText())>=5){
                JOptionPane.showMessageDialog(null, "ACABA DE COMPRAR UNA ESTRELLA FELICIDADES");
                estrella1.setText(""+(Integer.parseInt(estrella1.getText())+1));
                moneda1.setText(""+(Integer.parseInt(moneda1.getText())-5));
            }else{
                JOptionPane.showMessageDialog(null, "LO SIENTO SU COMPRA NO PUEDE EFECTUARSE");
            }
            colocarEstrella();
        }else if(posicionEstrella == valorB){
            int comprar = JOptionPane.showConfirmDialog(null, "QUIERES COMPRAR LA ESTRELLA POR 5 MONEDAS");
            if (JOptionPane.OK_OPTION == comprar && Integer.parseInt(moneda2.getText())>=5){
                JOptionPane.showMessageDialog(null, "ACABA DE COMPRAR UNA ESTRELLA FELICIDADES");
                estrella2.setText(""+(Integer.parseInt(estrella2.getText())+1));
                moneda2.setText(""+(Integer.parseInt(moneda2.getText())-5));
            }else{
                JOptionPane.showMessageDialog(null, "LO SIENTO SU COMPRA NO PUEDE EFECTUARSE");
            }
            colocarEstrella();
        }else if (posicionEstrella == valorC){
            int comprar = JOptionPane.showConfirmDialog(null, "QUIERES COMPRAR LA ESTRELLA POR 5 MONEDAS");
            if (JOptionPane.OK_OPTION == comprar && Integer.parseInt(moneda3.getText())>=5){
                JOptionPane.showMessageDialog(null, "ACABA DE COMPRAR UNA ESTRELLA FELICIDADES");
                estrella3.setText(""+(Integer.parseInt(estrella3.getText())+1));
                moneda3.setText(""+(Integer.parseInt(moneda3.getText())-5));
            }else{
                JOptionPane.showMessageDialog(null, "LO SIENTO SU COMPRA NO PUEDE EFECTUARSE");
            }
            colocarEstrella();
        }else if (posicionEstrella == valorD){
            int comprar = JOptionPane.showConfirmDialog(null, "QUIERES COMPRAR LA ESTRELLA POR 5 MONEDAS");
            if (JOptionPane.OK_OPTION == comprar && Integer.parseInt(moneda4.getText())>=5){
                JOptionPane.showMessageDialog(null, "ACABA DE COMPRAR UNA ESTRELLA FELICIDADES");
                estrella4.setText(""+(Integer.parseInt(estrella4.getText())+1));
                moneda4.setText(""+(Integer.parseInt(moneda4.getText())-5));
            }else{
                JOptionPane.showMessageDialog(null, "LO SIENTO SU COMPRA NO PUEDE EFECTUARSE");
            }
            colocarEstrella();
        }
    
    }
    /***
     * Método Carta
     * Este metodo le brinda a los jugadores la habilidad de aventajarse con respecto a los otros jugadores
     * ya sea adquiriendo estrella, monedas o avanzando más casillas
     */
    private void carta(){
        
        String opciones[] = {"AVANZAR 3 ESPACIOS","GANAR 1 ESTRELLA", "GANAR 3 MONEDAS"};
        if (valorA == posicionCarta){
            
            int x = JOptionPane.showOptionDialog(null, "SELECCIONE LO QUE DESEA HACER", "EVENTO CARTA", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
            switch (x) {
                case 0:
                    valorA +=3;
                    L1.setLocation(tablero.get(valorA).getLocation());
                    L1.setBackground(tablero.get(valorA).getBackground());
                    colocarCarta();
                    break;
                case 1:
                    estrella1.setText(""+(Integer.parseInt(estrella1.getText())+1));
                    colocarCarta();
                    break;
                case 2: 
                    moneda1.setText(""+(Integer.parseInt(moneda1.getText())+3));
                    colocarCarta();
                    break;
                default:
                    break;
            }
        }else if (valorB == posicionCarta){
            
            int x = JOptionPane.showOptionDialog(null, "SELECCIONE LO QUE DESEA HACER", "EVENTO CARTA", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
            switch (x) {
                case 0:
                    valorB +=3;
                    L2.setLocation(tablero.get(valorB).getLocation());
                    L2.setBackground(tablero.get(valorB).getBackground());
                    colocarCarta();
                    break;
                case 1:
                    estrella2.setText(""+(Integer.parseInt(estrella2.getText())+1));
                    colocarCarta();
                    break; 
                case 2:
                    moneda2.setText(""+(Integer.parseInt(moneda2.getText())+3));
                    colocarCarta();
                    break;
                default:
                    break;
            }
        }else if (valorC == posicionCarta){
            int x = JOptionPane.showOptionDialog(null, "SELECCIONE LO QUE DESEA HACER", "EVENTO CARTA", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
            switch (x) {
                case 0:
                    valorC +=3;
                    L3.setLocation(tablero.get(valorC).getLocation());
                    L3.setBackground(tablero.get(valorC).getBackground());
                    colocarCarta();
                    break;
                case 1:
                    estrella3.setText(""+(Integer.parseInt(estrella3.getText())+1));
                    colocarCarta();
                    break;
                case 2: 
                    moneda3.setText(""+(Integer.parseInt(moneda3.getText())+3));
                    colocarCarta();
                    break;
                default:
                    break;
            }
        }else if (valorD == posicionCarta){
            int x = JOptionPane.showOptionDialog(null, "SELECCIONE LO QUE DESEA HACER", "EVENTO CARTA", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
            switch (x) {
                case 0:
                    valorD +=3;
                    L4.setLocation(tablero.get(valorD).getLocation());
                    L4.setBackground(tablero.get(valorD).getBackground());
                    colocarCarta();
                    break;
                case 1:
                    estrella4.setText(""+(Integer.parseInt(estrella4.getText())+1));
                    colocarCarta();
                    break; 
                case 2:
                    moneda4.setText(""+(Integer.parseInt(moneda4.getText())+3));
                    colocarCarta();
                    break;
                default:
                    break;
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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel L1;
    private static javax.swing.JLabel L2;
    private static javax.swing.JLabel L3;
    private static javax.swing.JLabel L4;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JTextField cuadroFase;
    private javax.swing.JTextField cuadrovalor;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d10;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d5;
    private javax.swing.JLabel d6;
    private javax.swing.JLabel d7;
    private javax.swing.JLabel d8;
    private javax.swing.JLabel d9;
    private javax.swing.JLabel dadoFase;
    private javax.swing.JLabel dadoLabel1;
    private javax.swing.JLabel dadoLabel2;
    private static javax.swing.JLabel estrella1;
    private static javax.swing.JLabel estrella2;
    private static javax.swing.JLabel estrella3;
    private static javax.swing.JLabel estrella4;
    private javax.swing.JLabel estrellaLabel;
    private javax.swing.JLabel exitlbl;
    private javax.swing.JLabel exitlbl2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jname1;
    private javax.swing.JLabel jname2;
    private javax.swing.JLabel jname3;
    private javax.swing.JLabel jname4;
    private static javax.swing.JLabel moneda1;
    private static javax.swing.JLabel moneda2;
    private static javax.swing.JLabel moneda3;
    private static javax.swing.JLabel moneda4;
    private javax.swing.JButton moverFase;
    private javax.swing.JButton moverbutton;
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
    private javax.swing.JLabel t30;
    private javax.swing.JLabel t31;
    private javax.swing.JLabel t32;
    private javax.swing.JLabel t33;
    private javax.swing.JLabel t34;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    private javax.swing.JButton tirarbutton;
    private javax.swing.JLabel unoLabel;
    // End of variables declaration//GEN-END:variables
}
