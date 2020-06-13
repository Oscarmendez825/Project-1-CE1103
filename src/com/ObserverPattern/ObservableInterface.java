
package com.ObserverPattern;

/***
 * Subject Interface
 * @author Oscar Méndez Granados
 * @author Hansel Hampton Fallas 
 */
public interface ObservableInterface {//ContentCreator
    /***
     * Notify Method
     * @param valor
     * @param duelo
     * @param jug1
     * @param jug2
     */
    public void notifyObserver(int valor, boolean duelo,int jug1, int jug2);//Report that the ContentCreator post new video
}
