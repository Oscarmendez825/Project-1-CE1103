/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Server;

import ListaEnlazadaSimple.ListaEnlazada;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author oscar
 */
public class ServerThread implements Runnable{
    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    //private int turno = 0 ;
    private ListaEnlazada<Socket> usuarios = new ListaEnlazada<Socket>();
    
    
    public ServerThread(Socket socket,ListaEnlazada usuarios){
        this.socket = socket;
        this.usuarios = usuarios;
    }
    @Override
    public void run() {
        try {
            //Inicializamos los canales de comunicacion y mandamos el turno a cada jugador
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
           
            
            while(true){//Receive de clients messages
               String received = in.readUTF();
               
                for (int i = 0; i < usuarios.getSize(); i++) {
                    out = new DataOutputStream(usuarios.get(i).getOutputStream());//send the message to all the active users
                    out.writeUTF(received);//send the message
                }
            }
        }catch(IOException e ){
            for (int i = 0; i < usuarios.getSize(); i++) {
                if(usuarios.get(i) == socket){
                    usuarios.remove(i);
                    break;
                } 
            }
            
            
        }}
    
}
