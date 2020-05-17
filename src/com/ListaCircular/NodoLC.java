/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ListaCircular;

/**
 *
 * @author oscar
 */
public class NodoLC<Type> {
    private Type data;
    private NodoLC next;
    
    public NodoLC(Type data){
        this.data = data;
        this.next = null;
    }

    public NodoLC() {
        this.data = data;
        this.next = null;
    }

    public Type getData() {
        return data;
    }

    public void setData(Type data) {
        this.data = data;
    }

    public NodoLC getNext() {
        return next;
    }

    public void setNext(NodoLC next) {
        this.next = next;
    }
    
}
