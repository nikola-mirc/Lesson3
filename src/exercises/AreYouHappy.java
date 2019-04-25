package exercises;

import static org.junit.Assert.assertArrayEquals;

import javax.swing.JOptionPane;

/* See the diagram in the "doc" directory. */

public class AreYouHappy {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Are you happy?");

		for (int i = 0; i < 999; i++) {

			if (!answer.equals("yes") && !answer.equals("no")) {
				JOptionPane.showMessageDialog(null, "Please yes or no answer only.");
				answer = JOptionPane.showInputDialog("Are you happy?");
			}

			if (answer.equals("yes")) {

				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
				break;
			} else if (answer.equals("no")) {

				answer = JOptionPane.showInputDialog("Do you want to be happy?");

				if (answer.equals("no")) {

					JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
					break;
				} else if (answer.equals("yes")) {

					JOptionPane.showMessageDialog(null, "Change something.");
					break;
				}

			}

		}
	}

}