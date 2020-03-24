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
	
if (event.getsource) {
	
}
	
	
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}






















}
