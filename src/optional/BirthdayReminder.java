package optional;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		String momsBirthday = "December 24th";
		String dadsBirthday = "September 2nd";
		String myBirthday = "July 7th";

		String answer = JOptionPane.showInputDialog("Who's birthday do you want to know?");

		System.out.println(answer);

		if (answer.equals("mom")) {

			JOptionPane.showMessageDialog(null, answer + "'s" + " birthday is " + momsBirthday);
		} else if (answer.equals("dad")) {

			JOptionPane.showMessageDialog(null, answer + "'s" + " birthday is " + dadsBirthday);
		} else if (answer.equals("yours")) {

			JOptionPane.showMessageDialog(null, "My birthday is " + myBirthday);
		} else {

			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}

	}
}
