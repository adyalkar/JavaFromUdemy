package _5_Stream_API.OtherStreamAPI;

import java.util.stream.Collectors;

public class _F_IsAnagrams {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silen";

     boolean isAnagrams =    s1.chars().mapToObj(x-> (char)x).sorted()
                .collect(Collectors.toList()).equals(
                        s2.chars().mapToObj(x-> (char)x).sorted()
                                .collect(Collectors.toList())
                );

     if(isAnagrams) {
    	 System.out.println("Anagrams");
     } else {
    	 System.out.println("Not Anagrams");
     }

    }
}
