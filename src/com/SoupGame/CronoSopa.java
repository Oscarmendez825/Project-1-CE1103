package com.SoupGame;

import javax.swing.JLabel;


/**
 * CronoSopa class
 * @author Oscar Méndez
 * @since 2020
 * @version 0.9
 */
public class CronoSopa extends Thread {
    //ATRIBUTOS E INSTANCIAS//
    JLabel eti;
    /***
     * Método Constructor
     * @param label JLabel
     */
    public CronoSopa(JLabel label){
        this.eti = label;
    
    }
    /***
     * Método Run
     * Inicia el hilo que controla el cronometro
     */
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
    /***
     * Método ejecutarcrono
     * Se encarga de hacer las iteraciones en el crono
     */
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
