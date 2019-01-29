package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		String useranswer1 = JOptionPane.showInputDialog(
				"Answer these 5 riddles and you shall pass, if you fail you will be destroyed!\n Ready for riddle 1? You can drop me from the tallest building and I'll be fine, but if you drop me in water I die. What am I?");
		String answer1 = "paper";
		if (useranswer1.equals(answer1)) {
			JOptionPane.showMessageDialog(null, "correct!!!");
			score = score + 1;
		}

		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer was acctually paper");
		}

		String useranswer2 = JOptionPane
				.showInputDialog("Ready for riddle 2? What invention lets you look right through a wall?");
		String answer2 = "a window";
		if (useranswer2.equals(answer2)) {
			JOptionPane.showMessageDialog(null, "correct!!!");
			score = score + 1;
		}

		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer was acctually a window");

		}
		String useranswer3 = JOptionPane.showInputDialog("Ready for riddle 3? What can you catch but not throw?");
		String answer3 = "a cold";
		if (useranswer3.equals(answer3)) {
			JOptionPane.showMessageDialog(null, "correct!!!");
			score = score + 1;
		}

		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer was acctually a cold");

		}
		String useranswer4 = JOptionPane.showInputDialog("Ready for riddle 4? What has roots as nobody sees,\r\n"
				+ "Is taller than trees.\r\n" + "Up, up, up it goes,\r\n" + "And yet never grows?");
		String answer4 = "a mountain";
		if (useranswer4.equals(answer4)) {
			JOptionPane.showMessageDialog(null, "correct!!!");
			score = score + 1;
		}

		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer was acctually a mountain ");

		}
		String useranswer5 = JOptionPane.showInputDialog(
				"Ready for riddle 5? Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?");
		String answer5 = "man";
		if (useranswer5.equals(answer5)) {
			JOptionPane.showMessageDialog(null,
					"correct!!! Man. He crawls on all fours as a baby, then walks on two feet as an adult, and then walks with a cane as an old man.");
			score = score + 1;
		}

		else {
			JOptionPane.showMessageDialog(null,
					"Wrong, the answer was acctually Man. He crawls on all fours as a baby, then walks on two feet as an adult, and then walks with a cane as an old man.  ");

		}
		JOptionPane.showMessageDialog(null, "Your score was " + score);

		if (score == 0) {
			JOptionPane.showMessageDialog(null,
					"You have failed you shall never return from here alive !!!!!!!!!!!!!!!!!");

		}
		if (score == 5) {
			JOptionPane.showMessageDialog(null,
					"You have conqured this riddle test you are the grand champion riddler !!!!!!!!!!!!!!!!!");

			// 5. Otherwise, say "wrong" and tell them the answer
			// 6. Add some more riddles

			// 2. Make a pop up to show the score.

		}
	}
}
