package ExGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PizzaBil extends JFrame implements ActionListener{
	JTextField jTextField1,jTextField2,jTextField3,jTextField4,jTextField5,jTextField6;
	JRadioButton jRadioButton1,jRadioButton2,jRadioButton3;
	JCheckBox jCheckBox1,jCheckBox2,jCheckBox3,jCheckBox4;
	JTextArea jTextArea1;
	JButton btn1,btn2;

	 public PizzaBil() {
		 jTextField1=new JTextField(); jTextField2=new JTextField(); jTextField3=new JTextField();
		 jTextField4=new JTextField(); jTextField4=new JTextField(); jTextField5=new JTextField();
		 jTextField6=new JTextField();
		 jRadioButton1=new JRadioButton();jRadioButton2=new JRadioButton();jRadioButton3=new JRadioButton();
		 jCheckBox1=new JCheckBox();jCheckBox2=new JCheckBox();jCheckBox3=new JCheckBox();jCheckBox4=new JCheckBox();
		 jTextArea1=new JTextArea();
		
		 
			 jTextField1.setBounds(100,100,300,40);
			 jTextField2.setBounds(100,150,300,40);
			 jTextField3.setBounds(100,200,300,40);
			 jTextField4.setBounds(100,250,300,40);
			 jTextField5.setBounds(100,300,300,40);
			 jTextField6.setBounds(100,350,300,40);
			
			 ButtonGroup bg=new ButtonGroup();
			 bg.add(jRadioButton1); bg.add(jRadioButton2); bg.add(jRadioButton3);
			jRadioButton1.setBounds(150, 400,30,30);
			jRadioButton2.setBounds(150, 440,30,30);
			jRadioButton3.setBounds(150, 480,30,30);
			jRadioButton1.setSelected(true);
			jCheckBox1.setBounds(350, 400,30,30);
			jCheckBox2.setBounds(350, 440,30,30);
			jCheckBox3.setBounds(350, 480,30,30);
			jCheckBox4.setBounds(350, 520,30,30);
			jTextArea1.setText("");
			jTextArea1.setBounds(300,600,600,80);
			add(jCheckBox1);add(jCheckBox2);add(jCheckBox3);add(jCheckBox4);add(jRadioButton1);add(jRadioButton2);
			add(jRadioButton3);add(jTextArea1);add(jTextField1);add(jTextField2);add(jTextField3);add(jTextField4);
			add(jTextField5);add(jTextField6);
			
			
			
		    btn1=new JButton("Generate Bil...");
			btn1.setBounds(500,560,250,40);
			add(btn1);
			btn1.addActionListener(this);
			
			btn2=new JButton("Clear..");
			btn2.setBounds(900,560,250,40);
			add(btn2);
			
			btn2.addActionListener(this);
			
			setSize(1330,7720);
			setLayout(null);
			setVisible(true);
		 
	}
	public static void main(String[] args) {
		PizzaBil pizza=new PizzaBil();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource()==btn1) {
		// Takes input from TextFields
				int orderno
					= Integer.parseInt(
						jTextField1.getText());
				String custname
					= jTextField2.getText();
				int qty
					= Integer.parseInt(
						jTextField3.getText());
				double rate = 0;

				// Pizza Type conditions
				if (jRadioButton1.isSelected()) {
					rate = 200;
				}
				else if (jRadioButton2.isSelected()) {
					rate = 300;
				}
				else if (jRadioButton3.isSelected()) {
					rate = 150;
				}
				// Displays rate of selected pizza
				// type in TextField
				jTextField4.setText(
					"" + rate);

				double topamt = 0;

				// Pizza toppings conditions
				if (jCheckBox1.isSelected()) {
					topamt = 60;
				}
				if (jCheckBox2.isSelected()) {
					topamt = topamt + 30;
				}
				if (jCheckBox3.isSelected()) {
					topamt = topamt + 40;
				}
				if (jCheckBox4.isSelected()) {
					topamt = topamt + 50;
				}
				// Displays total amount of
				// selected pizza toppings in TextField
				jTextField6.setText(
					""
					+ topamt);

				// Total amount is calculated
				double totalpayable
					= (rate * qty) + topamt;
				jTextField5.setText("" + totalpayable);

				// Displays order details
				jTextArea1
					.setText(
						"Hello, your Order Id is: " + orderno
						+ "\nName: " + custname
						+ "\nAMOUNT PAYABLE IS: " + totalpayable);

				try {
					ExCreatePDF pdf=new ExCreatePDF(orderno, custname, totalpayable);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

	}	
	else if (e.getSource()==btn2) {
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField4.setText("");
		jTextField5.setText("");
		jTextField6.setText("");
		jRadioButton1.setSelected(false);
		jRadioButton2.setSelected(false);
		jRadioButton3.setSelected(false);
		jCheckBox1.setSelected(false);
		jCheckBox2.setSelected(false);
		jCheckBox3.setSelected(false);
		jCheckBox4.setSelected(false);
		jTextArea1.setText("");
		
//		NewWindow ob=new NewWindow();
	}
	}

}
