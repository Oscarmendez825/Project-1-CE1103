
package com.ListaDobleE;




public class ListaDoble <Type> {
    
    NodoLD first;
    NodoLD last;
    int size = 0;
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
            if (nodo.data.equals(data)){
                return true; 
            }
            nodo = nodo.nodePrevious;
        }while(nodo != null);
        return false;
    }
    
    
    public void modify(int pos, Type data){
        if (isEmpty()){
            System.out.println("Error su lista está vacía");
            
        }else{
            if (pos == 0){
               first.data = data;
            
            }else{
                if(pos > 0 && pos < size){
                
                    NodoLD aux = first;
                    int cont = 0;
                    while(true){
                        if (cont == pos){
                            aux.data = data;
                            break;
                        }else{
                        aux = aux.nodeNext;
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
        NodoLD temp = first;
        NodoLD aux = null;
        int cont = 0;
        if (pos == 0){
            System.out.println("siiu");
            first = first.nodeNext;
            first.nodePrevious = null;
            
        }else if (pos == size-1){
            last = last.nodePrevious;
            last.nodeNext = null;
        
        }else{
            while (true){
                if (cont == pos){
                    aux.nodeNext = temp.nodeNext;
                    temp.nodeNext.nodePrevious = temp.nodePrevious;
                    break;
                
                }else{
                    aux = temp;
                    temp = temp.nodeNext;
                    cont++;
                    }
        }
    }   size--;
    }
    public void add(Type data){
        NodoLD nodo = new NodoLD();
        nodo.data = data;
        
        if (isEmpty()){
            first = nodo;
            first.nodeNext = null;
            first.nodePrevious = null;
            last = first;   
        
        }else{
            last.nodeNext = nodo;
            nodo.nodePrevious = last;
            nodo.nodeNext = null;
            last = nodo;
        
        }
        size++;
        
        
    }

    public int getSize() {
        return size;
    }
    
    public void show(){
        NodoLD temp;
        temp = first;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.nodeNext;
        
        }
    }
    
    public Type get(int pos){
    
        int cont = 0;
        NodoLD temp = first;
        while(cont < pos){
            temp = temp.nodeNext;
            cont++;
        }
            return (Type) temp.data;
        }
    
    
    
}
