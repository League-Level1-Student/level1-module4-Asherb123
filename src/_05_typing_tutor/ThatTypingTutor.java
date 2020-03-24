package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ThatTypingTutor implements KeyListener {


	
	
void currentLetter() {
	
	JFrame frame=new JFrame();
	frame.setName("Typing Game!");
	
	
	
	frame.add(panel);
	
	
	
	panel.add(label);
	
	
	frame.setVisible(true);
	
	
	
	
currentLetter = generateRandomLetter();
	
	label.setText(""+currentLetter);
	
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.pack();

	frame.addKeyListener(this);

	
	
	
	
	
	

}
JPanel panel=new JPanel();
JLabel label=new JLabel();
char currentLetter;
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');

}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub

	
	if (e.getKeyChar() == currentLetter) {
		currentLetter=generateRandomLetter();
		JOptionPane.showMessageDialog(null, "Correct");
		label.setText(""+currentLetter);
	panel.setBackground(Color.GREEN);
	}
	else {
		JOptionPane.showMessageDialog(null, "YOU suck more then the creator of this game.");
	panel.setBackground(Color.RED);
	}
	
	
	
	
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
	
	
	


}
}
