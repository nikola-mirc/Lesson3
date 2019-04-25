package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

/**
 * The first Speak & Spell was introduced at the summer Consumer Electronics
 * Show in June 1978, making it one of the earliest hand-held electronic devices
 * with a visual display to use interchangeable game cartridges. It was my
 * favorite game as a kid.
 * 
 * https://www.youtube.com/watch?v=qM8FcN0aAvU
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {

		int score = 0;

		SpeakAndSpell SAS = new SpeakAndSpell();
		String[] arrayOfWords = new String[] { "mandlebrot", "joghurt", "emperor" };

		for (int i = 0; i < arrayOfWords.length; i++) {
			JOptionPane.showMessageDialog(null, "Please listen the word");
			SAS.speak(arrayOfWords[i]);
			String userinput = JOptionPane.showInputDialog("Spell the word");

			if (userinput.equals(arrayOfWords[i])) {
				SAS.speak("Correct!");
				score = score + 1;
			}

			else {
				SAS.speak("Wrong!");
				score = score - 1;
			}
		}

		JOptionPane.showMessageDialog(null, "Your score is " + score);

	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
