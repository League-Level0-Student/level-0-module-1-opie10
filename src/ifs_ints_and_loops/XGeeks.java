package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the super power for each person in a variable.
		String asher = "Your superpower is the control of wind and code.";

		String misha = "Your superpower is the control of rain, clouds and the ability to fly.";

		String jake = "Your superpower is the control of speed and time and you have the ability to go faster than any one.";

		String augie = "Your superpower is the control of water and strength you also have the ability to be the best in any sport.";

		String Daniel = "Your superpower is the control of teaching and riddles.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane
				.showInputDialog("What is your name?( Please put the first leter in your name in caps).");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (name.equals("Asher")) {
			JOptionPane.showMessageDialog(null, asher);
		}
		else if (name.equals("Augie")) {
			JOptionPane.showMessageDialog(null, augie);
		}
		else if (name.equals("Daniel")) {
			JOptionPane.showMessageDialog(null, Daniel);
		}
		else if (name.equals("Jake")) {
			JOptionPane.showMessageDialog(null, jake);
		}
		else if (name.equals("Misha")) {
			JOptionPane.showMessageDialog(null, misha);
			
		}else {
			JOptionPane.showMessageDialog(null, "You  are a normal person who does not know a thing and you have no powers because you are crazy");
				
			
		}

	}
}
