package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _2_Sort {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,2,5,1,7,14,18,3);

        List<Integer> naturalOrder = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        List<Integer> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Natural order: " + naturalOrder);
        System.out.println("Reverse order: " + reverseOrder);
    }
}
