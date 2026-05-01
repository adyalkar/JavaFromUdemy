package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;

public class _8_CountTheWords {

    public static void main(String[] args) {

        String sentence = "java stream api is powerful";

        long count = Arrays.stream(sentence.split(" "))
                .count();

        System.out.println(count);
    }
}
