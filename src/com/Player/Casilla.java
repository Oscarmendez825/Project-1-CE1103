/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Player;


import javax.swing.JLabel;


/**
 *
 * @author oscar
 */

public class Casilla {

    
    public Casilla() {
        

    }
    public static void casilla(String color,JLabel monedalbl, int jugador){
        int monedas = Integer.parseInt(monedalbl.getText());
        
        switch (color) {
                //azul
            case "\"java.awt.Color[r=0,g=0,b=204]\"":
                break;
            case "java.awt.Color[r=255,g=0,b=0]":
                //rojo
                monedas-=2;
                monedalbl.setText(""+monedas);
                break;
            case "java.awt.Color[r=0,g=255,b=0]":
                //verde
                monedas+=2;
                monedalbl.setText(""+monedas);
                break;
            case "java.awt.Color[r=255,g=255,b=0]":
                //amarillo
                Evento evento = new Evento(jugador);
                evento.eventos();
                break;
            default:
                break;
        }
    
    }
    

        
    
    }

