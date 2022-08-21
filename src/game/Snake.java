package game;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Point;

public class Snake extends JFrame {
	
	int width = 640;
	int height= 480;
	
	public Snake() {
		setTitle("Snake");
		
		setSize(width, height);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

//		La ventana se abre en el centro de la pantalla.
		this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		
//		Cuando pulsamos cerrar, la ventana se cierra.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Teclas teclas = new Teclas();
		this.addKeyListener(teclas);
		
		setVisible(true);
	}
	
//	Run | Debug
	public static void main(String[] args) {
		Snake s = new Snake();
	}
	
	public class Teclas extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			
//			Salimos de la aplicacion si pulsamos la tecla ESC.
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				System.exit(0);
			}
		}
	}
}
