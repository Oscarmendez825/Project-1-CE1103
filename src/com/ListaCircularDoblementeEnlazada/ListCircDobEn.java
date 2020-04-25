
package com.ListaCircularDoblementeEnlazada;


public class ListCircDobEn <Type>{
    
    int size = 0;
    NodeC start;
    NodeC end;
    
    
    public ListCircDobEn(){
        start = null;
        end = null;
    
    }
    public boolean isEmpty(){
        return (size == 0);
    }

    public int getSize(){
        return size;
    
    }
    public void show(){
        NodeC nodo = new NodeC();
        nodo = start;
        do{
            System.out.println(nodo.data);
            nodo = nodo.Nodenext;
        }while(nodo != start);
    
    }
    
    public void modify(int pos, Type data){
    
        if (isEmpty()){
            System.out.println("Error su lista está vacia");
        
        }else{
            if (pos == 0){
                start.data = data;
                
            }else{
                if(pos > 0 && pos < size){
                    NodeC aux = start;
                    for (int i = 0; i < size-1; i++){
                        if (i == pos-1){
                            NodeC mod = aux.Nodenext;
                            mod.data = data;
                            
                            aux.Nodenext = mod;
                        }else{
                            aux = aux.Nodenext;
                        }
                    
                    }
                }else{
                    System.out.println("La posicion ingresada no existe");
                }
            }
            
        
        }
    }
    
    public void add(Type data){
        NodeC nodo = new NodeC();
        nodo.data = data;
        if (start == null){
            start = nodo;
            start.Nodenext = start;
            nodo.Nodeprevious = end;
            end = nodo;
        }else{
            end.Nodenext = nodo;
            nodo.Nodenext = start;
            nodo.Nodeprevious = end;
            end = nodo;
            start.Nodeprevious = end;
        }
        size++;
    }
    
    public Type get(int pos){
        if (!isEmpty() && pos < size) {
            NodeC actual = start;
            for(int i = 1 ; i <= pos ; i++) {
                actual = actual.Nodenext;
                if(i == pos) {
                    break;
                }
            }
            return (Type) actual.data;
        }else{
            return null;
        }
        
    }
    
    public boolean search(Type data){
        NodeC nodo = new NodeC();
        nodo = start;
        do{
            if (nodo.data.equals(data)){
                return true; 
            }
            nodo = nodo.Nodenext;
        }while(nodo != start);
        return false;
    }
    
    public void remove(int pos){
        NodeC aux1 = new NodeC();
        NodeC aux2 = new NodeC();
        aux1 = start;
        aux2 = end;
        if (!isEmpty() && pos < size){
            if (pos == 0){
                start = start.Nodenext;
                end.Nodenext = start;
                start.Nodeprevious = end;
            
            } else if(pos == size-1){
                System.out.println("here");
                end = end.Nodeprevious;
                end.Nodenext = start;
                start.Nodeprevious = end;
            }else{
                for(int i = 0 ; i <= pos ; i++) {
                if(i == pos) {
                    aux2.Nodenext = aux1.Nodenext;
                    aux1.Nodenext.Nodeprevious = aux2;
                    
                    
                }
                aux2 = aux1;
                aux1 = aux1.Nodenext;
                
                
            }
        }
            size -=1;
        }else{
            System.out.println("La lista esta vacia o tiene ingreso una posicion erronea");
        }
    
    }

    }

    
      
   

