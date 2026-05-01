package _5_Stream_API.OtherStreamAPI;

import java.util.Comparator;
import java.util.List;

public class _A_LongestStringInList {

    public static void main(String[] args) {

        List<String> list = List.of("java", "c", "python", "go");

       String longestString =  list.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(longestString);
    }
}
