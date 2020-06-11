/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Player;


import javax.swing.JLabel;


/**
 * Casilla class
 * @author Oscar Méndez
 * @author Marco Picado
 * @author Hansel Hampton
 * @author Keyner Gómez
 * @version 1.1
 * @since 2020
 */

public class Casilla {

    /***
     * Método Constructor
     */
    public Casilla() {
        

    }
    /***
     * Método casilla
     * Se encarga de realizar acciones según el color de la casilla en la que caiga el jugador
     * @param color String
     * @param monedalbl JLabel
     * @param jugador Integer
     */
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
                Evento evento = Evento.getInstance(jugador);
                evento.eventos();
                break;
            default:
                break;
        }
    
    }
           

        
    
    }

