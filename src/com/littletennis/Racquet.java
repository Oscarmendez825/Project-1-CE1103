package com.littletennis;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.Color;
/**Clase Racquet: 
 * es la clase que define todas las caracteristicas de la pelota.
 * @author Gordo_0195
 * 
 * */
public class Racquet {
	//declaraci�n de variables:
	private static final int Y = 330;
	private static final int WIdTH = 120;
	private static final int HEIgTH = 20;
	int x = 0;
	int xb = 0;
	private Main game;
	
	/**Racquet: es el contructor de la clase que lleva su nombre
	 * @param un objeto de la clase Main() sobre el cual va a trabajar
	 * @return la instancia a ese objeto
	 * @exception solo funciona con esa clase de objeto. */
	public Racquet(Main game) {
		this.game = game; 
	}
	/**m�todo move(): es el que se encarga de mover la raqueta.
	 * @param no recibe par�metros originalmente pero trabaja las coordenadas x y xb
	 * @return la alteraci�n de esas cordenadas a nuestro antojo para mover la raqueta
	 * @exception solo trabaja numeros enteros.
	 * */
	public void move() {
		if(x + xb > 0 && x + xb < game.getWidth() - WIdTH) {
			x = x + xb;
		}
	}
	/**M�todo paint(): es el que dibuja la pelota.
	 * @param Gr�fico 2D g
	 * @return retorna la pelota dibujada seg�n las especificaciones.
	 * @exception solo recibe gr�ficos
	 * */
	public void paint(Graphics2D g) {
		g.fillRect(x, Y, WIdTH, HEIgTH);
		//g.setColor(Color.WHITE);
	}
	/**M�todo keyReleased(): es el que define el comportamiento al estar las teclas sin presionar.
	 * @param un objeto de la clase KeyEvent e
	 * @return 0
	 * @exception solo recibe eventos del teclado
	 * */
	public void keyReleased(KeyEvent e) { 
		xb = 0;
	}
	/**M�todo KeyPressed: es el que detecta la direcci�n del la raqueta.
	 * @param KeyEvent e
	 * @return retorna la velocidad y direcci�n de la pelota tras cada iteraci�n, siendo negativo a la izquierda y positivo a la derecha.
	 * @exception solo recibe eventos del teclado
	 * */
	public void KeyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			xb = -game.speed;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			xb = game.speed;
		}
	}
	/**M�todo getBounds: es el que se encarga de obtener las dimansiones y coordenadasde la racqueta.
	 * @param nulo
	 * @return retorna un nuevo rect�ngulo con las dimensiones de la pelota y sus coordenadas.
	 * @exception solo aplicable a rect�ngulos.
	 * */
	public Rectangle getBounds() {
		return new Rectangle(x, Y, WIdTH, HEIgTH);
	}
	
	/**M�todo getTopY(): es el que marca la linea donde se pierde.
	 * @param nulo
	 * @return el alto de la ventana de juego menos el alto de la raqueta.
	 * @exception solo retorna numeros enteros.
	 * */
	public int getTopY() {
		return Y - HEIgTH;
	}
	

}
