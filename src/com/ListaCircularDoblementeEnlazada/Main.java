/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ListaCircularDoblementeEnlazada;


public class Main {


    public static void main(String[] args) {
        ListCircDobEn<Integer> list = new ListCircDobEn<Integer>();
        System.out.println(list.isEmpty());
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.show();
        list.modify(3, 30);
        System.out.println("");
        System.out.println("");
        //list.show();
        System.out.println("");
        System.out.println("");
        //list.remove(0);
        list.show();
        System.out.println("");
        System.out.println("");
        System.out.println("tamaño: " + list.getSize());
        System.out.println(list.search(11));
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        
    }
    
}
