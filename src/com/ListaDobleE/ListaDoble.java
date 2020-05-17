
package com.ListaDobleE;




public class ListaDoble <Type> {
    
    private NodoLD first;
    private NodoLD last;
    private int size = 0;
    public ListaDoble(){
        first = null;
        last = null;
            
    }
    public boolean isEmpty(){
        return(size == 0);
    
    }
    
    public boolean search(Type data){
        NodoLD nodo;
        nodo = last;
        do{
            if (nodo.getData().equals(data)){
                return true; 
            }
            nodo = nodo.getNodePrevious();
        }while(nodo != null);
        return false;
    }
    
    
    public void modify(int pos, Type data){
        if (isEmpty()){
            System.out.println("Error su lista está vacía");
            
        }else{
            if (pos == 0){
               first.setData(data);
            
            }else{
                if(pos > 0 && pos < size){
                
                    NodoLD aux = first;
                    int cont = 0;
                    while(true){
                        if (cont == pos){
                            aux.setData(data);
                            break;
                        }else{
                        aux = aux.getNodeNext();
                        cont++;
                        }
                    
                    }
                }else{
                    System.out.println("Error ingreso una posicion equivocada");
                }
                }
            }
        
        }
    
    public void remove(int pos){
         if (isEmpty()) {
            System.out.println("La lista es vacia...");
        } else {
            NodoLD aux = first;
            if (pos == size-1) {
                removeLast();
            } else if (pos == 0) {
                removeFirst();
            } else {
                for (int i = 0; i < pos; i++) {
                    aux = aux.getNodeNext();
                }
                aux.getNodeNext().setNodePrevious(aux.getNodePrevious());
                aux.getNodeNext().setNodeNext(aux.getNodeNext());
            }
            
        }size--;
    }   
    public void removeFirst(){
        if (!isEmpty()) {
            NodoLD head = first.getNodeNext();
            if (head == null) {
                first = null;
                last = null;
            }else {
                head.setNodePrevious(null);
                first = head;
            }
            size--;
        }
    }
    public void removeLast(){
       if (!isEmpty()) {
        NodoLD aux = last.getNodePrevious();
        if (aux == null) {
            first = null;
            last = null;
        } else {
            aux.setNodeNext(null);
            last = aux;
        }
        size--;
    }
    
    }
    public void add(Type data){
        NodoLD nodo = new NodoLD();
        nodo.setData(data);
        
        if (isEmpty()){
            first = nodo;
            first.setNodeNext(null);
            first.setNodePrevious(null);
            last = first;   
        
        }else{
            last.setNodeNext(nodo);
            nodo.setNodePrevious(last);
            nodo.setNodeNext(null);
            last = nodo;
        
        }
        size++;
        
        
    }

    public int getSize() {
        return size;
    }
    
    public void show(){
        NodoLD temp;
        temp = last;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNodePrevious();
        
        }
    }
    
    public Type get(int pos){
    
        int cont = 0;
        NodoLD temp = first;
        while(cont < pos){
            temp = temp.getNodeNext();
            cont++;
        }
            return (Type) temp.getData();
        }
    
    
    
}
