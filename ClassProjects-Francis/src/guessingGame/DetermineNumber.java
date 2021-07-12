package guessingGame;

public class DetermineNumber {
	
	public static String guess(int userAnswer, int number, int count) {
		if (count == 10) {
			return "You couldnt gess the number in 10 tries :(";
		}
		else {
			if (userAnswer <=0 || userAnswer >100){
				return "Please guess a number between 0 and 100";
			}
			else if (userAnswer == number) {
				return "Correct! \n Total number of guesses: " + count;
			}
			else if (userAnswer > number) {
				if (userAnswer-number < 10) {
					return "Close, the number is lower than what you guessed, try again: ";
				}
				else {
					return "The number you guessed is way too high! Give it another shot: ";
				}
			}
			else if (userAnswer < number) {
				if (number-userAnswer <10) {
					return "Close, the number is higher than what you guessed, try again: ";
				}
				else {
					return "The number you guessed is way too low! Give it another shot: ";
				}
			}
			else {
				return "Your guess in incorrect.";
			}
		}
	}
	
}
