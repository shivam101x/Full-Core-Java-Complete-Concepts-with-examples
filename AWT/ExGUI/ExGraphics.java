package ExGUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class ExGraphics extends JFrame{
	public ExGraphics() {
		
		
		setSize(1330,700);
		setLayout(null);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(200, 200, 600, 400);
		
	}
	public static void main(String[] args) {
	
		ExGraphics ob=new ExGraphics();
	}

}
