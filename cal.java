import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class cal {

public String Str1,Str2,Str3;
public int f=0;
private JFrame frame;
private JTextField TF;
private JButton sqrt;
private JButton btnNewButton_1;
private JButton btnNewButton_2;
private JButton bt7;
private JButton bt8;
private JButton bt9;
private JButton div;
private JButton mul;
private JButton sub;
private JButton add;
private JButton eq;
private JButton bt3;
private JButton bt6;
private JButton bt5;
private JButton bt4;
private JButton bt1;
private JButton bt2;
private JButton dot;
private JButton bt0;
private JButton mod;
private JButton btxy;
private JButton btnX;
private JButton btnN;
private JButton btnSec;
private JButton btnLn;
private JButton btnExp;
private JButton btnCos;
private JButton btnTan;
private JLabel lblEdit;
private JLabel lblView;
private JButton btnClear;
private JButton btnNewButton;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
cal window = new cal();
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
public cal() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
//frame.getContentPane().setBackground(Color.DARK_GRAY);
frame.setBounds(0, 11, 647, 404);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
TF = new JTextField();
TF.setBounds(20, 22, 597, 47);
frame.getContentPane().add(TF);
TF.setColumns(10);
sqrt = new JButton("Sqrt");
sqrt.setFont(new Font("Traditional Arabic", Font.PLAIN, 11));
sqrt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
double res1=Float.parseFloat(Str1);
double re=Math.sqrt(res1);
String str=String.valueOf(re);
TF.setText(str);
f=1;
}
});
sqrt.setBounds(10, 100, 77, 47);
frame.getContentPane().add(sqrt);

btnNewButton_1 = new JButton("1/X");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
double res1=Float.parseFloat(Str1);
double re=1/res1;
String str=String.valueOf(re);
TF.setText(str);
f=1;
}
});
btnNewButton_1.setBounds(109, 100, 77, 47);
frame.getContentPane().add(btnNewButton_1);

btnNewButton_2 = new JButton("Sin");
btnNewButton_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float po=Float.parseFloat(TF.getText());
double r=Math.sin(po);
String str=String.valueOf(r);
TF.setText(str);
f=1;
}
});
btnNewButton_2.setBounds(208, 100, 72, 47);
frame.getContentPane().add(btnNewButton_2);

bt7 = new JButton("7");
bt7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt7.getText()));
}
});
bt7.setBounds(332, 121, 42, 37);
frame.getContentPane().add(bt7);

bt8 = new JButton("8");
bt8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt8.getText()));
}
});
bt8.setBounds(399, 121, 42, 37);
frame.getContentPane().add(bt8);

bt9 = new JButton("9");
bt9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt9.getText()));
}
});
bt9.setBounds(460, 121, 42, 37);
frame.getContentPane().add(bt9);

div = new JButton("/");
div.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=div.getText();
}
});
div.setBounds(523, 121, 42, 37);
frame.getContentPane().add(div);

mul = new JButton("*");
mul.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=mul.getText();
}
});
mul.setBounds(523, 184, 42, 42);
frame.getContentPane().add(mul);

sub = new JButton("-");
sub.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=sub.getText();
}
});
sub.setBounds(523, 254, 42, 37);
frame.getContentPane().add(sub);

add = new JButton("+");
add.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=add.getText();
}
});
add.setBounds(523, 315, 42, 37);
frame.getContentPane().add(add);

eq = new JButton("=");
eq.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float res1,res;
float res2=Float.parseFloat(TF.getText());
f=1;
if(Str2.equals("+"))
{
res1=Float.parseFloat(Str1);
res=res1+res2;
String str=String.valueOf(res);
TF.setText(str);

}
else if(Str2.equals("-"))
{
res1=Float.parseFloat(Str1);
res=res1-res2;
String str=String.valueOf(res);
TF.setText(str);

}
else if(Str2.equals("*"))
{
res1=Float.parseFloat(Str1);
res=res1*res2;
String str=String.valueOf(res);
TF.setText(str);

}
else if(Str2.equals("/"))
{
res1=Float.parseFloat(Str1);
res=res1/res2;
String str=String.valueOf(res);
TF.setText(str);

}
else if(Str2.equals("%"))
{
res1=Float.parseFloat(Str1);
res=res1%res2;
String str=String.valueOf(res);
TF.setText(str);

}
else if(Str2.equals("X^Y"))
{
res1=Integer.parseInt(Str1);
System.out.print(res1);
res2=Integer.parseInt(TF.getText());
float po=1;
for(int i=1;i<=res2;i++)
{
po=po*res1;
}
String str=String.valueOf(po);
TF.setText(str);;
}

Str1=null;
Str2=null;
Str3=null;
}
});
eq.setBounds(460, 315, 42, 37);
frame.getContentPane().add(eq);

bt3 = new JButton("3");
bt3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt3.getText()));
}
});
bt3.setBounds(460, 254, 42, 37);
frame.getContentPane().add(bt3);

bt6 = new JButton("6");
bt6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt6.getText()));
}
});
bt6.setBounds(460, 189, 42, 37);
frame.getContentPane().add(bt6);

bt5 = new JButton("5");
bt5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt5.getText()));
}
});
bt5.setBounds(399, 189, 42, 37);
frame.getContentPane().add(bt5);

bt4 = new JButton("4");
bt4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}

TF.setText(TF.getText().concat(bt4.getText()));
}
});
bt4.setBounds(332, 189, 42, 37);
frame.getContentPane().add(bt4);

bt1 = new JButton("1");
bt1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
if(f==1)
{
TF.setText("");
f=0;
}

TF.setText(TF.getText().concat(bt1.getText()));

}
});
bt1.setBounds(332, 254, 42, 37);
frame.getContentPane().add(bt1);

bt2 = new JButton("2");
bt2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}

TF.setText(TF.getText().concat(bt2.getText()));
}
});
bt2.setBounds(399, 254, 42, 37);
frame.getContentPane().add(bt2);

dot = new JButton(".");
dot.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(dot.getText()));
}
});
dot.setBounds(399, 315, 42, 37);
frame.getContentPane().add(dot);

bt0 = new JButton("0");
bt0.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt0.getText()));
}
});
bt0.setBounds(332, 315, 42, 37);
frame.getContentPane().add(bt0);

mod = new JButton("%");
mod.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=mod.getText();
}
});
mod.setBounds(10, 172, 77, 47);
frame.getContentPane().add(mod);

btxy = new JButton("X^Y");
btxy.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=btxy.getText();
f=1;
}
});
btxy.setBounds(10, 242, 77, 47);
frame.getContentPane().add(btxy);

btnX = new JButton("X^2");
btnX.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
float n=Integer.parseInt(TF.getText());
float ff=n*n;
f=1;
String str=String.valueOf(ff);
TF.setText(str);
f=1;
}
});
btnX.setBounds(10, 312, 77, 43);
frame.getContentPane().add(btnX);

btnN = new JButton("n!");
btnN.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
int n=Integer.parseInt(TF.getText());
int ff=1;
for(int i=1;i<=n;i++)
{
ff=ff*i;
f=1;
}
String str=String.valueOf(ff);
TF.setText(str);
f=1;

}
});
btnN.setBounds(109, 312, 77, 43);
frame.getContentPane().add(btnN);

btnSec = new JButton("Sec");
btnSec.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float po=Float.parseFloat(TF.getText());
double r=Math.cos(po);
double rr=1/r;
String str=String.valueOf(rr);
TF.setText(str);
}
});
btnSec.setBounds(208, 312, 77, 43);
frame.getContentPane().add(btnSec);

btnLn = new JButton("ln");
btnLn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float po=Float.parseFloat(TF.getText());
double r=Math.log(po);
String str=String.valueOf(r);
TF.setText(str);
f=1;
}
});
btnLn.setBounds(109, 241, 77, 48);
frame.getContentPane().add(btnLn);

btnExp = new JButton("Exp");
btnExp.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double ev = 2.718281828;
double po=1;
int n=Integer.parseInt(TF.getText());
for(int i=1;i<=n;i++)
{
po=po*ev;
}
String str=String.valueOf(po);
TF.setText(str);;
}
});
btnExp.setBounds(109, 172, 77, 48);
frame.getContentPane().add(btnExp);

btnCos = new JButton("Cos");
btnCos.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float po=Float.parseFloat(TF.getText());
double r=Math.cos(po);
String str=String.valueOf(r);
TF.setText(str);
f=1;
}
});
btnCos.setBounds(208, 172, 77, 47);
frame.getContentPane().add(btnCos);

btnTan = new JButton("Tan");
btnTan.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float po=Float.parseFloat(TF.getText());
double r=Math.tan(po);
String str=String.valueOf(r);
TF.setText(str);
f=1;
}
});
btnTan.setBounds(208, 242, 77, 47);
frame.getContentPane().add(btnTan);

JLabel lblFile = new JLabel("File");
lblFile.setBounds(10, 11, 46, 14);
frame.getContentPane().add(lblFile);

lblEdit = new JLabel("Edit");
lblEdit.setBounds(66, 11, 46, 14);
frame.getContentPane().add(lblEdit);

lblView = new JLabel("View");
lblView.setBounds(118, 11, 46, 14);
frame.getContentPane().add(lblView);
btnClear = new JButton("CLEAR");
btnClear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

TF.setText("");

}
});
btnClear.setBounds(476, 80, 89, 29);
frame.getContentPane().add(btnClear);
}
}  