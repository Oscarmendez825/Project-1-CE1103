
package com.ListaCircularDoblementeEnlazada;


public class ListCircDobEn <Type>{
    
    private int size = 0;
    private NodeC start;
    private NodeC end;
    
    
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
        nodo = end;
        do{
            System.out.println(nodo.getData());
            nodo = nodo.getNodeprevious();
        }while(nodo != end);
    
    }
    
    public void modify(int pos, Type data){
    
        if (isEmpty()){
            System.out.println("Error su lista está vacia");
        
        }else{
            if (pos == 0){
                start.setData(data);
                
            }else{
                if(pos > 0 && pos < size){
                    NodeC aux = start;
                    for (int i = 0; i < size-1; i++){
                        if (i == pos-1){
                            NodeC mod = aux.getNodenext();
                            mod.setData(data);
                            
                            aux.setNodenext(mod);
                        }else{
                            aux = aux.getNodenext();
                        }
                    
                    }
                }else{
                    System.out.println("La posicion ingresada no existe");
                }
            }
            
        
        }
    }
    
    public void add(Type data){
        NodeC nodo = new NodeC(data);
        
        if (start == null){
            start = nodo;
            start.setNodenext(start);
            nodo.setNodeprevious(end);
            end = nodo;
        }else{
            end.setNodenext(nodo);
            nodo.setNodenext(nodo);
            nodo.setNodeprevious(end);
            end = nodo;
            start.setNodeprevious(end);
        }
        size++;
    }
    
    public Type get(int pos){
        if (!isEmpty() && pos < size) {
            NodeC actual = start;
            for(int i = 1 ; i <= pos ; i++) {
                actual = actual.getNodenext();
                if(i == pos) {
                    break;
                }
            }
            return (Type) actual.getData();
        }else{
            return null;
        }
        
    }
    
    public boolean search(Type data){
        NodeC nodo = new NodeC();
        nodo = start;
        do{
            if (nodo.getData().equals(data)){
                return true; 
            }
            nodo = nodo.getNodenext();
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
                start = start.getNodenext();
                end.setNodenext(start);
                start.setNodeprevious(end);
            
            } else if(pos == size-1){
                System.out.println("here");
                end = end.getNodeprevious();
                end.setNodenext(start);
                start.setNodeprevious(end);
            }else{
                for(int i = 0 ; i <= pos ; i++) {
                if(i == pos) {
                    aux2.setNodenext(aux1.getNodenext());
                    aux1.getNodenext().setNodeprevious(aux2);
                    
                    
                }
                aux2 = aux1;
                aux1 = aux1.getNodenext();
                
                
            }
        }
            size--;
        }else{
            System.out.println("La lista esta vacia o tiene ingreso una posicion erronea");
        }
    
    }

    }

    
      
   

