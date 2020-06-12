
package com.StackPackage;

import com.ListaEnlazadaSimple.ListaEnlazada;

/***
 * Stack class
 * @author Oscar Méndez
 * @author Keyner Gómez
 * @author Marco Picado
 * @author Hansel Hampton
 */
public class Stack {
    //Instancia//
    private ListaEnlazada <String> stackList = new ListaEnlazada<String>();
    
    
    /***
     * Método push
     * Agregar datos a la pila
     * @param data 
     */
    public void push(String data){
        this.stackList.addCabeza(data);
    }
    /***
     * Sacar y eliminar elementos de la cola
     * @return 
     */
    public Object pop(){
        return this.stackList.removeFirst().getData();
    }
    /***
     * Método peek
     * Ver el primer elemento en la pila
     * @return 
     */
    public String peek(){
        return stackList.getCabeza();
    }
    /***
     * Método isEmpty
     * Verifica que el stack no esté vacío
     * @return boolean
     */
    public boolean isEmpty(){
        return this.stackList.isEmpty();
    }
}
