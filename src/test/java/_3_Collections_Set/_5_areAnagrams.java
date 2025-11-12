package _3_Collections_Set;

import java.util.Arrays;

public class _5_areAnagrams {
	
	public static void main(String[] args) {
		
		String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams");
        }
		
	}
	
	public static boolean areAnagrams (String S1 , String S2) {
		
		if (S1.length() != S2.length()) return false;
				
		char [] c1=  S1.toCharArray();
		char [] c2=  S2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
		
	}

}

//Now both "listen" and "silent" become "eilnst", so they are equal → anagrams ✅.
