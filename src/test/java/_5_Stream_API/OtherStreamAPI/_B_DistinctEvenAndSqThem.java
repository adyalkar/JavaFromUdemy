package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _B_DistinctEvenAndSqThem {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,2,3,4,4,6);

       List<Integer> distinctSq = numbers.stream().distinct().filter(n ->n%2==0).
               map(n-> n*n).
               collect(Collectors.toList());

        System.out.println(distinctSq);

    }
}
