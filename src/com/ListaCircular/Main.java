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
public class Main {
    public static void main(String[] args){
        ListaCircular<Integer> l = new ListaCircular<Integer>();
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(17);
        l.add(18);
        l.add(19);
        //l.remove(3);
        
        l.show();
        System.out.println("");
        System.out.println("");
        System.out.println(l.get(0));
    }
}
