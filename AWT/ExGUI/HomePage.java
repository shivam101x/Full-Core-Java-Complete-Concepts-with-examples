package ExGUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.UIManager;

public class HomePage extends Frame{
	
	public HomePage() {
		Panel pn1=new Panel();
		Panel pn2=new Panel();
		pn1.setBounds(0,30,600,500);
		pn2.setBounds(600,30,600,500);
		pn1.setBackground(getBackground().GREEN);
		pn2.setBackground(getBackground().BLUE);
		TextField txt1=new TextField();
		Button bt=new Button("Submit");
		Label l1=new Label("Name");
		l1.setBounds(250,180,300,40);
		
		txt1.setBounds(100,100,300,40);
		bt.setBounds(420,100,100,40);
		txt1.setBackground(getBackground().LIGHT_GRAY);
		txt1.setForeground(Color.blue);
		pn1.add(l1);pn1.add(txt1);pn1.add(bt);
		pn2.add(l1);pn2.add(txt1);pn2.add(bt);
		add(pn1);
		add(pn2);
		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str=txt1.getText();
				l1.setText(str);
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setSize(1200, 600);
		setLayout(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		 try { 
			  
	            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); 
	        } 
	        catch (Exception e) { 
	            System.out.println("Look and Feel not set"); 
	        } 
		
		HomePage ob=new HomePage();
		

	}

}
