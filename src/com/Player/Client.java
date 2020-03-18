
package com.Player;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;



public class Client implements Runnable {//clase
    //Atributes
        JEditorPane window;
        private Socket port;//port for a client-----encapsulamiento
        private int genport = 1201;//the number of the port-----encapsulamiento
        private String ip= JOptionPane.showInputDialog("WRITE THE IP OF THE SERVER");
        private DataInputStream datain;//input data -----encapsulamiento
        private DataOutputStream dataout;//output data -----encapsulamiento
        private String message="";//variable to save the message-----encapsulamiento
        



    public Client(JEditorPane window){//metodo
        this.window = window;
        try {
            port = new Socket(ip,genport);//make the connection to the server
            datain = new DataInputStream(port.getInputStream());//read the input data
            dataout = new DataOutputStream(port.getOutputStream());//read the output data
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public void run() {//metodo
        try{
            while(true){
                message += datain.readUTF();//read message and save it in a string variable
                window.setText(message);//show the message in screen
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