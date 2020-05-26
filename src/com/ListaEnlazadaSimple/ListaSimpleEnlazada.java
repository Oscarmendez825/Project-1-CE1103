
package com.ListaEnlazadaSimple;



public class ListaSimpleEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada<Integer> l = new ListaEnlazada<Integer>();
        
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(17);
        l.add(18);

        l.show();
        System.out.println("");
        System.out.println("");
        System.out.println(l.search(119));
        l.modify(3,115);
        l.remove(5);
        l.show();

    }
    
}
