package _10_pig_latin;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ThisPigLatin implements MouseListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton translate = new JButton("Translate");
JTextField english=new JTextField(10);
JTextField latin= new JTextField(10);

	
 void pl(){
		
	frame.add(panel);
	panel.add(english);
	panel.add(translate);
	panel.add(latin);
		

 frame.setVisible(true);
 frame.pack();
 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
 translate.addMouseListener(this);
 }
  


	 /**
	 * Method to test whether a character is a letter or not.
	 * @param c The character to test
	 * @return True if it's a letter
	 */
	 private static boolean isLetter(char c) {
	 return ( (c >= 'A' && c <= 'Z') || (c >='a' && c <= 'z') );
	 }
	     
	 /**
	 * Method to translate one word into pig latin.
	 * @param word The word in english
	 * @return The pig latin version
	 */
	 private static String pigWord(String word) {
	 int split = firstVowel(word);
	 return word.substring(split)+"-"+word.substring(0, split)+"ay";
	 }
	 	
	 /**
	 * Method to translate a sentence word by word.
	 * @param s The sentence in English
	 * @return The pig latin version
	 */
	 public String translate (String s) {
	 String latin = "";
	 int i = 0;
	 while (i < s.length()) {
	 // Take care of punctuation and spaces
	 while (i < s.length() && !isLetter(s.charAt(i))) {
	 latin = latin + s.charAt(i);
	 i++;
	 }
	 // If there aren't any words left, stop.
	 if (i>=s.length()) break;
	 // Otherwise we're at the beginning of a word.
	 int begin = i;
	 while (i < s.length() && isLetter(s.charAt(i))) {
	 i++;
	 }
	 // Now we're at the end of a word, so translate it.
	 int end = i;
	 latin = latin + pigWord(s.substring(begin, end));
	 }
	 return latin;
	 }
	 /**
	 * Method to find the index of the first vowel in a word.
	 * @param word The word to search
	 * @return The index of the first vowel
	 */
	 	  private static int firstVowel(String word) {
	 word = word.toLowerCase();
	 for (int i=0; i < word.length(); i++)
	 if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
	 word.charAt(i)=='i' || word.charAt(i)=='o' ||
	 word.charAt(i)=='u')
	 return i;
	 return 0;
	 }



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==translate) {
			latin.setText(translate(english.getText()));
		
		}
		english.setColumns(english.getText().length());
		latin.setColumns(latin.getText().length());
		frame.pack();
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
	
	

