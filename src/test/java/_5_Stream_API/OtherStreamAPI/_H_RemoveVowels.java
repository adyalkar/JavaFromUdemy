package _5_Stream_API.OtherStreamAPI;

import java.util.stream.Collectors;

public class _H_RemoveVowels {

    public static void main(String[] args) {

        String str = "automation";

       String result =  str.chars().mapToObj(x->(char)x)
                .filter(x->"aeiou".indexOf(x) == -1)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result);
    }


}
