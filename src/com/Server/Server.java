/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Server;

import ListaEnlazadaSimple.ListaEnlazada;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {
    private final int puerto = 2027;
    private final int noUsers = 4;
    private ListaEnlazada<Socket> users = new ListaEnlazada<Socket>(); 
    private boolean turno;
    
    
    
    public void listen(){
        try{
            ServerSocket servidor = new ServerSocket(puerto,noUsers);
            System.out.println("Esperando jugadores.....");
            while(true){
                Socket cliente = servidor.accept();
                users.add(cliente);
                System.out.println("Nuevo cliente conectado...");
                
                Runnable  run = new ServerThread(cliente,users);
                Thread thread = new Thread(run);
                thread.start();
            
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    public static void main(String[] args){
        Server server = new Server();
        server.listen();
    
    }
}
