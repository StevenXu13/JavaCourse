import java.util.Scanner;

public class narcissistic {
    public static int cube(int n) {
        return n * n * n;
    }
    public static int sumDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + cube(digit);
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int originalNumber = sc.nextInt();
        sc.close();
        int number = originalNumber;
        int actual;
        actual = sumDigit(number);
        if (actual == originalNumber) {
            System.out.println(originalNumber + " is a narcissistic number." );
        } else {
            System.out.println(originalNumber + " is not a narcissistic number.");
        }

    }

}
