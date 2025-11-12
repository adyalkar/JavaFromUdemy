package _4_Collections_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _B_GroupEmployeesByDept {
	
	public static void main(String[] args) {
		
		 // Step 1: Input data
        String[][] employees = {
                {"Alice", "HR"},
                {"Bob", "IT"},
                {"Carol", "HR"},
                {"David", "IT"},
                {"Eve", "Finance"}
        };

        // Step 2: Call method
        groupByDepartment(employees);
	}
	
	public static void groupByDepartment(String[][] employees) {
		
		Map<String , List<String>> map = new HashMap<>();
		
		for (String [] emp : employees) {
			String name = emp[0];
			String dept = emp [1];
			
			map.putIfAbsent(dept, new ArrayList<>());
			
			map.get(dept).add(name);
		}
		
		for (Map.Entry<String , List<String>> entry : map.entrySet()) {
			
			System.out.println(entry.getKey() +" --> "+ entry.getValue());
			
		}
	}

}
