/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Player;

import com.SnakeGame.PosicionesStart;
import com.SoupGame.SoupScores;
import com.StackPackage.Stack;
import java.util.Random;
import javax.swing.JOptionPane;



public class Evento{
    private static int cantidadDuelo = 10;
    private static int cantidadRobo = 10;
    private static int ganar2Estrellas = 3;
    private static int ganar5Estrellas = 1;
    private static int robarEstrella = 3;
    private static int tp = 10;
    private static int jugador;
    private static int cambio = 5; 
    private static Stack stack = new Stack();
    private static Evento evento;
    
    private Evento(int jugador) {
        Evento.jugador = jugador;
    }


    public static Evento getInstance(int jugador){
        if (evento == null){
            evento = new Evento(jugador);
        
        }
        return evento;
    }
    
    public static int getNumero(int num){
        Random random = new Random();
        int eventoNum = random.nextInt(num)+1;
        return eventoNum;
    
    }

    public static int getJugador() {
        return jugador;
    }
    
    public void eventos(){
        if (stack.isEmpty() == true){
            cantidadDuelo = 10;
            cantidadRobo = 10;
            ganar2Estrellas = 3;
            ganar5Estrellas = 1;
            robarEstrella = 3;
            tp = 10;
            cambio = 5;
            crearStack();
            ejecutarEvento();
        }else{
            ejecutarEvento();
        }
        

        
    }
    private void crearStack(){
        stack = new Stack();
        while(cantidadDuelo!=0){
            if (cantidadDuelo != 0){
                stack.push("duelo");
                cantidadDuelo--;
            }else if(cantidadRobo!=0){
                stack.push("roboMonedas");
                cantidadRobo--;
            }else if (ganar2Estrellas != 0 ){
                stack.push("ganarDosEstrellas");
                ganar2Estrellas--;
            }else if (ganar5Estrellas!=0){
                stack.push("ganarCincoEstrellas");
                ganar5Estrellas--;
            }else if (tp!=0){
                stack.push("teletransporte");
                tp--;
            }else if (cambio!=0){
                stack.push("cambioLugares");
                cambio--;
            }else if (robarEstrella != 0){
                stack.push("robar1Estrella");
                robarEstrella--;
            }
            stack.push("regalarMonedas");
            stack.push("perderEstrella");
        }
    }
    private void ejecutarEvento(){

        switch (stack.peek()) {
            case "duelo":
                stack.pop();
                duelo();
                break;
            case "roboMonedas":
                stack.pop();
                roboMonedas();
                break;
            case "ganarDosEstrellas":
                stack.pop();
                ganar2Estrellas();
                break;
            case "ganarCincoEstrellas":
                stack.pop();
                ganar5Estrellas();
                break;
            case "teletransporte":
                stack.pop();
                
                int eleccion = getNumero(2)+1;
                int direccion = getNumero(2)+1;
                if(eleccion == 1){
                    if (direccion == 1){
                        Tablero.crearFase(jugador, 100);
                    }else if (direccion == 2){
                        Tablero.crearFase(jugador, 59);
                    }
                }else{
                    int posicion = getNumero(33);
                    Tablero.teletransporte(jugador, posicion);
                }
                break;
            case "cambioLugares":
                stack.pop();
                int jugador2 = getNumero(GameUser.getCantidad());
                while(jugador == jugador2){
                    jugador2 = getNumero(GameUser.getCantidad());
                }   
                Tablero.cambioLugar(jugador, jugador2);
                break;
            case "robar1Estrella":
                stack.pop();
                roboEstrella();
                break;
            case "regalarMonedas":
                stack.pop();
                perderMonedas();
                break;
            case "perderEstrella":
                stack.pop();
                perderEstrella();
                break;
            default:
                break;
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
//                    new PosicionesStart().setVisible(true);
                    
                    break;
                case 2:
//                    new SoupScores().setVisible(true);
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
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
        int cantidad = getNumero(10)+1;
        while(cantidad%GameUser.getCantidad()!=0){
           cantidad = getNumero(10)+1;
        }            
        if (cantidad%GameUser.getCantidad() == 0){
            switch (jugador) {
                case 1:
                    {
                        int monedas = Integer.parseInt(Tablero.getMoneda1().getText());
                        monedas = monedas-cantidad;
                        Tablero.getMoneda1().setText(""+monedas);
                        Tablero.getMoneda2().setText(""+(Integer.parseInt(Tablero.getMoneda2().getText())+cantidad/GameUser.getCantidad()));
                        Tablero.getMoneda3().setText(""+(Integer.parseInt(Tablero.getMoneda3().getText())+cantidad/GameUser.getCantidad()));
                        Tablero.getMoneda4().setText(""+(Integer.parseInt(Tablero.getMoneda4().getText())+cantidad/GameUser.getCantidad()));
                        break;
                    }
                case 2:
                    {
                        int monedas = Integer.parseInt(Tablero.getMoneda2().getText());
                        monedas = monedas-cantidad;
                        Tablero.getMoneda2().setText(""+monedas);
                        Tablero.getMoneda1().setText(""+(Integer.parseInt(Tablero.getMoneda1().getText())+cantidad/GameUser.getCantidad()));
                        Tablero.getMoneda3().setText(""+(Integer.parseInt(Tablero.getMoneda3().getText())+cantidad/GameUser.getCantidad()));
                        Tablero.getMoneda4().setText(""+(Integer.parseInt(Tablero.getMoneda4().getText())+cantidad/GameUser.getCantidad()));
                        break;
                    }
                case 3:
                    {
                        int monedas = Integer.parseInt(Tablero.getMoneda3().getText());
                        monedas = monedas-cantidad;
                        Tablero.getMoneda3().setText(""+monedas);
                        Tablero.getMoneda1().setText(""+(Integer.parseInt(Tablero.getMoneda1().getText())+cantidad/GameUser.getCantidad()));
                        Tablero.getMoneda2().setText(""+(Integer.parseInt(Tablero.getMoneda2().getText())+cantidad/GameUser.getCantidad()));
                        Tablero.getMoneda4().setText(""+(Integer.parseInt(Tablero.getMoneda4().getText())+cantidad/GameUser.getCantidad()));
                        break;
                    }
                case 4:
                    {
                        int monedas = Integer.parseInt(Tablero.getMoneda4().getText());
                        monedas = monedas-cantidad;
                        Tablero.getMoneda4().setText(""+monedas);
                        Tablero.getMoneda1().setText(""+(Integer.parseInt(Tablero.getMoneda1().getText())+cantidad/GameUser.getCantidad()));
                        Tablero.getMoneda3().setText(""+(Integer.parseInt(Tablero.getMoneda3().getText())+cantidad/GameUser.getCantidad()));
                        Tablero.getMoneda2().setText(""+(Integer.parseInt(Tablero.getMoneda2().getText())+cantidad/GameUser.getCantidad()));
                        break;
                    }
                default:
                    break;
            }
        }
    }
    
    
    public void perderEstrella(){
        JOptionPane.showMessageDialog(null, "LO SIENTO PERO LAMENTABLEMENTE PERDERÁS UNA ESTRELLA :C \n Y SE LA DAREMOS A OTRO");
        int robo = getNumero(GameUser.getCantidad());
        while(true){
            if (robo == jugador){
                robo = getNumero(GameUser.getCantidad());    
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
    
    public void ganar2Estrellas(){
        JOptionPane.showMessageDialog(null, "FELICIDADES ACABAS DE GANAR 2 ESTRELLAS \n DEBERÍAS SENTIRTE MUY COOL!!!!");
        switch (jugador) {
            case 1:
                Tablero.getEstrella1().setText(""+(Integer.parseInt(Tablero.getEstrella1().getText())+2));
                break;
            case 2:
                Tablero.getEstrella2().setText(""+(Integer.parseInt(Tablero.getEstrella2().getText())+2));
                break;
            case 3:
                Tablero.getEstrella3().setText(""+(Integer.parseInt(Tablero.getEstrella3().getText())+2));               
                break;
            case 4:
                Tablero.getEstrella4().setText(""+(Integer.parseInt(Tablero.getEstrella4().getText())+2));
                break;
            default:
                break;
        }
    }
    
    
    public void ganar5Estrellas(){
        JOptionPane.showMessageDialog(null, "FELICIDADES ACABAS DE GANAR 5 ESTRELLAS Y SERÁS EL ÚNICO C: \n DEBERÍAS SENTIRTE DEMASIADO COOL!!!!");
        switch (jugador) {
            case 1:
                Tablero.getEstrella1().setText(""+(Integer.parseInt(Tablero.getEstrella1().getText())+5));
                break;
            case 2:
                Tablero.getEstrella2().setText(""+(Integer.parseInt(Tablero.getEstrella2().getText())+5));
                break;
            case 3:
                Tablero.getEstrella3().setText(""+(Integer.parseInt(Tablero.getEstrella3().getText())+5));
                break;
            case 4:
                Tablero.getEstrella4().setText(""+(Integer.parseInt(Tablero.getEstrella4().getText())+5));
                break;
            default:
                break;
        }
    }
    public void roboEstrella(){
        JOptionPane.showMessageDialog(null, "GANARÁS UNA ESTRELLA Y UN COMPAÑERO TUYO PERDERÁ UNA SUYA!!!! ");
        robarEstrella--;
        int perdedor = getNumero(GameUser.getCantidad());
        while(perdedor==jugador){
            perdedor = getNumero(GameUser.getCantidad());
        }
        switch (perdedor) {
            case 1:
                Tablero.getEstrella1().setText(""+(Integer.parseInt(Tablero.getEstrella1().getText())-1));
                break;
            case 2:
                Tablero.getEstrella2().setText(""+(Integer.parseInt(Tablero.getEstrella2().getText())-1));
                break;
            case 3:
                Tablero.getEstrella3().setText(""+(Integer.parseInt(Tablero.getEstrella3().getText())-1));
                break;
            case 4:
                Tablero.getEstrella4().setText(""+(Integer.parseInt(Tablero.getEstrella4().getText())-1));
                break;
            default:
                break;
        }switch (jugador) {
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


}
