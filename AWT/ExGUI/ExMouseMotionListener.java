package ExGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class ExMouseMotionListener extends JFrame implements MouseMotionListener {
	
	public ExMouseMotionListener() {
		addMouseMotionListener(this);
		
		setSize(1300,700);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		ExMouseMotionListener ob=new ExMouseMotionListener();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		Graphics g=getGraphics();
		g.setColor(Color.green);
		g.fillOval(e.getX(),e.getY(), 20, 20);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
