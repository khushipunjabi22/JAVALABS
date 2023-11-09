import javax.swing.*;
import java.awt.event.*;
public class menu implements ActionListener
{
JFrame f;
JMenuBar mb;
JMenu file,edit,view;
JMenuItem cut,copy,paste,selectAll,New,Open,Save,next,text,previous;
 JTextArea ta;
menu()
{
 f = new JFrame("Menu and its Items");
 mb = new JMenuBar();
f.setJMenuBar(mb);
f.add(mb);
file = new JMenu("File");
edit = new JMenu("Edit");
view = new JMenu("View");
mb.add(file);
mb.add(edit);
mb.add(view);
New = new JMenuItem("New");
Open = new JMenuItem("Open");
Save = new JMenuItem("Save");
file.add(New);
file.add(Open);
file.add(Save);
cut = new JMenuItem("cut");
copy = new JMenuItem("copy");
paste = new JMenuItem("paste");
selectAll = new JMenuItem("SelectAll");
edit.add(cut);
edit.add(copy);
edit.add(paste);
edit.add(selectAll);
next = new JMenuItem("next");
text = new JMenuItem("text");
previous = new JMenuItem("previous");
view.add(next);
view.add(text);
view.add(previous);
New.addActionListener(this);
Open.addActionListener(this);
Save.addActionListener(this);
cut.addActionListener(this);
copy.addActionListener(this);
paste.addActionListener(this);
selectAll.addActionListener(this);
next.addActionListener(this);
text.addActionListener(this);
previous.addActionListener(this);
ta = new JTextArea();
ta.setBounds(20,20,360,320);
f.add(ta);
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed (ActionEvent e){
if(e.getSource()==cut)
ta.cut();
if(e.getSource()==copy)
ta.copy();
if(e.getSource()==paste)
ta.paste();
if(e.getSource()==selectAll)
ta.selectAll();
}
public static void main(String[]args)
{
new menu();
}
}
