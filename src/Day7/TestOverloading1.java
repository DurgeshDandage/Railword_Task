package Day7;

/*
Method Overloading

When a class has multiple methods having the same name but different parameters, it is known as Method Overloading.

If we have to perform only one operation, having the same name for the methods increases the readability of the program.

Example
*/

class Adder {
    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class TestOverloading1 {
    public static void main(String[] args) {
        // Calls the method add(int a, int b)
        System.out.println(Adder.add(11, 11));

        // Calls the overloaded method add(int a, int b, int c)
        System.out.println(Adder.add(11, 11, 11));
    }
}

