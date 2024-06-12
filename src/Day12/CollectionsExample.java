package Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        // Print the original list
        System.out.println("Original list: " + numbers);

        // Sort the list
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Reverse the list
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        // Shuffle the list
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // Find the maximum element
        int max = Collections.max(numbers);
        System.out.println("Maximum element: " + max);

        // Find the minimum element
        int min = Collections.min(numbers);
        System.out.println("Minimum element: " + min);

        // Sort the list in descending order using a comparator
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println("List sorted in descending order: " + numbers);

        // Binary search in a sorted list
        Collections.sort(numbers); // Ensure the list is sorted
        int index = Collections.binarySearch(numbers, 4);
        if (index >= 0) {
            System.out.println("Element 4 found at index: " + index);
        } else {
            System.out.println("Element 4 not found.");
        }
    }
}
