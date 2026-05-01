package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;
import java.util.List;

public class _4_any_all_match {

    public static void main(String[] args) {

        List<Integer>list = Arrays.asList(2,3,4,5,6,7,8,9,-1);

       boolean isGreater =  list.stream().anyMatch(n -> n>10);

        System.out.println(isGreater);

        boolean isEven = list.stream().allMatch(n -> n%2==0);
        System.out.println(isEven);

        boolean isNegative = list.stream().anyMatch(n->n<0);
        System.out.println(isNegative);


    }


}
