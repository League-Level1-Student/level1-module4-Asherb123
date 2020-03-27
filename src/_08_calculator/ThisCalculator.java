package _08_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ThisCalculator implements MouseListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
	JButton a = new JButton("Add");
JButton b = new JButton("Subtract");
JButton c = new JButton("Multiply");
JButton d = new JButton("Divide");




JTextField one = new JTextField(10);
JTextField two = new JTextField(10);
	void startCalculator() {


frame.add(panel);
frame.setName("Calculator");
JLabel answer=new JLabel("0");




panel.add(one);
panel.add(two);
panel.add(a);
panel.add(b);
panel.add(c);
panel.add(d);
panel.add(answer);







frame.setVisible(true);
frame.pack();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
a.addMouseListener(this);
b.addMouseListener(this);
c.addMouseListener(this);
d.addMouseListener(this);

	






}
	
void add() {
	
	
}

void subtract() {
	
	
	
}

void divide() {
	
	
	
}

void multiply() {
	
	
	
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	int firstNum =Integer.parseInt(one.getText());
	int secondNum = Integer.parseInt(two.getText());
if (e.getSource()== a) {
}	

if (e.getSource()==b) {
}	
else if (condition) {
	
}
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}





}
