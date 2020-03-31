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
JLabel answer=new JLabel("0");
JButton a = new JButton("Add");
JButton b = new JButton("Subtract");
JButton c = new JButton("Multiply");
JButton d = new JButton("Divide");




JTextField one = new JTextField(10);
JTextField two = new JTextField(10);
	void startCalculator() {


frame.add(panel);
frame.setName("Calculator");





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
	
int add(int firstNum, int secondNum) {
	return firstNum+secondNum;
	
}

int subtract(int firstNum, int secondNum) {
	
	return firstNum-secondNum;
	
}

int divide(int firstNum, int secondNum) {
	
	return firstNum/secondNum;
	
}

int multiply(int firstNum, int secondNum) {
	
	return firstNum*secondNum;
	
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
	int result=0;
	if (e.getSource()== a) {

result = add(firstNum, secondNum);

}	

if (e.getSource()==b) {
result= subtract(firstNum, secondNum);
}	
if (e.getSource()==c) {
	result= multiply(firstNum, secondNum);
}
if (e.getSource()==d) {
		result = divide(firstNum, secondNum);
	}
answer.setText(""+result);
frame.pack();
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
