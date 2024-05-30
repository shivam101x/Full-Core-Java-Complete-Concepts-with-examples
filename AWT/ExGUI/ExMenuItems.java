package ExGUI;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExMenuItems extends Frame{
	public ExMenuItems() {
		MenuBar mb=new MenuBar();
		Menu m1=new Menu("File");
		Menu m2=new Menu("Edit");
		Menu m3=new Menu("Help");
		
		MenuItem mt1=new MenuItem("New");
		MenuItem mt2=new MenuItem("Copy");
		MenuItem mt3=new MenuItem("Cut");
		MenuItem mt4=new MenuItem("Paste");
		MenuItem mt5=new MenuItem("About");
		
		m1.add(mt1);
		m2.add(mt2);
		m2.add(mt3);
		m2.add(mt4);
		m3.add(mt5);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		setMenuBar(mb);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setSize(1360,600);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		ExMenuItems ob=new ExMenuItems();
	}

}
