package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _5_ListToMapConversion {


    public static void main(String[] args) {
        List<String> str = Arrays.asList("Hello", "World", "Java", "Stream", "API");

        Map<String,Integer> map = str.stream().collect(
                Collectors.toMap(
                        name -> name,
                        name -> name.length()
                )
        );

        System.out.println(map);
    }
}
