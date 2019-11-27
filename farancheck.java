import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;

public class farancheck {
	
	
   public String str1="";
    String str3="";
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					farancheck window = new farancheck();
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
	public farancheck() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(65, 23, 81, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(138, 23, 150, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Input Scale");
		lblNewLabel_1.setBounds(10, 91, 69, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblOutputScale = new JLabel("Output Scale");
		lblOutputScale.setBounds(338, 91, 69, 23);
		frame.getContentPane().add(lblOutputScale);
		
		ButtonGroup G1=new ButtonGroup();
		ButtonGroup G2=new ButtonGroup();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Celcius");
		rdbtnNewRadioButton.setBounds(10, 139, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFah = new JRadioButton("Fahrenheit");
		rdbtnFah.setBounds(10, 169, 109, 23);
		frame.getContentPane().add(rdbtnFah);
		
		JRadioButton rdbtnKelvin = new JRadioButton("Kelvin");
		rdbtnKelvin.setBounds(10, 198, 109, 23);
		frame.getContentPane().add(rdbtnKelvin);
		
		JRadioButton radioButton_2 = new JRadioButton("Celcius");
		radioButton_2.setBounds(298, 139, 109, 23);
		frame.getContentPane().add(radioButton_2);
		
		JRadioButton rdbtnFahrenheit = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit.setBounds(298, 169, 109, 23);
		frame.getContentPane().add(rdbtnFahrenheit);
		
		JRadioButton rdbtnKelvin_1 = new JRadioButton("Kelvin");
		rdbtnKelvin_1.setBounds(298, 198, 109, 23);
		frame.getContentPane().add(rdbtnKelvin_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(156, 228, 87, 18);
		frame.getContentPane().add(lblNewLabel_3);
		
		G1.add(rdbtnNewRadioButton);
		G1.add(rdbtnFah);
		G1.add(rdbtnKelvin);
		G2.add(radioButton_2);
		G2.add(rdbtnFahrenheit);
		G2.add(rdbtnKelvin_1);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(331, 50, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
					  
					 G2.clearSelection(); 
	             
			
			}

			});
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a,r;
				 if (rdbtnNewRadioButton.isSelected()) { 
					  
					 lblNewLabel_3.setText(textField.getText());   
	             }
				 else if(rdbtnFah.isSelected()) {
					  a=Float.parseFloat(textField.getText());
					   r=(a-32)*5/9;
					 lblNewLabel_3.setText(String.valueOf(r));
				 }
			    else if(rdbtnKelvin.isSelected()) {
						  a=Float.parseFloat(textField.getText());
						 r=a-273.15f;
						 lblNewLabel_3.setText(String.valueOf(r));
					 
				 }
				
		        
				 
			}
			 

			});
		
		rdbtnFah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				G2.clearSelection();
			}

			});
		rdbtnFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float a,r;
				 if (rdbtnFah.isSelected()) { 
					  
					 lblNewLabel_3.setText(textField.getText());   
	             }
				 else if(rdbtnNewRadioButton.isSelected()) {
					  a=Float.parseFloat(textField.getText());
					   r=a*9/5+32;
					 lblNewLabel_3.setText(String.valueOf(r));
				 }
			    else if(rdbtnKelvin.isSelected()) {
						  a=Float.parseFloat(textField.getText());
						 r=(a-273.15f) * 9/5 + 32;
						 lblNewLabel_3.setText(String.valueOf(r));
					 
				 }
			}

			});
		rdbtnKelvin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				G2.clearSelection();
			}

			});
		
		rdbtnKelvin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float a,r;
				 if (rdbtnKelvin.isSelected()) { 
					  
					 lblNewLabel_3.setText(textField.getText());   
	             }
				 else if(rdbtnFah.isSelected()) {
					  a=Float.parseFloat(textField.getText());
					  r=(a-32)*5/9+273.15f;
					 lblNewLabel_3.setText(String.valueOf(r));
				 }
			    else if(rdbtnNewRadioButton.isSelected()) {
						  a=Float.parseFloat(textField.getText());
						 r=a+273.15f;
						 lblNewLabel_3.setText(String.valueOf(r));
					 
				 }
				
			}

			});
	
		
		
		JLabel lblNewLabel_2 = new JLabel("Output");
		lblNewLabel_2.setBounds(85, 228, 61, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		
	}
}