import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ThisRiddle implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JButton check = new JButton("Check!");
	JButton hint = new JButton("Hint");

	JLabel riddle = new JLabel("If a guy has a Dr. Pepper, and he drinks it, does he still have something to drink?");
	JTextField answer = new JTextField(10);

	void Riddles() {
		frame.add(panel);
		panel.add(riddle);
		panel.add(answer);
		panel.add(hint);
		panel.add(check);

		hint.addMouseListener(this);
		check.addMouseListener(this);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String i = answer.getText();

		if (e.getSource() == hint) {
			JOptionPane.showMessageDialog(null, "Come on dude. You don't need  hint.");
		}
		if (e.getSource() == check && i.equals("no")) {

			JOptionPane.showMessageDialog(null, "Holy creeper. You are a master.");

		}

		else {
			JOptionPane.showMessageDialog(null, "Look at this duuuude");

		}
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

}
