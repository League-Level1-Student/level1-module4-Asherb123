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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ThisSlotMachine implements MouseListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Spin!");
	JLabel one = new JLabel();
	JLabel two = new JLabel();
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

	Random rand = new Random();

	boolean labelImage() {
		int a = rand.nextInt(3);
		int b = rand.nextInt(3);
		int c = rand.nextInt(3);
		try {

			if (a == 0) {
				three = createLabelImage(corona);
			} else if (a == 1) {
				three = createLabelImage(bannana);
			} else if (a == 2) {
				three = createLabelImage(hotDog);
			}
			a = rand.nextInt(3);
			if (b == 0) {
				two = createLabelImage(corona);
			} else if (b == 1) {
				two = createLabelImage(bannana);
			} else if (b == 2) {
				two = createLabelImage(hotDog);
			}

			a = rand.nextInt(3);
			if (c == 0) {
				one = createLabelImage(corona);
			} else if (c == 1) {
				one = createLabelImage(bannana);
			} else if (c == 2) {
				one = createLabelImage(hotDog);
			}

			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
if (a == b && b == c) {
				return true;
			} else {
				return false;
			}
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		boolean t = false;
		
		
		if (e.getSource()== button) {
			frame.remove(panel);
		panel=new JPanel();
			
			t = labelImage();	
			
			panel.add(one);
			panel.add(two);
			panel.add(three);
			panel.add(button);
			frame.add(panel);
			frame.pack();
		if (t) {
			JOptionPane.showMessageDialog(null, "Holy moley you are moist");
		}
		
		
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

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

}
