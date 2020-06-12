package com.littletennis;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

 /**Clase ImagenWall
  * es la que carga la imagen de fondo
  * @author Gordo_0195
  * */
@SuppressWarnings("serial")
public class ImagenWall extends JPanel{
    
	/** m�todo paintComponent() : es el que dibuja la imagen.
	 * @param Graphics g
	 * @return imagen dibujada en las coordenadas 0,0.
	 * @exception solo con imágenes png, jpg y gif.
	 */
    @Override
    public void paintComponent(Graphics g) {
    	Dimension dimensiones = getSize();
    	ImageIcon Wall = new ImageIcon(new ImageIcon(getClass().getResource("com/ImageLittle/Wall2.jpg")).getImage());
    	g.drawImage(Wall.getImage(), 0, 0, dimensiones.width, dimensiones.height, null);
    	this.setOpaque(false);
    	//this.set
    }
}