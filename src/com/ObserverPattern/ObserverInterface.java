
package com.ObserverPattern;
/***
 * Observer Interface
 * @author Oscar Méndez Granados
 * @author Hansel Hampton Fallas
 */

public interface ObserverInterface {//Subscriber
    /***
     * Update Method
     * @param valor
     * @param accion
     */
    public void update(int valor, boolean accion);//Update when the subject notify something
}
