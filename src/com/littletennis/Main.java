package com.littletennis;

import com.Player.GameUser;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 * Clase Main
 * Clase principal del mini juego. Es la que se ejecuta y llama a las dem�s clases.
 * @autor: Marco
 * @version: 0.8 : 06/06/2020
 */ 
@SuppressWarnings("serial")
public class Main extends JPanel{
	
	//declaration of variables:
	ImageIcon wall = new ImageIcon("Wall2.jpg");
	Ball ball = new Ball(this);
	Racquet raquet = new Racquet(this);
	int speed = 1;//iniciada en uno y en cada rebote de la pelota aumenta la velocidad con la curiosidad de que al ir sumando, cuando el resultado se convierte en negativo le da orientacion izquierda a la raqueta conservando la velocidad que se requiere.
	public static JFrame WinGame;
        public static boolean valor = true;
        private static int cont;
	/**Metodo getScore
	 *  este sirve para saber la puntuaci�n del jugador mediante la aceleraci�n del la pelota menos uno.
	 * @param nulo
	 * @return retorna la puntuaci�n del ussuario en entero
	 * @exception nulo
	*/
	private int getScore() {
		return speed-1;
	}
	/**
	 * Constructor Main: 
	 * inicia con un listener que mediente sus m�todos abstractos nos hace quedar a la espera para detectar los eventos de 
	 * movimiento adem�s de iniciar el soundtrack.
	 * @param nulo.
	 * @return el listener y el sonido del juego.
	 * @exception no detecta otras teclas que no sean las flechas.
	 * */
	public Main() {
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			@Override
			public void keyReleased(KeyEvent e) {
				raquet.keyReleased(e);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				raquet.KeyPressed(e);
			}
		});
		setFocusable(true);
		Music.SoundTrack.loop();
                
	}
	/**Metodo move(), invoca a los m�todos de movimiento de la clase raqueta y bola, de manera que este solo llama a los dos.
	 * @param no recibe par�metros aunque si es capaz de llamar metodos de las otras clases por herencia.
	 * @return retorna el movimiento de la pelota y la raqueta.
	 * @exception en el caso de la raqueta olo funciona con las teclas de direcci�n
	 * */
public void move() {
		ball.move();
		raquet.move();
	}
/**M�todo paint(), m�todo que dibuja los componentes del juego en la ventana principal.
 * @param Gr�fico g.
 * @return el grafico con los m�todos de movimiento de cada clase.
 * @exception nulo
 * */
@Override
public void paint(Graphics g) {
		super.paint(g);
		Graphics2D graphics =(Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics.setColor(Color.green);
		ball.paint(graphics);
		raquet.paint(graphics);
		
		graphics.setFont(new Font("Arial", Font.BOLD, 30));
		graphics.drawString(String.valueOf(getScore()),  10, 30);
	}
/** Metodo End(): es el que define lo que se debe hacer al perder el juego.
 * @param ninguno
 * @return detiene la m�sica, reproduce la de derrota, muestra el mensaje de finalizaci�n y termina la ejecuci�n.
 * @exception nulo.
 * */
    public void End(){
	Music.SoundTrack.stop();
	Music.Over.play();
	JOptionPane.showMessageDialog(this, "Mini Juego Finalizado", "GAME OVER", JOptionPane.YES_NO_OPTION);
        WinGame.setVisible(false);
        valor = false;
        
//	System.exit(ABORT);
    }
    public static void iniciarJuego() throws InterruptedException{
        WinGame = new JFrame("Little Tennis!");
	ImagenWall Wall = new ImagenWall();
        //Wall.setComponentOrientation(o);
	WinGame.setCursor(Cursor.HAND_CURSOR);
	
	Main game = new Main();
	WinGame.add(Wall);
	WinGame.add(game);
	WinGame.setSize(600,450);
	WinGame.setVisible(true);
	WinGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	while(valor!=false) {
            game.move();
            game.repaint();
            Thread.sleep(10);
        }
    }
    
/**m�todo main de inicializaci�n
     * @param args
 * @param puede usar atributos de todas las clases
 * @return un ciclo infinito con la inicializaci�n del juego
 * @exception nula
     * @throws java.lang.InterruptedException
 *  */
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException{
//	WinGame = new JFrame("Little Tennis!");
//	ImagenWall Wall = new ImagenWall();
//        //Wall.setComponentOrientation(o);
//	WinGame.setCursor(Cursor.HAND_CURSOR);
//	
//	Main game = new Main();
//	WinGame.add(Wall);
//	WinGame.add(game);
//	WinGame.setSize(600,450);
//	WinGame.setVisible(true);
//	WinGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	
//	
//	while(valor!=false) {
//            game.move();
//            game.repaint();
//            Thread.sleep(10);
//        }
    iniciarJuego();
	}
}
