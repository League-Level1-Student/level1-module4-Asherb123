package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThisWackAMole implements MouseListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mole = new JButton("Mole!");
	
	void WackMole() {
		frame.add(panel);
		makeButtons();
		panel.add(label);
		panel.setPreferredSize(new Dimension(450, 200));
		
	
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.pack();
	}
	
	void makeButtons() {
		Random rand = new Random();
		int m = rand.nextInt(24);
		for (int i = 0; i <24; i++) {
			if (i==m) {
				mole.addMouseListener(this);
				panel.add(mole);
			}
			else {
				JButton b = new JButton();
				b.addMouseListener(this);
				panel.add(b);
			}
		}
	}
void reset() {
	frame.remove(panel);
	mole.removeMouseListener(this);
	panel = new JPanel();
	makeButtons();
	
	panel.add(label);
	frame.add(panel);

panel.setPreferredSize(new Dimension(450, 200));
frame.pack();

}
	
		int points=0;
	JLabel label = new JLabel(""+points);

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==mole) {
			speak("you are a sexy beast");
		}
		else {
			speak("You frigging suck!");
		}
	if (e.getSource()==mole) {
		points=points+1;
	}
	else {
		points=points-1;
	}
	label.setText(""+points);
	reset();
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
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
}
