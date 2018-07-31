package stringprograms;

public class RemoveJunkChar {
//Removing unwanted characters from a String
	public static void main(String[] args) {
		
		String input="次回もこのログJavaPgrammingPractice";
		input=input.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(input);

	}

}
