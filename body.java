import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

public class body {

	private JFrame frame;
	private JPanel panel_2;
	private JTable table_1;
	private JLabel lblNewLabel_1;
	private JLabel lblWeight;
	private JLabel lblBmi;
	private JButton btnCalculate;
	private JButton btnClear;
	private JButton btnExit;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					body window = new body();
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
	public body() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 479, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(0, 0, 456, 88);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Body Mass Index");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(99, 34, 253, 28);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setForeground(Color.GREEN);
		panel_1.setBounds(0, 92, 456, 300);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Hight(m):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(34, 44, 64, 29);
		panel_1.add(lblNewLabel_1);
		
		lblWeight = new JLabel("Weight(Kg)");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWeight.setBounds(34, 98, 75, 20);
		panel_1.add(lblWeight);
		
		lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBmi.setBounds(35, 138, 46, 14);
		panel_1.add(lblBmi);
		
		btnCalculate = new JButton("calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a=Float.parseFloat(textField.getText());
				float b=Float.parseFloat(textField_1.getText());
				float bmi=b/(a*a);
				String r;
				
				if(bmi<=18.5f)
				{
				r="Under Weight";	
				}
				else if(bmi>18.5f && bmi<=25f)
				{
					r="Normal Weight";	
				}
				else if(bmi>=25f && bmi<=30f)
				{
					r="Over Weight";	
				}
				else
				{
					r="Obese";	
				}
				String t=String.valueOf(bmi);
				textField_2.setText(t);
				lblNewLabel_2.setText(r);
			}
			
		});
		btnCalculate.setBounds(68, 181, 89, 23);
		panel_1.add(btnCalculate);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 textField_2.setText("");
			 textField_1.setText("");
			 textField.setText("");
			 lblNewLabel_2.setText("");
			}
		});
		btnClear.setBounds(198, 181, 89, 23);
		panel_1.add(btnClear);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(315, 181, 89, 23);
		panel_1.add(btnExit);
		
		textField = new JTextField();
		textField.setBounds(148, 48, 119, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 98, 119, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 135, 119, 20);
		panel_1.add(textField_2);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(328, 132, 89, 20);
		panel_1.add(lblNewLabel_2);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(0, 396, 456, 104);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBackground(Color.WHITE);
		table_1.setFont(new Font("Aharoni", table_1.getFont().getStyle(), table_1.getFont().getSize()));
		table_1.setForeground(Color.DARK_GRAY);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"UnderWeight", "NormalWeight", "OverWeight", " Obese"},
				{"<18.5", " 18.5 to 24.9", "   25  to 29.9", "        >30"},
			},
			new String[] {
				"UnderWeight", "OverWeight", "NormalWeight", "Obese"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		table_1.setBounds(10, 61, 436, 32);
		panel_2.add(table_1);
		
		table = new JTable();
		table.setBounds(360, 91, -360, -25);
		panel_2.add(table);
	}
}