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
public class ListaCircular<Type> {
    private NodoLC first ;
    private NodoLC last ;
    private int size ;


    public ListaCircular(){
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty(){
        return (first == null && last == null);
    }

 
    public int getSize(){
        return size;
    }

    public void addFirst(Type data){
        NodoLC<Type> newNode = new NodoLC<Type>(data);    
        newNode.setNext(first);
        if(first == null){            
            first = newNode;
            newNode.setNext(first);
            last = first;            
        }else{
            last.setNext(newNode);
            first = newNode;        
        }
        size++ ;
    }

    public void add(Type data){
        NodoLC<Type> newNode = new NodoLC<Type>(data);    
        newNode.setNext(first);
        if(first == null){            
            first = newNode;
            newNode.setNext(first);
            last = first;            
        }else{
            last.setNext(newNode);
            last = newNode;            
        }
        size++ ;
    }

    public void addByPos(Type data,int pos){
        NodoLC<Type> newNode = new NodoLC<Type>(data);                
        NodoLC aux = first;
        pos = pos - 1 ;
        for (int i=1;i<size-1;i++){
            if (i == pos){
                NodoLC temp = aux.getNext() ;
                aux.setNext(newNode);
                newNode.setNext(temp);
                break;
            }aux = aux.getNext();
        }
        size++;
    }

    public void remove(int pos){    
        if (size==1&&pos==0){
            first = null;
            last = null;
            size = 0;
        }else if (pos == 0){
            first = first.getNext();
            last.setNext(first);
            size--; 
        }if (pos == size-1){
            NodoLC aux1 = first;
            NodoLC aux2 = first;
            while (aux1!=last){
                aux2 = aux1;
                aux1 = aux1.getNext();
            }
            last = aux2;
            last.setNext(first);
            size --;

        }
        NodoLC temp = first;
        
        for (int i = 1; i < size - 1; i++) {
            if (i == pos) {
                NodoLC aux = temp.getNext();
                aux = aux.getNext();
                temp.setNext(aux);
                break;
            }
            temp = temp.getNext();
        }
        size-- ;
    }

    public void show(){
        NodoLC temp;
        NodoLC temp2;
        temp2 = first;
        temp = first;
        while (temp2 != last){
            System.out.println(temp.getData());
            temp2 = temp;
            temp = temp.getNext();
        
        }
        
    }
    public Type get(int pos){
        if(pos < size){ 
            int cont = 0;
            NodoLC temp = first;
            while(cont < pos){
                temp = temp.getNext();
                cont++;
            }
                return (Type) temp.getData();
        }
        return null;
    }

    
    
    
}
