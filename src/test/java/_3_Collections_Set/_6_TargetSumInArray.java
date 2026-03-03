package _3_Collections_Set;

import java.util.HashSet;

public class _6_TargetSumInArray {
    
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        
        findPairForTarget(arr, target);
    }
    
    public static void findPairForTarget(int[] numbs, int target) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> targetPair = new HashSet<>();
        
        for (int firstNum : numbs) {
            int secNum = target - firstNum;
            
            // check if secNum was seen already
            if (seen.contains(secNum)) {
                int min = Math.min(firstNum, secNum);
                int max = Math.max(firstNum, secNum);
                targetPair.add("(" + min + "," + max + ")");
            }
            
            // now mark firstNum as seen
            seen.add(firstNum);
        }
        
        if (targetPair.isEmpty()) {
            System.out.println("No unique pair found");
        } else {
            for (String pair : targetPair) {
                System.out.println(pair);
            }
        }
    }
}



//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		int [] numbs = {11,12,4,16,11,9,10};
//		
//		HashSet <String> hs = new HashSet<>();
//		
//		int target = 20;
//		
//		
//		for (int i=0;i<=numbs.length-1;i++) {
//			
//			for (int j=i+1 ; j<=numbs.length -1 ; j++) {
//				
//			int sum = numbs[i] + numbs[j];
//				
//				if ((sum == target)) {
//					
//					int num1=numbs[i];
//					int num2 = numbs[j];
//					
//					hs.add("("+num1+","+num2+")");					
//					
//				}
//				
//			}
//		}
//		
//		System.out.println(hs);
//		
//		
//		
//	}
//}
//
