package Day12;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = {3, 5, 1, 4, 2};

        // Printing the array elements
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Searching for an element in the sorted array
        int key = 4;
        int index = Arrays.binarySearch(numbers, key);
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found.");
        }

        // Filling the array with a specific value
        Arrays.fill(numbers, 0);
        System.out.println("Array after fill: " + Arrays.toString(numbers));

        // Copying an array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // Checking if two arrays are equal
        int[] anotherArray = {0, 0, 0, 0, 0};
        boolean isEqual = Arrays.equals(numbers, anotherArray);
        System.out.println("Are numbers and anotherArray equal? " + isEqual);
    }
}
