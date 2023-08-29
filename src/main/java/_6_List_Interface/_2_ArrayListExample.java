package _6_List_Interface;

import java.util.ArrayList;
import java.util.List;

public class _2_ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        List<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements using indexes
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Iterate through the ArrayList using a for-each loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if the ArrayList contains an element
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana); // Output: true

        // Remove an element from the ArrayList
        fruits.remove("Orange");

        // Size of the ArrayList
        int size = fruits.size();
        System.out.println("Number of fruits: " + size); // Output: 2

        // Clear the ArrayList
        fruits.clear();

        // Check if the ArrayList is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is empty: " + isEmpty); // Output: true
    }
}

