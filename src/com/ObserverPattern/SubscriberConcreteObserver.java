
package com.ObserverPattern;

import com.Player.Evento;
import com.Player.FinJuego;
import com.TriviaGame.InicioTrivia;
import javax.swing.JOptionPane;

/***
 * ConcreteObserver class
 * @author Oscar Méndez Granados
 * @author Hansel Hampton Fallas
 */

    
public class SubscriberConcreteObserver implements ObserverInterface {
    int vueltas = 4;
    private static int player1;
    private static int player2;
    /***
     * Constructor method
     */
    public SubscriberConcreteObserver() {
    }
    
    /***
     * Uptate Method
     * @param vueltas
     * @param posicion
     * @param jug1
     */
    @Override
    public void update(int vueltas, boolean posicion,int jug1 ,int jug2){
        if (vueltas == 4){
            JOptionPane.showMessageDialog(null, "EL JUEGO HA TERMINADO");
            new FinJuego().setVisible(true);
        }
        if (posicion == true){
            if (jug1 == 1 && jug2 == 2){

                new InicioTrivia(1,2).setVisible(true);
                
            }else if (jug1 == 1 && jug2 == 3){
                new InicioTrivia(1,3).setVisible(true);
            }else if (jug1 == 1 && jug2 == 4){

                new InicioTrivia(1,4).setVisible(true);
            }else if (jug1 == 2 && jug2 == 3){

                new InicioTrivia(2,3).setVisible(true);
            }else if (jug1 == 2 && jug2 == 4){

                new InicioTrivia(2,4).setVisible(true);
            }else if (jug1 == 3 && jug2 == 4){

                new InicioTrivia(3,4).setVisible(true);
            }
        }
    }

    public static int getJug1() {
        return player1;
    }

    public static void setJug1(int jug1) {
        SubscriberConcreteObserver.player1 = jug1;
    }

    public static int getJug2() {
        return player2;
    }

    public static void setJug2(int jug2) {
        SubscriberConcreteObserver.player2 = jug2;
    }
    
}
