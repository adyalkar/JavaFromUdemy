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
