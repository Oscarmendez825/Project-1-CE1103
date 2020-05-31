
package com.SnakeGame;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.Timer;

        
public class Gameplay extends JPanel implements KeyListener, ActionListener{

    private ImageIcon logoImage;
    private int[] longitudX = new int[750];
    private int[] longitudY = new int [750];
    private boolean izquierda = false;
    private boolean derecha = false;
    private boolean arriba = false;
    private boolean abajo = false;
    
    private ImageIcon snakeder;
    private ImageIcon snakearr;
    private ImageIcon snakeab;
    private ImageIcon snakeizq;
    private ImageIcon snakebody;
    private ImageIcon food;
    
    
    private int longitudinicial = 3;
    private Timer timer;
    private int delay = 100;
    private Random random = new Random();
    
    
    private int movimientos = 0;
    private int[] comidaX =  {25,50,100,125,150,175,200,225,250,275,300,325,350,375,400,425,450,475,500,525,550,575,600,625,650,
                             675,700,725,750,775,800,825,850};
    private int[] comidaY =  {100,125,150,175,200,225,250,275,300,325,350,375,400,425,450,475,500,525,550,575,600,625};
    
    
   private int posX = random.nextInt(34);
   private int posY = random.nextInt(21);
    
   static int puntaje;
    public Gameplay() {
        
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start();
        
    }
    
    @Override
    public void paint (Graphics g){
        
        if (movimientos == 0){
            longitudX[2] = 50;
            longitudX[1] = 75;
            longitudX[0] = 100;
            
            longitudY[2] = 100;
            longitudY[1] = 100;
            longitudY[0] = 100;
            

        }


        logoImage = new ImageIcon("logoSnakeGame.png");
        logoImage.paintIcon(this, g, 360,0);

        
        g.setColor(Color.WHITE);
        g.drawRect(24, 74, 851, 577);
        
        g.setColor(Color.BLACK);
        g.fillRect(25, 75, 850, 575);
        
        
        snakeder = new ImageIcon("derecha.png");
        snakeder.paintIcon(this, g, longitudX[0],longitudY[0]);
        
        for (int i = 0; i<longitudinicial; i++){
            
            if (i == 0 && derecha){
                snakeder = new ImageIcon("derecha.png");
                snakeder.paintIcon(this, g, longitudX[i],longitudY[i]);
            }
            if (i == 0 && izquierda){
                snakeizq = new ImageIcon("izquierda.png");
                snakeizq.paintIcon(this, g, longitudX[i],longitudY[i]);
            }
            if (i == 0 && arriba){
                snakearr = new ImageIcon("arriba.png");
                snakearr.paintIcon(this, g, longitudX[i],longitudY[i]);
            }
            if (i == 0 && abajo){
                snakeab = new ImageIcon("abajo.png");
                snakeab.paintIcon(this, g, longitudX[i],longitudY[i]);
            }
            if (i!=0){
                snakebody = new ImageIcon("cuerpo.png");
                snakebody.paintIcon(this, g, longitudX[i],longitudY[i]);
            }
        }
        
        food = new ImageIcon("comida.png");
        if (comidaX[posX]==longitudX[0] && comidaY[posY]==longitudY[0]){
            longitudinicial+=1;
            posX = random.nextInt(33);
            posY = random.nextInt(21);
            puntaje++;
            System.out.println(puntaje);
        }
        //System.out.println(comidaX[posX]+","+posX+";"+comidaY[posY]+","+posY);
        food.paintIcon(this, g, comidaX[posX], comidaY[posY]);
        
        g.dispose();
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
       if (e.getKeyCode() == KeyEvent.VK_RIGHT){
          
           movimientos++;
           derecha = true;
           if (!izquierda){
               derecha = true;
           }else{
               derecha = false;
               izquierda = true;
           }
           
           arriba = false;
           abajo = false;
           
       }
       if (e.getKeyCode() == KeyEvent.VK_LEFT){
          
           movimientos++;
           izquierda = true;
           if (!derecha){
               izquierda = true;
           }else{
               izquierda = false;
               derecha = true;
           }
           
           arriba = false;
           abajo = false;
           
       }
       if (e.getKeyCode() == KeyEvent.VK_UP){
          
           movimientos++;
           arriba = true;
           if (!abajo){
               arriba = true;
           }else{
               arriba = false;
               abajo = true;
           }
           
           izquierda = false;
           derecha = false;
           
       }
       if (e.getKeyCode() == KeyEvent.VK_DOWN){
          
           movimientos++;
           abajo = true;
           if (!arriba){
               abajo = true;
           }else{
               abajo = false;
               arriba = true;
           }
           
           izquierda = false;
           derecha = false;
           
       }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if (derecha==true ){
            for (int i = longitudinicial; i>=0; i--){
                
                longitudY[i+1] = longitudY[i];
            }
            for (int i = longitudinicial; i>=0; i--){
                
                if (i == 0){
                    
                    longitudX[i]=longitudX[i]+25;
                    
                }else{
                    
                    longitudX[i]=longitudX[i-1];
                    
                }
                
                if (longitudX[i] > 850){
                    longitudX[i] = 25;
                    
                }
                
                repaint();
            }
            
        }
        if (izquierda==true ){
            for (int i = longitudinicial; i>=0; i--){
                
                longitudY[i+1] = longitudY[i];
            }
            for (int i = longitudinicial; i>=0; i--){
                
                if (i == 0){
                    
                    longitudX[i]=longitudX[i]-25;
                    
                }else{
                    
                    longitudX[i]=longitudX[i-1];
                    
                }
                
                if (longitudX[i] < 25){
                    longitudX[i] = 850;
                    
                }
                
                repaint();
            }
        }
        if (arriba==true ){
            for (int i = longitudinicial; i>=0; i--){
                
                longitudX[i+1] = longitudX[i];
            }
            for (int i = longitudinicial; i>=0; i--){
                
                if (i == 0){
                    
                    longitudY[i]=longitudY[i]-25;
                    
                }else{
                    
                    longitudY[i]=longitudY[i-1];
                    
                }
                
                if (longitudY[i] < 75){
                    longitudY[i] = 625;
                    
                }
                
                repaint();
            }
        }
        if (abajo==true ){
            for (int i = longitudinicial; i>=0; i--){
                
                longitudX[i+1] = longitudX[i];
            }
            for (int i = longitudinicial; i>=0; i--){
                
                if (i == 0){
                    
                    longitudY[i]=longitudY[i]+25;
                    
                }else{
                    
                    longitudY[i]=longitudY[i-1];
                    
                }
                
                if (longitudY[i] > 625){
                    longitudY[i] = 75;
                    
                }
                
                repaint();
            }
        }
        
    }


}
