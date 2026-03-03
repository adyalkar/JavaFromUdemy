package _7_String;

public class _7_ReverseEachWordInSentance {
	
	public static void main(String[] args) {
		
		String name = "Anup Chandrabhan Adyalkar";
		reverseEachWord(name);
	}
	
	public static void reverseEachWord (String str) {
		
		String [] sentanceArray= str.split(" ");
		String reverseSentance = "";
		
		for (String word : sentanceArray) {
			for (int i=word.length()-1;i>=0;i--) {
				reverseSentance += word.charAt(i);
			}
			reverseSentance += " ";
		}
		
		
		
		System.out.println("Reverse String is : "+ reverseSentance);
	}

	
	public static void reverseEachWord2(String str) {

	    String[] sentenceArray = str.split(" ");
	    StringBuilder reversedSentence = new StringBuilder();

	    for (String word : sentenceArray) {
	        StringBuilder reversedWord = new StringBuilder(word);
	        reversedSentence.append(reversedWord.reverse()).append(" ");
	    }

	    // Remove last space
	    System.out.println("Reverse String is : " + reversedSentence.toString().trim());
	}

}
