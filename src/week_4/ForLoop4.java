package week_4;

public class ForLoop4 {

	public static void main(String[] args) {
		
		// Reverse string

		String word = "SiliconeLabs";
		
		String reversed = "";
		
		for (int i = word.length()-1; i >= 0; i--) {
			reversed = reversed + word.charAt(i);
		}
		
		System.out.println(reversed);
		
		// For Reversing each word
		String sentence = "Silicone Labs";
		
		String [] words = sentence.split(" ");
		
		String reversedStr = "";
		
		for (int i = 0; i < words.length; i++) {
			
			String str = words[i];
			
			String reversedWord = "";
			
			for (int j = str.length()-1; j >= 0; j--) {
				reversedWord = reversedWord + str.charAt(j); 
			}
			
			reversedStr = reversedStr + reversedWord + " ";
			
		}
		
		System.out.println(reversedStr);
		
		
	}

}
