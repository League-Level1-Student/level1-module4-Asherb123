import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ThisRiddle implements MouseListener {
	JFrame frame= new JFrame();
	JPanel panel = new JPanel();
	
	JButton check = new JButton("Check!");
	JButton hint = new JButton("Hint");
	
	JLabel riddle = new JLabel("If a guy has 3 dollars, and he spends 2 of them, how much dough does he have left?");
	JTextField answer = new JTextField(10);
	
	
	void Riddles() {
		frame.add(panel);
		panel.add(riddle);
		panel.add(answer);
		panel.add(hint);
		panel.add(check);
		
	hint.addMouseListener(this);
	check.addMouseListener(this);	
		
		JTextField s = answer = new JTextField();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==hint) {
			JOptionPane.showMessageDialog(null, "If you need this hint you are truly stupid. What is 3-2?");
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
