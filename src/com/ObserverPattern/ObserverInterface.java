
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
     * @param jug
     * @param jug2
     */
    public void update(int valor, boolean accion, int jug,int jug2);//Update when the subject notify something
}
