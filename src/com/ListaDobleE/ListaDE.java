/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ListaDobleE;

/**
 *
 * @author oscar
 */
public class ListaDE {
    public static void main(String[] args){
        ListaDoble<Integer> l = new ListaDoble<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.show();
        
        System.out.println("");
        l.modify(0, 15);
        l.modify(1,16);
        l.modify(2, 17);
        l.modify(3, 18);
        l.show();
        
    
    }
}
