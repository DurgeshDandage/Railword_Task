package Day8;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        // Example of creating a String from a char array
        // char[] ch = {'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};
        // String s = new String(ch);

        // Example of charAt() Method
        // The charAt() method returns the character at a specific index (position)
        // String var = "Mayuresh Chandrakant Chavan";
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to check the character at that position: ");
        // int a = sc.nextInt();
        // char result = var.charAt(a);
        // System.out.println("The character at position " + a + " is: " + result);

        // Example of codePointAt() Method
        // The codePointAt() method returns the Unicode value of the character at the specified index
        // String var = "Sangita Chavan";
        // int result = var.codePointAt(2);
        // System.out.println(result);

        // Example of compareTo() Method
        // The compareTo() method compares two strings lexicographically
        // String a1 = "Hello";
        // String a2 = "Hello";
        // System.out.println(a1.compareTo(a2));

        // Example of compareToIgnoreCase() Method
        // The compareToIgnoreCase() method compares two strings lexicographically, ignoring case differences
        // String a1 = "Hello";
        // String a2 = "Hello java";
        // System.out.println(a1.compareToIgnoreCase(a2));

        // Example of concat() Method
        // The concat() method concatenates (joins) two strings
        // String s1 = "Mayuresh";
        // String s2 = " Chavan";
        // System.out.println(s1.concat(s2));

        // Example of contains() Method
        // The contains() method checks if a string contains a specific sequence of characters
        // String s1 = "Mayuresh Chavan";
        // System.out.println(s1.contains("M"));
        // System.out.println(s1.contains("a"));

        // Example of contentEquals() Method
        // The contentEquals() method checks if a string is equal to the content of a specified StringBuffer
        // String s1 = "Mayuresh";
        // System.out.println(s1.contentEquals("Mayuresh"));

        // Example of copyValueOf() Method
        // The copyValueOf() method returns a string that represents the character array
        // char[] s1 = {'m', 'a', 'y', 'u', 'r', 'e', 's', 'h'};
        // String s2 = "";
        // s2 = s2.copyValueOf(s1, 0, 7);
        // System.out.println(s2);

        // Example of endsWith() Method
        // The endsWith() method checks if a string ends with a specified suffix
        // String s1 = "Mayuresh";
        // System.out.println(s1.endsWith("resh"));
        // System.out.println(s1.endsWith("h"));
        // System.out.println(s1.endsWith("sh"));
        // System.out.println(s1.endsWith("res"));
        // System.out.println(s1.endsWith("reh"));

        // Example of equals() Method
        // The equals() method compares two strings for equality
        // String s1 = "Hello";
        // String s2 = "Hello";
        // String s3 = "Another String";
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));

        // Example of equalsIgnoreCase() Method
        // The equalsIgnoreCase() method compares two strings for equality, ignoring case differences
        // String s1 = "hello";
        // String s2 = "Hello";
        // String s3 = "Another string";
        // System.out.println(s1.equalsIgnoreCase(s2));
        // System.out.println(s1.equalsIgnoreCase(s3));

        // Example of hashCode() Method
        // The hashCode() method returns the hash code of a string
        // String s1 = "mayuresh";
        // System.out.println(s1.hashCode());

        // Example of indexOf() Method
        // The indexOf() method returns the index of the first occurrence of a specified character or substring
        // String s1 = "hello I am a java developer";
        // System.out.println(s1.indexOf("h"));

        // Example of string comparison using == (not recommended for string content comparison)
        // String s1 = "mayuresh chavan";
        // String s2 = "mayuresh chavan";
        // System.out.println(s1 == s2);  // This compares references, not values

        // Example of isEmpty() Method
        // The isEmpty() method checks if a string is empty (length is 0)
        // String s1 = "Mayuresh";
        // String s2 = "";
        // System.out.println(s1.isEmpty());
        // System.out.println(s2.isEmpty());

        // Example of length() Method
        // The length() method returns the length of a string
        // String s1 = "Mayuresh";
        // System.out.println(s1.length());

        // Example of replace() Method
        // The replace() method replaces each occurrence of a character with a new character
        String s1 = "Hello java";
        System.out.println(s1.replace('l', 'p'));
    }
}
