package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClickerRunner {
public static void main(String[] args) {
	
	ThatChuckleClicker c=new ThatChuckleClicker();
	c.makeButtons();


	JFrame f=new JFrame();
	
	JPanel p = new JPanel();
	
	f.add(p);

	JButton b = new JButton("Joke");
	
	JButton Button = new JButton("Punchline");

	p.add(b);
	
	p.add(Button);

	f.setVisible(true);
	
	f.pack();








}
}
