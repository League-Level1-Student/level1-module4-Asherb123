package _01_nasty_surprise;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprize {
JFrame f = new JFrame();
JPanel p = new JPanel();
JButton b = new JButton("hi");
JButton u = new JButton();
	void show() {
		f.setVisible(true);
		f.add(p);
       p.add(b);
       p.add(u);
f.pack();
	}
	
	
	

	
}
