import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
        int reverseNumber = 0;
        int digitCount = 0;

        // 判断是几位数
        while (number != 0) {
            number /= 10;
            digitCount++;
        }

        number = originalNumber; // 重置为原始数

        // 判断是否为回文数
        while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.println(originalNumber + " is a " + digitCount + "-digit palindrome number");
        } else {
            System.out.println(originalNumber + " is not a palindrome number");
        }
    }
}
