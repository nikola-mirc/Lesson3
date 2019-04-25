package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {

		int ourNumber = new Random().nextInt(100);
		System.out.println(ourNumber);
		int numberOfTries = 4;

		int answer = Integer.parseInt(JOptionPane.showInputDialog("Enter number 0-100:"));

		for (int i = 0; i < 4; i++) {

			if (answer < ourNumber) {
				answer = Integer.parseInt(JOptionPane.showInputDialog("Try higher:"));
				numberOfTries = numberOfTries - 1;
			} else if (answer > ourNumber) {
				answer = Integer.parseInt(JOptionPane.showInputDialog("Try lower:"));
				numberOfTries = numberOfTries - 1;
			} else {
				JOptionPane.showMessageDialog(null, "You win!");
				break;

			}
			if (numberOfTries == 0 && answer != ourNumber) {
				JOptionPane.showMessageDialog(null, "You lose!");
			}

		}

	}
}
