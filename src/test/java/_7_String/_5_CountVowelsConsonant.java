package _7_String;

import java.util.Map;
import java.util.stream.Collectors;

public class _5_CountVowelsConsonant {
	
    public static void main(String[] args) {
        String str = "hello world";

        Map<Boolean, Long> map = str.chars().mapToObj(c -> (char)c)
                        .collect(Collectors.partitioningBy(
                                c -> "aeiou".indexOf(c) >= 0,Collectors.counting()
                        ));

        System.out.println("Vowels count is " + map.get(true) + " and consonant count is " + map.get(false));
        count2(str);
    }

    public static void count(String str) {
        int vowels = 0;
        int consonants = 0;

        // Convert to lowercase to handle both upper & lower cases
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {

            if (c >= 'a' && c <= 'z') {  // only count alphabets
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.printf("Vowels count is %d and consonant count is %d%n", vowels, consonants);
    }
    
    public static void count2(String str) {
        int vowels = 0;
        int consonants = 0;

        // Convert to lowercase to handle both upper & lower cases
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {

            if (c >= 'a' && c <= 'z') {  // only count alphabets
                if ("aeiou".indexOf(c) != -1) {
                	vowels++;
                	
                }else {
                	consonants++;
                }
            }
        }

        System.out.printf("Vowels count is %d and consonant count is %d%n", vowels, consonants);
    }
}
