package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_RemoveDuplicate {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 5, 1, 7, 9, 10, 2, 3);

        List<Integer>distinct = list.stream().distinct().collect(Collectors.toList());

        System.out.println(distinct);


    }
}
