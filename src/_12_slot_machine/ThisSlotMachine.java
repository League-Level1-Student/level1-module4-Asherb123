package _12_slot_machine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThisSlotMachine implements MouseListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Spin!");
	JLabel one = new JLabel();
	JLabel two= new JLabel();
	JLabel three = new JLabel();
	
	String hotDog = "HOT .jpg";
	String bannana = "BANNANA.jpg";
	String corona = "Corona.jpg";
	
	void slots() {
		frame.add(panel);
		labelImage();
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(button);
		
		
		button.addMouseListener(this);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
	}
	
	void random() {
		Random rand = new Random();
		rand.nextInt(3);

	
	}	
	
	void labelImage() {
			
		
		try {
			
			three=createLabelImage(corona);
			one=createLabelImage(bannana);
			two=createLabelImage(hotDog);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
			
			
		}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	
}
