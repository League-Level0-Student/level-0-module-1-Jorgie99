package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 = JOptionPane.showInputDialog("What has many keys but can't open a single lock?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle1.contentEquals("A piano")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null,"Wrong, it's a piano");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		String riddle2 = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		// 6. Add some more riddles
		if(riddle2.contentEquals("A coin")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null,"Wrong, it's a coin");
		}
		String riddle3 = JOptionPane.showInputDialog("Which word in the dictionary is spelled incorrectly?");
		if(riddle3.contentEquals("Incorrectly")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null,"Wrong, it's incorrectly");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is: " + score);
	}
}

