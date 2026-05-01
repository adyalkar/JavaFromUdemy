import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		 List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
//		 List<String> targetPair = new ArrayList<>();
//
//		 int target = 5;
//
//
//		 for (int x: list) {
//			 int req = target - x;
//
//			 if (list.contains(req)) {
//				 if(req>x) {
//				 targetPair.add("("+x+","+req+")");
//				 }
//			 }
//		 }
//
//		 System.out.println(targetPair);

        String str = "bcaA";

        String result = str.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());



        System.out.println(result);
		 
		 
}
}
	
