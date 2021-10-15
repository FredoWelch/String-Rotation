
public class StringRotationExample {
	
	public static boolean checkForRotation(String input1, String input2) {
		
		if (input1.length() != input2.length()) {
			return false;
		}
		String input3 = input1+input1;
		if(input3.contains(input2))
			return true;
		else 
			return false;
		
	}
	
	
	public static void main(String[] args) {
		
		String firstWord = "freddie";
		String secondWord = "reddief";
		
		if (checkForRotation(firstWord, secondWord)) {
			System.out.println(secondWord + " IS A ROTATION OF " + firstWord);
		}
		else {
			System.out.println(secondWord + "IS NOT A ROTATION OF " + firstWord);
		}
		
	}

}
