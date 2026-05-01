package _5_Stream_API.OtherStreamAPI;

import java.util.Map;
import java.util.stream.Collectors;

public class _6_FreqOfCharInString {

    public static void main(String[] args) {

        String str = "helloworld";

        Map<Character, Long> freq = str.chars().mapToObj(c ->(char)c).collect(
                Collectors.groupingBy( c -> c,Collectors.counting())
        );

        System.out.println(freq);
    }
}
