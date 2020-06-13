
package com.ObserverPattern;

import java.util.ArrayList;

/***
 * Subject Class
 * @author Oscar Méndez Granados
 * @author Hansel Hampton Fallas
 */
public class ContentCreatorSubject implements ObservableInterface{
    private ArrayList<ObserverInterface> observers;

    /***
     * Constructor Method
     */
    public ContentCreatorSubject() {
        observers = new ArrayList<ObserverInterface>();
    }
    /***
     * notify Method
     * @param valor
     * @param duelo
     */
    public void avisar(int valor, boolean duelo,int jug1, int jug2){
        //NewVideo
        notifyObserver(valor,duelo,jug1,jug2);
    }
    /***
     * Add new Observer
     * @param o 
     */
    public void linkObserver(ObserverInterface o){
        observers.add(o);
    }
    /***
     * Remove an observer
     * @param o 
     */
    public void unlinkObserver(ObserverInterface o){
        observers.remove(o);
    }
    /***
     * Notify to all observers
     * @param valor
     * @param duelo
     */
    @Override
    public void notifyObserver(int valor, boolean duelo, int jug1,int jug2){
        for (ObserverInterface o:observers){
            o.update(valor,duelo,jug1,jug2);
        }
    }
}
