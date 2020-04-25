/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Player;

import ListaEnlazadaSimple.ListaEnlazada;
import com.ListaCircularDoblementeEnlazada.ListCircDobEn;
import com.ListaDobleE.ListaDoble;
import com.Player.GameUser;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author oscar
 */
public class ClientThread implements Runnable{
    private Socket port;
    private int genport = 2027;
    private DataInputStream datain;
    private DataOutputStream dataout;
    private String message="";
    JLabel p1;
    JLabel p2;
    JLabel p3;
    JLabel p4;
    ListCircDobEn<JLabel> tablero = new ListCircDobEn<JLabel>();
    ListaEnlazada<JLabel> faseA = new ListaEnlazada<JLabel>();
    ListaEnlazada<JLabel> faseB = new ListaEnlazada<JLabel>();
    ListaDoble<JLabel> faseC = new ListaDoble<JLabel>();
    ListCircDobEn<JLabel> faseD = new ListCircDobEn<JLabel>();
    ImageIcon per;
    int valor = GameUser.personaje;
    
    
    
    public ClientThread(JLabel p1, JLabel p2, JLabel p3, JLabel p4, ListCircDobEn tablero, ListaEnlazada faseA, ListaEnlazada faseB, ListaDoble faseC,ListCircDobEn faseD) {
        try {
            port = new Socket(GameUser.ip,genport);//make the connection to the server
            datain = new DataInputStream(port.getInputStream());//read the input data
            dataout = new DataOutputStream(port.getOutputStream());//read the output data
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.tablero = tablero;
        this.faseA = faseA;
        this.faseB = faseB;
        this.faseC = faseC;
        this.faseD = faseD;
        p1.setIcon(setImage(valor));
        
        }
    
    public ImageIcon setImage(int valor){
        switch (valor) {
            case 1:
                per = new ImageIcon("halo.png");
                break;
            case 2:
                per = new ImageIcon("goku.png");
                break;
            case 3:
                per = new ImageIcon("mazinger.jpeg");
                break;
            case 4:
                per = new ImageIcon("crash.png");
                break;

            default:
                break;
        }

        return per;    

    }
    public void run() {//metodo
        try{
            while(true){
                message += datain.readUTF();//read message and save it in a string variable
                System.out.println(message);
               
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public void sendmessage(String message){//metodo
        try {
            dataout.writeUTF(message);//send messages
        } catch (IOException e) {
            e.printStackTrace();
        }
}
    }
    
    
    
    
    

