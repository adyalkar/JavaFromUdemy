package _4_Collections_Map;

import java.util.*;
import java.util.stream.Collectors;

public class _6_SortMapByValueDetailed {
    public static void main(String[] args) {
        String sentence = "I love Java I love coding I love programming";
//        sortByFrequency(sentence);

       Map<Object, Long> map = Arrays.stream(sentence.split(" "))
               .collect(Collectors.groupingBy(
                x -> x, Collectors.counting()
        ));

       map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);
    }

    public static void sortByFrequency(String sentence) {
        // 1) count frequencies in a HashMap
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String w : words) {
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }

        // 2) Convert map entries to a List so we can sort them.
        //    entrySet() returns a Set<Map.Entry<String,Integer>
        //    We create an ArrayList from it because Lists can be sorted.
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordCount.entrySet());

        // 3) Sort the list by value (frequency) in descending order.
        //    Comparator: compare two entries e1 and e2 by their Integer values.
        //    e2.getValue().compareTo(e1.getValue()) -> descending order
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // 4) Print sorted entries (or put into LinkedHashMap to preserve order)
        System.out.println("Words sorted by frequency (desc):");
        for (Map.Entry<String, Integer> e : entryList) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        // Optional: build LinkedHashMap if you need a Map that iterates in this order
//        Map<String, Integer> sortedMap = new LinkedHashMap<>();
//        for (Map.Entry<String, Integer> e : entryList) {
//            sortedMap.put(e.getKey(), e.getValue());
//        }

        // 'sortedMap' preserves iteration order (highest frequency first)
    }
}

