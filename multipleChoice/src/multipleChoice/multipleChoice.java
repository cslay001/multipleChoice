/**
 * 
 */
package multipleChoice;

import java.util.Scanner;

/**
 * @author corey
 *
 */
public class multipleChoice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String question = "Who invented solar power?";
		String choiceOne = "a. Thomas Edison";
		String choiceTwo = "b. Albert Einstein";
		String choiceThree = "c. Nikola Tesla";
		String choiceFour = "d. Elvis Presley";
		
		String correctAnswer = "b";
		
		System.out.println(question);
		System.out.println(choiceOne + "          " + choiceTwo);
		System.out.println(choiceThree + "          " + choiceFour);
		Scanner scannerZero = new Scanner(System.in);
		
		String userAnswer = scannerZero.next();
		
		if (correctAnswer.equals(userAnswer.toLowerCase())) {
			System.out.println("Correct");
			System.out.println("Great Job!");
		} else {
			System.out.println("Incorrect");
			System.out.println("Sorry! Try Again? {Y/n)");
		}
	}

}
