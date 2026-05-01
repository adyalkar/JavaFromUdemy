package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _G_MoveAllZeroToEnd {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,1,0,3,12);

      List<Integer> result =  Stream.concat(
                list.stream().filter(x->x!=0),
                list.stream().filter(x->x==0)
        ).collect(Collectors.toList());

        System.out.println(result);
    }
}
