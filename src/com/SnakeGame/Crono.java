
package com.SnakeGame;

import javax.swing.JLabel;



public class Crono extends Thread {
    
    JLabel eti;
    
    public Crono(JLabel label){
        this.eti = label;
        
    }
    @Override
    public void run(){
        try{
            
            while (PosicionesStart.iniciarHilo==true){
                Thread.sleep(100);
                ejecutarcrono();
                
            }
        }catch(Exception e){
            System.out.println("Excepcion en el hilo: "+ e.getMessage());
        
        }
    
    }

    private void ejecutarcrono() {
       PosicionesStart.seg++;
       if (PosicionesStart.seg>59){
          PosicionesStart.seg = 0;
          
          PosicionesStart.setPuntaje();
          PosicionesStart.iniciarHilo = false;
          PosicionesStart.obj.setVisible(false);
          this.stop();
          
       }
        
       String min = "", seg = "", hora = "";
       if (PosicionesStart.seg<10){
           seg+="0"+PosicionesStart.seg;
       }else{
           seg+= PosicionesStart.seg;
       }
       if (PosicionesStart.min<10){
           min+="0"+PosicionesStart.min;
       }
       else{
           min+= PosicionesStart.min;
       }
       if (PosicionesStart.hora < 10){
           hora+="0"+PosicionesStart.hora;
       
       }else{
            hora+=PosicionesStart.hora;
       }
       
       String valor = hora+":"+min+":"+seg;
       eti.setText(valor);
    }
    
}
