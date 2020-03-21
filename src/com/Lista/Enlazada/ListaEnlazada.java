
package com.Lista.Enlazada;


public class ListaEnlazada<Type> {
    private Nodo cabeza;
    private Nodo cola;
    private int size = 0;
    
    public boolean isEmpty() {
        if(cabeza == null || cola == null) {
            return true;
        } else 
            return false;
    }
    
    
    public void add(int posicion, Type data) {
        if(posicion == 0) {
            addPrimero(data);
        } else if(posicion == size - 1) {
            addCola(data);
        } else {
            if(!isEmpty()) {
                int index = 0;
                Nodo actual = cabeza;
                Nodo anterior = null;
                while(index <= posicion) {
                    if(index - posicion == -1) {
                        anterior = actual;
                    }
                    if(index == posicion) {
                        anterior.next = new Nodo(data);
                        anterior.next.next = actual;
                    }
                    actual = actual.next;
                    index+=1;
                }
            }
        }
        size+=1;
    }
    
    
    public void add(Type data) {
        if(isEmpty()) {
            addPrimero(data);
        } else {
            addCola(data);
        }
        size+=1;
    }
    
    
    public void addPrimero(Type data) {
        if(isEmpty()) {
            cabeza = new Nodo(data);
            cola = cabeza;
            size+=1;
        } else {
            Nodo temp = cabeza;
            cabeza = new Nodo(data);
            cabeza.next = temp;
            size+=1;
        }
    }
        
        
    public void addCola(Type data) {
        if(isEmpty()) {
            cola = new Nodo(data);
            cabeza = cola;
            size+=1;
        } else {
            cola.next = new Nodo(data);
            cola = cola.next;
            size+=1;
        }
    }
    

    public void remove(int position) {
        if(position == 0) {
            removeCola();
        } else if(position == size - 1) {
            removeCola();
        } else {
            Nodo current = cabeza;
            for(int i = 0 ; i <= position ; i++) {
                if(i == position - 1) {
                    current.next = current.next.next;
                }
                current = current.next;
            }
        }
        size -=1;
    }
    
    public void removeCabeza() {
        if(size == 1) {
            cabeza = null;
            cola = null;
        } else {
            cabeza = cabeza.next;
        }
        size -=1;
    }
    
    public void removeCola() {
        if(size == 1) {
            cabeza = null;
            cola = null;
        } else {
            Nodo actual = cabeza;
            for(int i = 0 ; i < size - 1 ; i++) {
                if(i == size - 2) {
                    cola = actual;
                }
                actual = actual.next;
            }
        }
        size -=1;
    }
    

    public Type get(int position) {
        if(position == 0) {
            return getCabeza();
        } else if(position == size - 1) {
            return getCola();
        } else {
            Nodo actual = cabeza;
            for(int i = 1 ; i <= position ; i++) {
                actual = actual.next;
                if(i == position) {
                    break;
                }
            }
            return (Type) actual.obtenerDatos();
        }
    }


    public Type getCabeza() {
        return (Type) cabeza.obtenerDatos();
    }
    
    public Type getCola() {
        return (Type) cola.obtenerDatos();
    }
    
    
    
    public int size() {
        return size;
    }
    
}
