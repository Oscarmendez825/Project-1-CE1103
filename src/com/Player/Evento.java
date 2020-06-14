/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Player;

import com.MemoryGame.InicioJuego;
import com.SnakeGame.PosicionesStart;
import com.SoupGame.SoupScores;
import com.StackPackage.Stack;
import java.util.Random;
import javax.swing.JOptionPane;
import com.TriviaGame.InicioTrivia;
import com.littletennis.InicioTennis;


/***
 * 
 * @author Oscar Méndez
 * @author Keyner Gómez
 * @author Marco Picado
 * @author Hansel Hampton
 * @version 1.4
 * @since 2020
 */
public class Evento{
    //ATRIBUTOS E INTANCIAS//
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
    
    /***
     * Método Constructor
     * @param jugador Integer
     */
    private Evento(int jugador) {
        Evento.jugador = jugador;
    }

    /***
     * Método del Patrón de Diseño Singleton
     * @param jugador Integer
     * @return Object
     */
    public static Evento getInstance(int jugador){
        if (evento == null){
            evento = new Evento(jugador);
        
        }
        return evento;
    }
    /***
     * Método getNumero
     * Devuelve un numero aleatorio en un limite de numeros definido
     * @param num Integer
     * @return Integer
     */
    public static int getNumero(int num){
        Random random = new Random();
        int eventoNum = random.nextInt(num)+1;
        return eventoNum;
    
    }
    /***
     * Método getJugador
     * Devuelve el número del jugador el cual está ejecutando un evento
     * @return Integer
     */
    public static int getJugador() {
        return jugador;
    }
    /***
     * Método eventos
     * Se encarga de ejecutar los eventos por medio del stack
     * en dado caso que el stack esté vacío lo vuelve a llenar
     */
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
    /***
     * Método crearStack
     * Se encarga de crear el stack
     */
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
    /***
     * Método ejecutarEvento
     * Se encarga de sacar un elemento del stack y así saber que elemento ejecutar
     */
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
    /***
     * Métdodo darEstrella
     * Se encarga de dar una estrella a un jugador aleatorio
     * @param ganador Integer
     */
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
   
    /***
     * Método duelo
     * Se encarga de activar un duelo
     */
    public void duelo(){
        int juego = getNumero(7)+1;
            JOptionPane.showMessageDialog(null, "ESTÁN APUNTO DE ENFRENTARSE EN UN DUELO!!!");
            switch (juego) {
                case 1:
                    new PosicionesStart().setVisible(true);
                    break;
                case 2:
                    new SoupScores().setVisible(true);
                    break;
                case 3:
                    new InicioJuego().setVisible(true);
                    break;
                case 4:
                    new InicioTrivia().setVisible(true);
                    break;
                case 5:
                    new InicioTennis().setVisible(true);
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                default:
                    break;
            }
    
    }
    
    /***
     * Método roboMonedas
     * Se encarga de llamar el Frame para ver a cual jugador robarle monedas
     */
    public void roboMonedas(){
        new RoboMonedas().setVisible(true);
            cantidadRobo--;
    }
    
    /***
     * Método perderMonedas
     * Se encarga de quitarle monedas a al jugador y repartirlas equitativamente entre los otros
     */
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
    
    /***
     * Método perderEstrella
     * Se encarga de quitarle la moneda a un jugador y darsela a otro
     */
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
    /***
     * Método ganar2Estrellas
     * El jugador gana 2 estrellas
     */
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
    
    /***
     * Método ganar5Estrellas
     * El jugador gana 5 Estrellas
     */
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
    /***
     * Método roboEstrella
     * El jugador ganará una estrella y un amigo perderá la de él
     */
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
