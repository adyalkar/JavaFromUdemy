import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		 List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		 List<String> targetPair = new ArrayList<>();
		 
		 int target = 5;
		 
		 
		 for (int x: list) {
			 int req = target - x;
			 
			 if (list.contains(req)) {
				 if(req>x) {
				 targetPair.add("("+x+","+req+")");
				 }
			 }
		 }
		 
		 System.out.println(targetPair);
		 
		 
		 
}
}
	
