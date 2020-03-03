   package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class NastySurprize implements ActionListener {
JFrame f = new JFrame();
JPanel p = new JPanel();
JButton b = new JButton("Trick");
JButton u = new JButton("Treat");
	void show() {
	b.addActionListener(this);
	u.addActionListener(this);
		f.setVisible(true);
		f.add(p);
       p.add(b);
       p.add(u);
f.pack();
	
	 {
		
	}
	
	
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==u) {
			showPictureFromTheInternet("https://i.pinimg.com/236x/76/97/a0/7697a0b6872b4d965225c2de2d6e0919--demotivational-posters-funny-photos.jpg");
		}
		
		if (e.getSource()==b) {
			showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTXFbUhBlQ10hp_uHrp5cuFvMJfQVCPxfhmVjp-c27J0r2wvHIC");
		}
	
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	

	
}
