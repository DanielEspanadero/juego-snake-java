package game;

import javax.swing.*;

public class Snake extends JFrame {
	
	int width = 640;
	int height= 480;
	
	public Snake() {
		setTitle("Snake");
		
		setSize(width, height);
		
		setVisible(true);
	}
	
//	Run | Debug
	public static void main(String[] args) {
		Snake s = new Snake();
	}
}
