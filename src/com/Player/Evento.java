/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Player;

import com.SnakeGame.PosicionesStart;
import com.SoupGame.SoupScores;
import java.util.Random;
import javax.swing.JOptionPane;



public class Evento {
    private static int cantidadDuelo = 10;
    private static int cantidadRobo = 10;
    private static int ganar2Estrellas = 3;
    private static int ganar1Estrella = 1;
    private static int robarEstrella = 3;
    private static int tp = 10;
    private static int jugador;
    
    
    
    
    public Evento(int jugador) {
        Evento.jugador = jugador;
    }
    
    
    public static int getNumero(int num){
        Random random = new Random();
        int evento = random.nextInt(num)+1;
        return evento;
    
    }

    public static int getJugador() {
        return jugador;
    }
    
    public void eventos(){
        int evento = getNumero(8)+1;
        if (evento == 1 && cantidadDuelo != 0){//DUELO
            duelo();
        }else if(evento == 2 && cantidadRobo!=0){//ROBO MONEDAS
            roboMonedas();
        }else if (evento == 3){
            perderMonedas();        
        }else if (evento == 4){
            perderEstrella();

        }
    }

    private void darEstrella(int ganador) {
        switch (ganador) {
                case 1:
                    Tablero.getEstrella1().setText(""+(Integer.parseInt(Tablero.getEstrella1().getText())+1));
                    break;
                case 2:
                    Tablero.getEstrella2().setText(""+(Integer.parseInt(Tablero.getEstrella2().getText())+1));
                    break;
                case 3:
                    Tablero.getEstrella3().setText(""+(Integer.parseInt(Tablero.getEstrella3().getText())+1));
                    break;
                case 4:
                    Tablero.getEstrella4().setText(""+(Integer.parseInt(Tablero.getEstrella4().getText())+1));
                    break;
                default:
                    break;
            }
    }
    
    
    public void duelo(){
        int juego = getNumero(7)+1;
            JOptionPane.showMessageDialog(null, "ESTÁN APUNTO DE ENFRENTARSE EN UN DUELO!!!");
            switch (juego) {
                case 1:
                    new PosicionesStart().setVisible(true);
                    cantidadDuelo--;
                    break;
                case 2:
                    new SoupScores().setVisible(true);
                    cantidadDuelo--;
                    break;
                case 3:
                    cantidadDuelo--;
                    break;
                case 4:
                    cantidadDuelo--;
                    break;
                case 5:
                    cantidadDuelo--;
                    break;
                case 6:
                    cantidadDuelo--;
                    break;
                case 7:
                    cantidadDuelo--;
                    break;
                default:
                    break;
            }
    
    }
    
    
    public void roboMonedas(){
        new RoboMonedas().setVisible(true);
            cantidadRobo--;
    }
    
    
    public void perderMonedas(){
        JOptionPane.showMessageDialog(null, "LO SIENTO, ESTÁS PERO PERDERÁS ALGUNAS MONEDAS :C \n Y SERÁ REPARTIDAS ENTRE TUS AMIGOS");
        int cantidad = getNumero(5)+1;
        while(cantidad%2!=0){
           cantidad = getNumero(5)+1;
        }            
        if (cantidad%2 == 0){
            switch (jugador) {
                case 1:
                    {
                        int monedas = Integer.parseInt(Tablero.getMoneda1().getText());
                        monedas = monedas-cantidad;
                        Tablero.getMoneda1().setText(""+monedas);
                        Tablero.getMoneda2().setText(""+(Integer.parseInt(Tablero.getMoneda2().getText())+cantidad));
                        Tablero.getMoneda3().setText(""+(Integer.parseInt(Tablero.getMoneda3().getText())+cantidad));
                        Tablero.getMoneda4().setText(""+(Integer.parseInt(Tablero.getMoneda4().getText())+cantidad));
                        break;
                    }
                case 2:
                    {
                        int monedas = Integer.parseInt(Tablero.getMoneda2().getText());
                        monedas = monedas-cantidad;
                        Tablero.getMoneda2().setText(""+monedas);
                        Tablero.getMoneda1().setText(""+(Integer.parseInt(Tablero.getMoneda1().getText())+cantidad));
                        Tablero.getMoneda3().setText(""+(Integer.parseInt(Tablero.getMoneda3().getText())+cantidad));
                        Tablero.getMoneda4().setText(""+(Integer.parseInt(Tablero.getMoneda4().getText())+cantidad));
                        break;
                    }
                case 3:
                    {
                        int monedas = Integer.parseInt(Tablero.getMoneda3().getText());
                        monedas = monedas-cantidad;
                        Tablero.getMoneda3().setText(""+monedas);
                        Tablero.getMoneda1().setText(""+(Integer.parseInt(Tablero.getMoneda1().getText())+cantidad));
                        Tablero.getMoneda2().setText(""+(Integer.parseInt(Tablero.getMoneda2().getText())+cantidad));
                        Tablero.getMoneda4().setText(""+(Integer.parseInt(Tablero.getMoneda4().getText())+cantidad));
                        break;
                    }
                case 4:
                    {
                        int monedas = Integer.parseInt(Tablero.getMoneda4().getText());
                        monedas = monedas-cantidad;
                        Tablero.getMoneda4().setText(""+monedas);
                        Tablero.getMoneda1().setText(""+(Integer.parseInt(Tablero.getMoneda1().getText())+cantidad));
                        Tablero.getMoneda3().setText(""+(Integer.parseInt(Tablero.getMoneda3().getText())+cantidad));
                        Tablero.getMoneda2().setText(""+(Integer.parseInt(Tablero.getMoneda2().getText())+cantidad));
                        break;
                    }
                default:
                    break;
            }
        }
    }
    
    
    public void perderEstrella(){
        JOptionPane.showMessageDialog(null, "LO SIENTO PERO LAMENTABLEMENTE PERDERÁS UNA ESTRELLA :C \n Y SE LA DAREMOS A OTRO");
        int robo = getNumero(GameUser.getCantidad())+1;
        while(true){
            if (robo == jugador){
                robo = getNumero(GameUser.getCantidad())+1;    
            }else{
                break;
            }
        }
        switch (jugador) {
            case 1:
                Tablero.getEstrella1().setText(""+(Integer.parseInt(Tablero.getEstrella1().getText())-1));
                darEstrella(robo);
                break;
            case 2:
                Tablero.getEstrella2().setText(""+(Integer.parseInt(Tablero.getEstrella2().getText())-1));
                darEstrella(robo);
                break;
            case 3:
                Tablero.getEstrella3().setText(""+(Integer.parseInt(Tablero.getEstrella3().getText())-1));
                darEstrella(robo);
                break;
            case 4:
                Tablero.getEstrella4().setText(""+(Integer.parseInt(Tablero.getEstrella4().getText())-1));
                darEstrella(robo);
                break;
            default:
                break;
        }
    
    }
}
