import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class HotelManagement {
	
	int a=0,b=0,c=0,f=0;
	public String Str1,Str2,Str3;
	String str1,str2,str3,str4;
	
	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txt11;
	private JTextField textField_8;
	private JTextField txt8;
	private JTextField txt9;
	private JTextField txt10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelManagement window = new HotelManagement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HotelManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1077, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.RED);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(27, 148, 484, 222);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurgger = new JLabel("Chicken Burger");
		lblChickenBurgger.setBounds(10, 11, 72, 21);
		panel.add(lblChickenBurgger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setBounds(10, 43, 97, 21);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblChiBurger = new JLabel("Cheese Burger");
		lblChiBurger.setBounds(10, 75, 72, 21);
		panel.add(lblChiBurger);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 124, 268, 9);
		panel.add(separator);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setBounds(10, 133, 72, 21);
		panel.add(lblDrink);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(217, 133, 72, 21);
		panel.add(lblQuantity);
		
		txt1 = new JTextField();
		txt1.setText("0");
		txt1.setBounds(170, 11, 86, 20);
		panel.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setText("0");
		txt2.setColumns(10);
		txt2.setBounds(170, 43, 86, 20);
		panel.add(txt2);
		
		txt3 = new JTextField();
		txt3.setText("0");
		txt3.setColumns(10);
		txt3.setBounds(170, 75, 86, 20);
		panel.add(txt3);
		
		txt4 = new JTextField();
		txt4.setText("0");
		txt4.setColumns(10);
		txt4.setBounds(217, 165, 86, 20);
		panel.add(txt4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String [] {"--select--","cola","pepsi"}));
		comboBox.setBounds(10, 165, 72, 20);
		panel.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Home Delivary");
		rdbtnNewRadioButton.setBounds(10, 192, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnTax = new JRadioButton("Tax");
		rdbtnTax.setBounds(186, 192, 109, 23);
		panel.add(rdbtnTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(27, 381, 484, 116);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of drinks");
		lblCostOfDrinks.setBounds(10, 11, 72, 21);
		panel_1.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of meal");
		lblCostOfMeal.setBounds(10, 43, 72, 21);
		panel_1.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivary = new JLabel("Cost of delivary");
		lblCostOfDelivary.setBounds(10, 75, 86, 21);
		panel_1.add(lblCostOfDelivary);
		
		txt5 = new JTextField();
		txt5.setColumns(10);
		txt5.setBounds(150, 11, 86, 20);
		panel_1.add(txt5);
		
		txt6 = new JTextField();
		txt6.setColumns(10);
		txt6.setBounds(150, 43, 86, 20);
		panel_1.add(txt6);
		
		txt7 = new JTextField();
		txt7.setColumns(10);
		txt7.setBounds(150, 75, 86, 20);
		panel_1.add(txt7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(514, 148, 245, 222);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency converter");
		lblCurrencyConverter.setBounds(10, 11, 225, 43);
		panel_2.add(lblCurrencyConverter);
		lblCurrencyConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"--select--","US","EUR"}));
		comboBox_1.setBounds(20, 75, 146, 26);
		panel_2.add(comboBox_1);
		
		txt11 = new JTextField();
		txt11.setColumns(10);
		txt11.setBounds(20, 143, 146, 26);
		panel_2.add(txt11);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=(String) comboBox_1.getSelectedItem();
				if(s.equals("US")) {
					String value=txt11.getText();
					double val=Integer.parseInt(value);
					double va=val*0.014;
					txt11.setText("");
					txt11.setText(String.valueOf(String.format("%.2f",va)));
				}
				else if(s.equals("EUR")) {
					String value=txt11.getText();
					double val=Integer.parseInt(value);
					double va=val*0.013;
					txt11.setText("");
					txt11.setText(String.valueOf(String.format("%.2f",va)));
				}
			}
		});
		btnConvert.setBounds(10, 188, 89, 23);
		panel_2.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt11.setText("");
			}
		});
		btnClose.setBounds(146, 188, 89, 23);
		panel_2.add(btnClose);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.YELLOW);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(514, 381, 245, 116);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(10, 11, 72, 21);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub total");
		lblSubTotal.setBounds(10, 43, 72, 21);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 80, 72, 21);
		panel_3.add(lblTotal);
		
		txt8 = new JTextField();
		txt8.setColumns(10);
		txt8.setBounds(105, 11, 86, 20);
		panel_3.add(txt8);
		
		txt9 = new JTextField();
		txt9.setColumns(10);
		txt9.setBounds(105, 43, 86, 20);
		panel_3.add(txt9);
		
		txt10 = new JTextField();
		txt10.setColumns(10);
		txt10.setBounds(105, 80, 86, 20);
		panel_3.add(txt10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.MAGENTA);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(761, 145, 290, 352);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 46, 260, 281);
		panel_4.add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.ORANGE);
		tabbedPane.addTab("Calculator", null, layeredPane, null);
		layeredPane.setLayout(null);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(textField_8.getText().concat(btn0.getText()));
				
			}
		});
		btn0.setBounds(10, 206, 43, 23);
		layeredPane.add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(textField_8.getText().concat(btndot.getText()));
			}
		});
		btndot.setBounds(63, 206, 43, 23);
		layeredPane.add(btndot);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(127, 206, 43, 23);
		layeredPane.add(button_1);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float res1,res;
				float res2=Float.parseFloat(textField_8.getText());
				f=1;
				if(Str2.equals("+"))
				{
				res1=Float.parseFloat(Str1);
				res=res1+res2;
				String str=String.valueOf(res);
				textField_8.setText(str);

				}
				else if(Str2.equals("-"))
				{
				res1=Float.parseFloat(Str1);
				res=res1-res2;
				String str=String.valueOf(res);
				textField_8.setText(str);

				}
				else if(Str2.equals("*"))
				{
				res1=Float.parseFloat(Str1);
				res=res1*res2;
				String str=String.valueOf(res);
				textField_8.setText(str);

				}
				else if(Str2.equals("/"))
				{
				res1=Float.parseFloat(Str1);
				res=res1/res2;
				String str=String.valueOf(res);
				textField_8.setText(str);

				}
			}
		});
		btnequal.setBounds(180, 206, 43, 23);
		layeredPane.add(btnequal);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(textField_8.getText().concat(btn1.getText()));
			}
		});
		btn1.setBounds(10, 172, 43, 23);
		layeredPane.add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(textField_8.getText().concat(btn4.getText()));
			}
		});
		btn4.setBounds(10, 138, 43, 23);
		layeredPane.add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(textField_8.getText().concat(btn7.getText()));
			}
		});
		btn7.setBounds(10, 104, 43, 23);
		layeredPane.add(btn7);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(10, 70, 43, 23);
		layeredPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText("");
			}
		});
		btnC.setBounds(63, 70, 43, 23);
		layeredPane.add(btnC);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(textField_8.getText().concat(btn8.getText()));
			}
		});
		btn8.setBounds(63, 104, 43, 23);
		layeredPane.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(textField_8.getText().concat(btn5.getText()));
			}
		});
		btn5.setBounds(63, 138, 43, 23);
		layeredPane.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(textField_8.getText().concat(btn2.getText()));
			}
		});
		btn2.setBounds(63, 172, 43, 23);
		layeredPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(textField_8.getText().concat(btn3.getText()));
			}
		});
		btn3.setBounds(127, 172, 43, 23);
		layeredPane.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(textField_8.getText().concat(btn3.getText()));
			}
		});
		btn6.setBounds(127, 138, 43, 23);
		layeredPane.add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(textField_8.getText().concat(btn9.getText()));
			}
		});
		btn9.setBounds(127, 104, 43, 23);
		layeredPane.add(btn9);
		
		JButton button_14 = new JButton("New button");
		button_14.setBounds(127, 70, 43, 23);
		layeredPane.add(button_14);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Str1=textField_8.getText();
				textField_8.setText("");
				Str2=btndiv.getText();
			}
		});
		btndiv.setBounds(180, 172, 43, 23);
		layeredPane.add(btndiv);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Str1=textField_8.getText();
				textField_8.setText("");
				Str2=btnmul.getText();
			}
		});
		btnmul.setBounds(180, 138, 43, 23);
		layeredPane.add(btnmul);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Str1=textField_8.getText();
				textField_8.setText("");
				Str2=btnsub.getText();
			}
		});
		btnsub.setBounds(180, 104, 43, 23);
		layeredPane.add(btnsub);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Str1=textField_8.getText();
				textField_8.setText("");
				Str2=btnadd.getText();
				
			}
		});
		btnadd.setBounds(180, 70, 43, 23);
		layeredPane.add(btnadd);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(10, 11, 213, 48);
		layeredPane.add(textField_8);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("Receipt", null, layeredPane_1, null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 0, 235, 242);
		layeredPane_1.add(panel_7);
		panel_7.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 10, 215, 222);
		panel_7.add(textArea);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBounds(30, 522, 1021, 56);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String strburgger=txt1.getText();
				 a=Integer.parseInt(strburgger);
				
				String strburggermeal=txt2.getText();
				 b=Integer.parseInt(strburggermeal);
				
				String strcheeseburgger=txt3.getText();
				 c=Integer.parseInt(strcheeseburgger);
				
				String strqty=txt4.getText();
				int d=Integer.parseInt(strqty);
				
				String strdrink=(String)comboBox.getSelectedItem();
				
				if(strdrink.equals("cola")) {
					
				
					int drinktotal=(45*d);
					String drinktot=String.valueOf(drinktotal);
					int total=(a*30)+(b*40)+(c*50)+drinktotal;
					int tx=(total*7)/100;
					String t=String.valueOf(tx);
					int subtot=total+40;
					int ttot=tx+subtot;
					txt11.setText(String.valueOf(ttot));
					txt10.setText(String.valueOf(ttot));
					
					txt9.setText(String.valueOf(subtot));
					
					txt8.setText(t);
					
					txt5.setText(drinktot);
				}
				else if(strdrink.equals("pepsi")) {
					int drinktotal=(45*d);
					
					String drinktot=String.valueOf(drinktotal);
					str4=drinktot;
					int total=(a*30)+(b*40)+(c*50)+drinktotal;
					int tx=(total*7)/100;
					String t=String.valueOf(tx);
					int subtot=total+40;
					int ttot=tx+subtot;
					txt11.setText(String.valueOf(ttot));
					txt10.setText(String.valueOf(ttot));
					
					txt9.setText(String.valueOf(subtot));
					
					txt8.setText(t);
					txt5.setText(drinktot);
				}
				else {
					int total=(a*30)+(b*40)+(c*50);
					int tx=(total*7)/100;
					String t=String.valueOf(tx);
					String mealtot=String.valueOf(total);
					int subtot=total+40;
					int ttot=tx+subtot;
					txt10.setText(String.valueOf(ttot));
					txt6.setText(mealtot);
					txt11.setText(String.valueOf(ttot));
				}
				
				if(rdbtnNewRadioButton.isSelected()) {
					int total=(a*30)+(b*40)+(c*50)+40;
				}
				else if(rdbtnTax.isSelected()) {
					int total=(a*30)+(b*40)+(c*50)+80;
				}
				str1=String.valueOf(a*30);
				str2=String.valueOf(a*40);
				str3=String.valueOf(a*50);
				
				String strdeliv=rdbtnNewRadioButton.getText();
				String strtax=rdbtnTax.getText();
				txt7.setText("40");
				int total=(a*30)+(b*40)+(c*50);
				int subtot=total+40;
				int tx=(total*7)/100;
				int ttot=tx+subtot;
				String mealtot=String.valueOf(total);
				txt6.setText(mealtot);
				String t=String.valueOf(tx);
				
				txt10.setText(String.valueOf(ttot));
				
				txt9.setText(String.valueOf(subtot));
				
				txt8.setText(t);
				
				txt11.setText(String.valueOf(ttot));
				
				//if()
				
			}
		});
		btnNewButton.setBounds(35, 11, 89, 23);
		panel_5.add(btnNewButton);
		
		JButton btnReceive = new JButton("Receipt");
		btnReceive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.append("Item \t\t Qty \t Total \n\n"
						
						
						+"CK Burger \t"+txt1.getText()+" \t"+str1+"\n"
						+"CK Burger Meal \t"+txt1.getText()+" \t"+str2+"\n"
						+"CK CheeseBurger \t"+txt1.getText()+" \t"+str2+"\n"
						+"CK CheeseBurger \t"+txt1.getText()+" \t"+str2+"\n"
						+(String)comboBox.getSelectedItem()+" \t"+txt4.getText()+" \t"+str4+"\n"
						+"\n"
						+"================================="+"\n"
						+" \t \tTax "+txt8.getText()+"\n"
						+" \t \tTotal "+txt10.getText()+"\n"
						);
				
				
			}
		});
		btnReceive.setBounds(241, 11, 89, 23);
		panel_5.add(btnReceive);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt1.setText("0");
				txt2.setText("0");
				txt3.setText("0");
				txt4.setText("0");
				txt5.setText("");
				txt6.setText("");
				txt7.setText("");
				txt8.setText("");
				txt9.setText("");
				txt10.setText("");
			}
		});
		btnReset.setBounds(442, 11, 89, 23);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(653, 11, 89, 23);
		panel_5.add(btnExit);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(30, 52, 1021, 65);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblHotelManagementSystem = new JLabel("Hotel Management System");
		lblHotelManagementSystem.setBackground(Color.WHITE);
		lblHotelManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblHotelManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelManagementSystem.setBounds(0, 11, 1021, 54);
		panel_6.add(lblHotelManagementSystem);
	}
}
