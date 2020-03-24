package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ThatChuckleClicker implements ActionListener {
JButton b = new JButton("Joke");
	
	JButton Button = new JButton("Punchline");

	void makeButtons() {
		
	JOptionPane.showMessageDialog(null, "Make Buttons!");
		
JFrame f=new JFrame();
	
	JPanel p = new JPanel();
	
	f.add(p);

	
	p.add(b);
	
	p.add(Button);

	f.setVisible(true);
	
	f.pack();


b.addActionListener(this);
Button.addActionListener(this);
	

	
	
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == Button) {
			JOptionPane.showMessageDialog(null, "Hey there, dude");
			JOptionPane.showMessageDialog(null, "People say everything happens for a reason... so when I punch you in the face, remember I have a reason!");
			
		}
			
		if(e.getSource() == b) {
			JOptionPane.showMessageDialog(null, "Hey there, dude");
			JOptionPane.showMessageDialog(null, "What do you call a pig that does Karate?   A PORK CHOP!");
		
		}
	
	
	}






















}
