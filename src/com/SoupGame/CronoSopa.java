package com.SoupGame;

import javax.swing.JLabel;


/**
 *
 * @author badstone
 */
public class CronoSopa extends Thread {
    
    JLabel eti;
    
    public CronoSopa(JLabel label){
        this.eti = label;
    
    }
    @Override
    public void run(){
        try{
            
            while (SopaGame.iniciarHilo==true){
                Thread.sleep(1000);
                ejecutarcrono();
                
            }
        }catch(Exception e){
            System.out.println("Excepcion en el hilo: "+ e.getMessage());
        
        }
    
    }

    private void ejecutarcrono() {
       SopaGame.seg++;
       if (SopaGame.seg > 59){
           SopaGame.seg = 0;
           SoupScores.setPuntaje();
           
           SopaGame.iniciarHilo = false;
           SopaGame.ventana.setVisible(false);
         
       }
       String seg = "";
       if (SopaGame.seg<10){
           seg+="0"+SopaGame.seg;
       }else{
           seg+= SopaGame.seg;
       }
       
       String valor = "00"+":"+"00"+":"+seg;
       eti.setText(valor);
    }
    
}
