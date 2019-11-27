import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
public class proreport {
JFrame frame;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;
private JTextField textField_8;
private JTextField textField_9;
private JTextField textField_10;
private JTextField textField_11;
private JTextField textField_12;
private JTextField textField_13;
private JTextField textField_14;
private JTextField textField_15;
private JTextField textField_16;
private JTextField textField_17;
private JLabel lblFirstname;
private JTextField textField_18;
private JLabel lblSurname;
private JTextField textField_19;
private JLabel lblCourseCode;
private JLabel lblTotalScore;
private JTextField textField_22;
private JLabel lblAverage;
private JTextField textField_23;
private JLabel lblRanking;
private JTextField textField_24;
private JLabel lblMaths;
private JTextField textField_25;
private JLabel lblEnglish;
private JTextField textField_26;
private JLabel lblBiology;
private JTextField textField_27;
private JLabel lblComputer;
private JTextField textField_28;
private JLabel lblChemistry;
private JTextField textField_29;
private JLabel lblPhysics;
private JTextField textField_30;
private JLabel lblTamil;
private JTextField textField_31;
private JLabel lblMalayalam;
private JTextField textField_32;
private JComboBox comboBox;
private JTable table;
private JButton btnClear;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
proreport window = new proreport();
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
public proreport() {
initialize();
}
/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame("Student Report");
frame.getContentPane().setBackground(Color.DARK_GRAY);
frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
frame.setBounds(0, 0, 1350, 800);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
JPanel panel = new JPanel();
panel.setBackground(Color.RED);
panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
panel.setBounds(12, 0, 572, 417);
frame.getContentPane().add(panel);
panel.setLayout(null);
JLabel lblNewLabel = new JLabel("Student_ID");
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
lblNewLabel.setBounds(12, 31, 118, 39);
panel.add(lblNewLabel);
textField = new JTextField();
textField.setFont(new Font("Tahoma", Font.BOLD, 14));
textField.setBounds(142, 34, 116, 38);
panel.add(textField);
textField.setColumns(10);
lblFirstname = new JLabel("Firstname");
lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 20));
lblFirstname.setBounds(12, 79, 109, 39);
panel.add(lblFirstname);
textField_18 = new JTextField();
textField_18.setFont(new Font("Tahoma", Font.BOLD, 14));
textField_18.setColumns(10);
textField_18.setBounds(142, 82, 116, 38);
panel.add(textField_18);
lblSurname = new JLabel("Surname");
lblSurname.setFont(new Font("Tahoma", Font.BOLD, 20));
lblSurname.setBounds(12, 127, 109, 39);
panel.add(lblSurname);
textField_19 = new JTextField();
textField_19.setFont(new Font("Tahoma", Font.BOLD, 13));
textField_19.setColumns(10);
textField_19.setBounds(142, 130, 116, 38);
panel.add(textField_19);
lblCourseCode = new JLabel("Course Code");
lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 20));
lblCourseCode.setBounds(12, 175, 125, 39);
panel.add(lblCourseCode);
lblTotalScore = new JLabel("Total Score");
lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 20));
lblTotalScore.setBounds(12, 267, 118, 39);
panel.add(lblTotalScore);
textField_22 = new JTextField();
textField_22.setFont(new Font("Tahoma", Font.BOLD, 16));
textField_22.setColumns(10);
textField_22.setBounds(142, 270, 116, 38);
panel.add(textField_22);
lblAverage = new JLabel("Average");
lblAverage.setFont(new Font("Tahoma", Font.BOLD, 20));
lblAverage.setBounds(12, 314, 109, 39);
panel.add(lblAverage);
textField_23 = new JTextField();
textField_23.setFont(new Font("Tahoma", Font.BOLD, 16));
textField_23.setColumns(10);
textField_23.setBounds(142, 317, 116, 38);
panel.add(textField_23);
lblRanking = new JLabel("Ranking");
lblRanking.setFont(new Font("Tahoma", Font.BOLD, 20));
lblRanking.setBounds(12, 362, 109, 39);
panel.add(lblRanking);
textField_24 = new JTextField();
textField_24.setFont(new Font("Tahoma", Font.BOLD, 16));
textField_24.setColumns(10);
textField_24.setBounds(142, 365, 116, 38);
panel.add(textField_24);
lblMaths = new JLabel("Maths");
lblMaths.setFont(new Font("Tahoma", Font.BOLD, 20));
lblMaths.setBounds(285, 31, 109, 39);
panel.add(lblMaths);
textField_25 = new JTextField();
textField_25.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_25.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(java.awt.event.KeyEvent evt) {
char num=evt.getKeyChar();
if(!(Character.isDigit(num))
||(num==KeyEvent.VK_BACK_SPACE)
               ||(num==KeyEvent.VK_DELETE)) {
evt.consume();
}
}
});
textField_25.setColumns(10);
textField_25.setBounds(415, 34, 116, 38);
panel.add(textField_25);
lblEnglish = new JLabel("English");
lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 20));
lblEnglish.setBounds(285, 79, 109, 39);
panel.add(lblEnglish);
textField_26 = new JTextField();
textField_26.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_26.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(java.awt.event.KeyEvent evt) {
char num=evt.getKeyChar();
if(!(Character.isDigit(num))
||(num==KeyEvent.VK_BACK_SPACE)
               ||(num==KeyEvent.VK_DELETE)) {
evt.consume();
}
}
});
textField_26.setColumns(10);
textField_26.setBounds(415, 82, 116, 38);
panel.add(textField_26);
lblBiology = new JLabel("Biology");
lblBiology.setFont(new Font("Tahoma", Font.BOLD, 20));
lblBiology.setBounds(285, 127, 109, 39);
panel.add(lblBiology);
textField_27 = new JTextField();
textField_27.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_27.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(java.awt.event.KeyEvent evt) {
char num=evt.getKeyChar();
if(!(Character.isDigit(num))
||(num==KeyEvent.VK_BACK_SPACE)
               ||(num==KeyEvent.VK_DELETE)) {
evt.consume();
}
}
});
textField_27.setColumns(10);
textField_27.setBounds(415, 130, 116, 38);
panel.add(textField_27);
lblComputer = new JLabel("Computer");
lblComputer.setFont(new Font("Tahoma", Font.BOLD, 20));
lblComputer.setBounds(285, 175, 109, 39);
panel.add(lblComputer);
textField_28 = new JTextField();
textField_28.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_28.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(java.awt.event.KeyEvent evt) {
char num=evt.getKeyChar();
if(!(Character.isDigit(num))
||(num==KeyEvent.VK_BACK_SPACE)
               ||(num==KeyEvent.VK_DELETE)) {
evt.consume();
}
}
});
textField_28.setColumns(10);
textField_28.setBounds(415, 178, 116, 38);
panel.add(textField_28);
lblChemistry = new JLabel("Chemistry");
lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 20));
lblChemistry.setBounds(285, 219, 109, 39);
panel.add(lblChemistry);
textField_29 = new JTextField();
textField_29.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_29.setColumns(10);
textField_29.setBounds(415, 222, 116, 38);
panel.add(textField_29);
lblPhysics = new JLabel("Physics");
lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 20));
lblPhysics.setBounds(285, 267, 109, 39);
panel.add(lblPhysics);
textField_30 = new JTextField();
textField_30.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_30.setColumns(10);
textField_30.setBounds(415, 270, 116, 38);
panel.add(textField_30);
lblTamil = new JLabel("Tamil");
lblTamil.setFont(new Font("Tahoma", Font.BOLD, 20));
lblTamil.setBounds(285, 314, 109, 39);
panel.add(lblTamil);
textField_31 = new JTextField();
textField_31.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_31.setColumns(10);
textField_31.setBounds(415, 317, 116, 38);
panel.add(textField_31);
lblMalayalam = new JLabel("Malayalam");
lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 20));
lblMalayalam.setBounds(285, 362, 109, 39);
panel.add(lblMalayalam);
textField_32 = new JTextField();
textField_32.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_32.setColumns(10);
textField_32.setBounds(415, 365, 116, 38);
panel.add(textField_32);
comboBox = new JComboBox();
comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose One....", "111032A", "111032B", "111032C", "111032D", "111032E", "111032F"}));
comboBox.setBounds(142, 175, 116, 39);
panel.add(comboBox);
JSeparator separator = new JSeparator();
separator.setBounds(22, 227, 1, 2);
panel.add(separator);
JSeparator separator_1 = new JSeparator();
separator_1.setBackground(Color.BLACK);
separator_1.setForeground(Color.BLACK);
separator_1.setBounds(9, 246, 249, 8);
panel.add(separator_1);
JPanel panel_1 = new JPanel();
panel_1.setBackground(Color.ORANGE);
panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
panel_1.setBounds(596, 0, 699, 500);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);
JTextArea textArea = new JTextArea();
textArea.setBackground(new Color(255, 250, 240));
textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
textArea.setBounds(12, 24, 675, 430);
panel_1.add(textArea);
btnClear = new JButton("Clear");
btnClear.setForeground(new Color(0, 0, 255));
btnClear.setBackground(new Color(240, 248, 255));
btnClear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
textArea.setText(null);
}
});
btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
btnClear.setBounds(278, 462, 97, 25);
panel_1.add(btnClear);
table = new JTable();
table.setBackground(new Color(211, 211, 211));
table.setFont(new Font("Tahoma", Font.BOLD, 14));
table.setForeground(new Color(0, 0, 0));
table.setBorder(new LineBorder(new Color(60, 179, 113), 2));
table.setModel(new DefaultTableModel(
new Object[][] {
{"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
},
new String[] {
"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"
}
));
table.setBounds(12, 513, 1308, 101);
frame.getContentPane().add(table);
JButton btnAddResult = new JButton("Add Report");
btnAddResult.setForeground(new Color(0, 128, 0));
btnAddResult.setBackground(new Color(240, 248, 255));
btnAddResult.setFont(new Font("Tahoma", Font.BOLD, 14));
btnAddResult.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double[] R=new double[15];
R[0]=Double.parseDouble(textField_25.getText());
R[1]=Double.parseDouble(textField_26.getText());
R[2]=Double.parseDouble(textField_27.getText());
R[3]=Double.parseDouble(textField_28.getText());
R[4]=Double.parseDouble(textField_29.getText());
R[5]=Double.parseDouble(textField_30.getText());
R[6]=Double.parseDouble(textField_31.getText());
R[7]=Double.parseDouble(textField_32.getText());
R[8]=(R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7])/8;
R[9]=R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7];
String avg=String.format("%.2f",R[8]);
textField_23.setText(avg);
   String total=String.format("%.2f",R[9]);
   textField_22.setText(total);
   if(R[9]>=700)
   {
    textField_24.setText("1");
   }
   else if(R[9]>=600)
   {
    textField_24.setText("2");
   }
   else if(R[9]>=500)
   {
    textField_24.setText("3");
   }
   else if(R[9]>=400)
   {
    textField_24.setText("4");
   }
   else if(R[9]>=300)
   {
    textField_24.setText("5");
   }
   else
   {
    textField_24.setText("Fail");
   }
DefaultTableModel model=(DefaultTableModel) table.getModel();
model.addRow(new String[] {
textField.getText(),
(String) comboBox.getSelectedItem(),
textField_25.getText(),
textField_26.getText(),
textField_27.getText(),
textField_28.getText(),
textField_29.getText(),
textField_30.getText(),
textField_31.getText(),
textField_32.getText(),
textField_22.getText(),
textField_23.getText(),
textField_24.getText(),
});
}
});
btnAddResult.setBounds(365, 702, 116, 38);
frame.getContentPane().add(btnAddResult);
JButton btnNewButton = new JButton("Delete");
btnNewButton.setForeground(new Color(255, 0, 0));
btnNewButton.setBackground(new Color(240, 248, 255));
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
DefaultTableModel model=(DefaultTableModel) table.getModel();
if(table.getSelectedRow()==-1)
{
if(table.getRowCount()==0)
{
JOptionPane.showMessageDialog(null, "NO data to Delete",
"Student Result",JOptionPane.OK_OPTION);
}
else {
JOptionPane.showMessageDialog(null, "Select a row to Delete",
"Student Result",JOptionPane.OK_OPTION);
}
}
else {
model.removeRow(table.getSelectedRow());
}
}
});
btnNewButton.setBounds(493, 702, 97, 38);
frame.getContentPane().add(btnNewButton);
JButton btnShowReport = new JButton("Show Report");
btnShowReport.setBackground(new Color(240, 248, 255));
btnShowReport.setFont(new Font("Tahoma", Font.BOLD, 14));
btnShowReport.setForeground(new Color(25, 25, 112));
btnShowReport.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textArea.append("Student Record\n"
+ "Student Name :\t\t"+textField_18.getText()+" "+textField_19.getText()+"\n"
+ "======================================\n"
+ "Math:\t\t" + textField_25.getText()
+ "\nEnglish:\t\t" + textField_26.getText()
+ "\nBiology:\t\t" + textField_27.getText()
+ "\nComputer:\t\t" + textField_28.getText()
+ "\nChemistry:\t\t" + textField_29.getText()
+ "\nPysics:\t\t" + textField_30.getText()
+ "\nTamil:\t\t" + textField_31.getText()
+ "\nMalayalam:\t\t" + textField_32.getText()
+"\n======================================"
+ "\nTotal SCore:\t\t" + textField_22.getText()
+ "\nAverage:\t\t" + textField_23.getText()
+ "\nRanking:\t\t" + textField_24.getText() + "\n"
);
}
});
btnShowReport.setBounds(604, 702, 130, 38);
frame.getContentPane().add(btnShowReport);
JButton btnExit = new JButton("Exit");
btnExit.setForeground(new Color(220, 20, 60));
btnExit.setBackground(new Color(240, 248, 255));
btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
btnExit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
frame =new JFrame("Exit");
if(JOptionPane.showConfirmDialog(frame,"Comfirm","Student Report",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
System.exit(0);
}
}
});
btnExit.setBounds(749, 702, 97, 38);
frame.getContentPane().add(btnExit);
JButton btnReset = new JButton("Reset");
btnReset.setForeground(new Color(128, 0, 128));
btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
btnReset.setBackground(new Color(240, 248, 255));
btnReset.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
JTextField temp=null;
for(java.awt.Component c:panel.getComponents()) {
if(c.getClass().toString().contains("javax.swing.JTextField")) {
temp=(JTextField)c;
temp.setText(null);
}
}
}
});
btnReset.setBounds(871, 702, 97, 38);
frame.getContentPane().add(btnReset);
}
}