
package com.Lista.Enlazada;


public class Nodo<Type> {
    public Type data;
    public Nodo next;

    public Nodo(Type data) {
        this.data = data;
    }

    public Type obtenerDatos() {
        return data;
    }

    public Nodo obtenerSiguiente() {
        return next;
    }
}
