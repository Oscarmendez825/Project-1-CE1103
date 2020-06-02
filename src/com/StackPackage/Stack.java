
package com.StackPackage;

import com.ListaEnlazadaSimple.ListaEnlazada;


public class Stack {
    
    private ListaEnlazada <String> stackList = new ListaEnlazada<String>();
    
    
    
    public void push(String data){
        this.stackList.addCabeza(data);
    }
    public Object pop(){
        return this.stackList.removeFirst().getData();
    }
    public String peek(){
        return stackList.getCabeza();
    }
    public boolean isEmpty(){
        return this.stackList.isEmpty();
    }
}
