package offerTea;

public class UserInput {
	
	public static String userInput(String answer, int count) {
		if(answer.startsWith("y"))
			return "Great, I'll make tea now!";
		else if (answer.startsWith("n") && count < 4)
			return "It's free! You want tea?";
		else if (answer.startsWith("n") && count == 4)
			return "Alright then, your loss.";
		else 
			return "I don't understand, yes or no?";
	}
	

}
