package Birthday;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ThisBirthday implements MouseListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Click ME!");
	
	
	void Birthday() {
		
		frame.add(panel);
		panel.add(button);
		
		button.addMouseListener(this);
		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



//String s = "https://www.youtube.com/watch?v=UtmxG9G7gLA&t=2s";
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			
			Song song = new Song("Birthday.mp3");
			song.play();
			
			
			JOptionPane.showMessageDialog(null, "Happy Birthday dad");
			JOptionPane.showMessageDialog(null, "You are OLD");
			
			
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
