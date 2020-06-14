/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PuzzleGame;

import javax.swing.*;
import java.awt.event.*;
public class Puzzle extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;

    ImageIcon Ib1 = new ImageIcon("fila-1-col-1.png");
    ImageIcon Ib2 = new ImageIcon("fila-1-col-2.png");
    ImageIcon Ib3 = new ImageIcon("fila-1-col-3.png");
    ImageIcon Ib4 = new ImageIcon("fila-2-col-1.png");
    ImageIcon Ib5 = new ImageIcon("fila-2-col-2.png");
    ImageIcon Ib6 = new ImageIcon("fila-2-col-3.png");
    ImageIcon Ib7 = new ImageIcon("fila-3-col-1.png");
    ImageIcon Ib8 = new ImageIcon("fila-3-col-2.png");
    ImageIcon Ib9 = new ImageIcon("fila-3-col-3.png");
    
    int points = 0;
    int moves = 0;

    Puzzle(){
        super("Puzzle Game - JavaTpoint");

        b1=new JButton();
        b2=new JButton();
        b3=new JButton();
        b4=new JButton();
        b5=new JButton();
        b6=new JButton();
        b7=new JButton();
        b8=new JButton();
        b9=new JButton();
        next=new JButton("mix");

        b1.setIcon(Ib1);
        b2.setIcon(Ib2);
        b3.setIcon(Ib3);
        b4.setIcon(Ib4);
        b5.setIcon(Ib5);
        b6.setIcon(Ib6);
        b7.setIcon(Ib7);
        b8.setIcon(Ib8);
        b9.setIcon(Ib9);

        b1.setBounds(30,30,190,200);
        b2.setBounds(225,30,190,200);
        b3.setBounds(420,30,190,200);
        b4.setBounds(30,235,190,200);
        b5.setBounds(225,235,190,200);
        b6.setBounds(420,235,190,200);
        b7.setBounds(30,440,190,200);
        b8.setBounds(225,440,190,200);
        b9.setBounds(420,440,190,200);
        next.setBounds(225,645,190,100);

        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9); add(next);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        next.addActionListener(this);

        setSize(650,800);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//end of constructor

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==next){
            Icon temp=b4.getIcon();
            b4.setIcon(b1.getIcon());
            b1.setIcon(temp);
            temp=b8.getIcon();
            b8.setIcon(b6.getIcon());
            b6.setIcon(b9.getIcon());
            b9.setIcon(b2.getIcon());
            b2.setIcon(b7.getIcon());
            b7.setIcon(temp);
            moves = 0;
            points = 0;
        }
        if(e.getSource()==b1){
            moves++;
            Icon s=b1.getIcon();
            if(b2.getIcon().equals(Ib1)){b2.setIcon(s); b1.setIcon(Ib1);}
            else if(b4.getIcon().equals(Ib1)){ b4.setIcon(s); b1.setIcon(Ib1);}

            if(b1.getIcon().equals(Ib1)&&b2.getIcon().equals(Ib2)&&b3.getIcon()
                    .equals(Ib3)&&b4.getIcon().equals(Ib4)&&b5.getIcon().equals(Ib5)
                    &&b6.getIcon().equals(Ib6)&&b7.getIcon().equals(Ib7)&&b8.getIcon()
                    .equals(Ib8)&&b9.getIcon().equals(Ib9)){
                JOptionPane.showMessageDialog(Puzzle.this,"!!!you won!!!");
                this.dispose();
                MenuPuzzleGame.setPuntaje(moves);
                
            }

        }//end of if

        if(e.getSource()==b3){
            moves++;
            Icon s=b3.getIcon();
            if(b2.getIcon().equals(Ib1)){ b2.setIcon(s); b3.setIcon(Ib1);}
            else if(b6.getIcon().equals(Ib1)){ b6.setIcon(s); b3.setIcon(Ib1);}
        }//end of if

        if(e.getSource()==b2){
            moves++;
            Icon s=b2.getIcon();
            if(b1.getIcon().equals(Ib1)){ b1.setIcon(s); b2.setIcon(Ib1);}
            else if(b3.getIcon().equals(Ib1)){ b3.setIcon(s); b2.setIcon(Ib1);}
            else if(b5.getIcon().equals(Ib1)){ b5.setIcon(s); b2.setIcon(Ib1);}
        }//end of if

        if(e.getSource()==b4){
            moves++;
            Icon s=b4.getIcon();
            if(b1.getIcon().equals(Ib1)){ b1.setIcon(s); b4.setIcon(Ib1);}
            else if(b7.getIcon().equals(Ib1)){ b7.setIcon(s); b4.setIcon(Ib1);}
            else if(b5.getIcon().equals(Ib1)){ b5.setIcon(s); b4.setIcon(Ib1);}
        }//end of if

        if(e.getSource()==b5){
            moves++;
            Icon s=b5.getIcon();
            if(b2.getIcon().equals(Ib1)){ b2.setIcon(s); b5.setIcon(Ib1);}
            else if(b4.getIcon().equals(Ib1)){ b4.setIcon(s); b5.setIcon(Ib1);}
            else if(b6.getIcon().equals(Ib1)){ b6.setIcon(s); b5.setIcon(Ib1);}
            else if(b8.getIcon().equals(Ib1)){ b8.setIcon(s); b5.setIcon(Ib1);}
        }//end of if

        if(e.getSource()==b6){
            moves++;
            Icon s=b6.getIcon();
            if(b9.getIcon().equals(Ib1)){ b9.setIcon(s); b6.setIcon(Ib1);}
            else if(b3.getIcon().equals(Ib1)){ b3.setIcon(s); b6.setIcon(Ib1);}
            else if(b5.getIcon().equals(Ib1)){ b5.setIcon(s); b6.setIcon(Ib1);}
        }//end of if

        if(e.getSource()==b7){
            moves++;
            Icon s=b7.getIcon();
            if(b4.getIcon().equals(Ib1)){ b4.setIcon(s); b7.setIcon(Ib1);}
            else if(b8.getIcon().equals(Ib1)){ b8.setIcon(s); b7.setIcon(Ib1);}
        }//end of if

        if(e.getSource()==b8){
            moves++;
            Icon s=b8.getIcon();
            if(b7.getIcon().equals(Ib1)){ b7.setIcon(s); b8.setIcon(Ib1);}
            else if(b9.getIcon().equals(Ib1)){ b9.setIcon(s); b8.setIcon(Ib1);}
            else if(b5.getIcon().equals(Ib1)){ b5.setIcon(s); b8.setIcon(Ib1);}
        }//end of if

        if(e.getSource()==b9){
            moves++;
            Icon s=b9.getIcon();
            if(b6.getIcon().equals(Ib1)){ b6.setIcon(s); b9.setIcon(Ib1);}
            else if(b8.getIcon().equals(Ib1)){ b8.setIcon(s); b9.setIcon(Ib1);}

        }//end of if

    }//end of actionPerformed


}//end of class