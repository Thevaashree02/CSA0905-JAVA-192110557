import java.util.*;
public class A7_ReverseAndAddPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        int reverseNumber = reverseNumber(inputNumber);
        int sum = inputNumber + reverseNumber;

        while (!isPalindrome(sum)) {
            System.out.println(inputNumber + " + " + reverseNumber + " = " + sum);
            inputNumber = sum;
            reverseNumber = reverseNumber(inputNumber);
            sum = inputNumber + reverseNumber;
        }

        System.out.println("Palindrome obtained: " + sum);

        scanner.close();
    }
    private static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
    private static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }
}