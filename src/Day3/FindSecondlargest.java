package Day3;

public class FindSecondlargest {

    public static void main(String[] args) {


        int a = 8, b = 4, c = -5;

        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        int second_largest = (largest ==a) ? (b>c ? b:c):((largest==b) ? (a>c ? a:c):(a>b ? a:b));

        System.out.println("Second Largest Number is : " + second_largest);
    }
}

