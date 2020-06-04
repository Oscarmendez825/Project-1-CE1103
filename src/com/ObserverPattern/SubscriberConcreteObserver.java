
package com.ObserverPattern;

import com.Player.Evento;
import com.Player.FinJuego;
import javax.swing.JOptionPane;

/***
 * ConcreteObserver class
 * @author Oscar Méndez Granados
 * @author Hansel Hampton Fallas
 */
public class SubscriberConcreteObserver implements ObserverInterface {
    int vueltas = 4;
    
    /***
     * Constructor method
     */
    public SubscriberConcreteObserver() {
    }
    
    /***
     * Uptate Method
     * @param vueltas
     * @param posicion
     */
    @Override
    public void update(int vueltas, boolean posicion){
        if (vueltas == 4){
            JOptionPane.showMessageDialog(null, "EL JUEGO HA TERMINADO");
            new FinJuego().setVisible(true);
        }
        if (posicion == true){
            JOptionPane.showMessageDialog(null, "POR ESTAR DOS JUGADORES EN LA MISMA CASILLA SE ACTIVARÁ UN NUEVO DUELO, A JUGAR!!!");
            Evento evento = new Evento();
            evento.duelo();
        }
    }
}