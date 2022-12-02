package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String hair = "You have nice hair";
		String smart = "You are very smart";
		String tall = "You are very tall";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("What's your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if(name.equals("Steve")) {
			JOptionPane.showMessageDialog(null, hair);
		} else if(name.equals("Bob")) {
			JOptionPane.showMessageDialog(null, smart);
		} else {
			JOptionPane.showMessageDialog(null, tall);
		}
	}
}

