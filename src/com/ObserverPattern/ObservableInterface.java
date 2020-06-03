
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
     */
    public void notifyObserver(int valor, boolean duelo);//Report that the ContentCreator post new video
}
