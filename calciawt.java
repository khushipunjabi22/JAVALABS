import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
Frame f=new Frame();
Label l1=new Label("First Number ");
Label l2=new Label("Second Number ");
Label l3=new Label("Output");
 TextField t1=new TextField();
 TextField t2=new TextField();
 TextField t3=new TextField();
 Button b1=new Button("+");
 Button b2=new Button("-");
 Button b3=new Button("*");
 Button b4=new Button("/");
 Button b5=new Button("Cancel");
 Calculator()
 {
 l1.setBounds(100,50,150,30);
 l2.setBounds(100,90,150,30);
 l3.setBounds(100,130,150,30);
t1.setBounds(300,50,150,30);
 t2.setBounds(300,90,150,30);
 t3.setBounds(300,130,150,30);
b1.setBounds(200,200,60,30);
b2.setBounds(200,230,60,30);
b3.setBounds(260,200,60,30);
b4.setBounds(260,230,60,30);
b5.setBounds(200,260,120,60);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
 f.setLayout(null);
 f.setVisible(true);
 f.setSize(500,500);
 }
 public void actionPerformed(ActionEvent e)
 {
 int n1=Integer.parseInt(t1.getText());
 int n2=Integer.parseInt(t2.getText());

 if(e.getSource()==b1)
 {
 t3.setText(String.valueOf(n1+n2));
 }
 if(e.getSource()==b2)
 {
 t3.setText(String.valueOf(n1-n2));
 }
 if(e.getSource()==b3)
 {
 t3.setText(String.valueOf(n1*n2));
 }
 if(e.getSource()==b4)
 {
 t3.setText(String.valueOf(n1/n2));
 }
 if(e.getSource()==b5)
 {
 System.exit(0);
 }
}
public static void main(String args[])
{
new Calculator();
}
}
