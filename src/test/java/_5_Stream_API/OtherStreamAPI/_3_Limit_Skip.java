package _5_Stream_API.OtherStreamAPI;

import java.util.List;

public class _3_Limit_Skip {

    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C", "D", "E", "F", "G", "H");

        list.stream().limit(6).skip(2).forEach(System.out::println);

    }

}
