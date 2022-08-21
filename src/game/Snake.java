package game;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public class Snake extends JFrame {
	
	int width = 640;
	int height= 480;
	
	Point snake;
	int widthPoint = 10;
	int heightPoint = 10;
	
	ImageSnake imageSnake = new ImageSnake();
	
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
		
		snake = new Point(width/2, height/2);
		
		imageSnake = new ImageSnake();
		this.getContentPane().add(imageSnake);
		setVisible(true);
	}
	
//	Run | Debug
	public static void main(String[] args) {
		Snake s = new Snake();
	}
	
	public class ImageSnake extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(new Color(0, 0, 255));
			g.drawRect(snake.x, snake.y, widthPoint, heightPoint);
		}
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
