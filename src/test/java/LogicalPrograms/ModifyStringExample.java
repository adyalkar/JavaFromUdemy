package LogicalPrograms;

public class ModifyStringExample {
	
    public static void main(String[] args) {
    	option1("I am a Rani");
    	option2();
    	option3();
    }
    
    public static void option1 (String input) {
    	
    	String output = input.replaceAll("(I)\\s(am)|(a)\\s(Rani)", "$1$2$3$4");
        
        System.out.println(output);
    	
    }
    
        public static void option2 () {
        	String input = "I am a Rani";
            String[] words = input.split(" "); // Split the input string by spaces

            StringBuilder output = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                if (i == 0) {
                    // Handle the first word
                    output.append(words[i]);
                } else if ((words[i - 1].equals("I") && words[i].equals("am")) || (words[i - 1].equals("a") && words[i].equals("Rani"))) {
                    // Concatenate without a space
                    output.append(words[i]);
                } else {
                    // Concatenate with a space
                    output.append(" ").append(words[i]);
                }
            }

            System.out.println(output.toString());
        }
        
        public static void option3 () {
        	
        	 String input = "I am a Rani";
             String[] words = input.split(" "); 
             String output = "";
             
             for (int i = 0; i < words.length; i++) {
                 if (i == 0) {
                     // Handle the first word
                     output += words[i];
                 } else if ((words[i - 1].equals("I") && words[i].equals("am")) || (words[i - 1].equals("a") && words[i].equals("Rani"))) {
                     // Concatenate without a space
                     output += words[i];
                 } else {
                     // Concatenate with a space
                     output += " " + words[i];
                 }
             }

             System.out.println(output);
         }
        	
        }
    



