package _5_Stream_API.OtherStreamAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _E_MapStreamApi {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Amit", "IT");
        employeeMap.put("Ravi", "HR");
        employeeMap.put("Neha", "IT");
        employeeMap.put("Priya", "Finance");
        employeeMap.put("Karan", "HR");

        // Grouping employees by department

       Map<String, List<String>> groupByDepart =employeeMap.entrySet().stream().
                collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey,Collectors.toList())
                ));

        System.out.println(groupByDepart);

        // Counting employees in each department

        Map<String, Long> countByDepart = employeeMap.entrySet().stream().
                collect(Collectors.groupingBy(Map.Entry::getValue ,Collectors.counting()));

        System.out.println(countByDepart);


    }
}
