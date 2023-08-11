package _3_Array;

import java.util.Arrays;
import java.util.List;

public class _2_ArraysClassethods {

	public static void main(String[] args) {
		
		        // toString()
		        int[] numbers = {1, 2, 3, 4, 5};
		        String arrayString = Arrays.toString(numbers);
		        System.out.println(arrayString); // Output: [1, 2, 3, 4, 5]

		        // sort()
		        int[] numbersToSort = {5, 2, 8, 1, 3};
		        Arrays.sort(numbersToSort);
		        System.out.println(Arrays.toString(numbersToSort)); // Output: [1, 2, 3, 5, 8]

		        // binarySearch()
		        int[] sortedNumbers = {1, 2, 3, 4, 5};
		        int index = Arrays.binarySearch(sortedNumbers, 3);
		        System.out.println(index); // Output: 2 (index of element 3 in the sorted array)

		        // copyOf()
		        int[] sourceArray = {1, 2, 3, 4, 5};
		        int[] copiedArray = Arrays.copyOf(sourceArray, sourceArray.length);
		        System.out.println(Arrays.toString(copiedArray)); // Output: [1, 2, 3, 4, 5]

		        // copyOfRange()
		        int[] originalArray = {1, 2, 3, 4, 5};
		        int[] subrange = Arrays.copyOfRange(originalArray, 1, 4);//IE-->Include Exclude
		        System.out.println(Arrays.toString(subrange)); // Output: [2, 3, 4]

		        // fill()
		        int[] emptyArray = new int[5];
		        Arrays.fill(emptyArray, 10);
		        System.out.println(Arrays.toString(emptyArray)); // Output: [10, 10, 10, 10, 10]

		        // equals()
		        int[] array1 = {1, 2, 3};
		        int[] array2 = {1, 2, 3};
		        boolean arraysEqual = Arrays.equals(array1, array2);
		        System.out.println(arraysEqual); // Output: true

		        // hashCode()
		        int[] arrayToHash = {1, 2, 3};
		        int hashCode = Arrays.hashCode(arrayToHash);
		        System.out.println(hashCode); // Output: -1634557797 (hash code of the array)

		        // asList()
		        String[] names = {"John", "Jane", "Alice"};
		        List<String> nameList = Arrays.asList(names);
		        System.out.println(nameList); // Output: [John, Jane, Alice]

		        // stream()
		        int[] arrayToStream = {1, 2, 3, 4, 5};
		        Arrays.stream(arrayToStream)
		        .forEach(element -> System.out.println(element)); // Output: 1, 2, 3, 4, 5
		    }
		
	}


