package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _C_JoinString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Stream", "API");

        String join = list.stream().collect(Collectors.joining("-"));

        System.out.println(join);
    }
}
