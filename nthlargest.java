import java.util.Arrays;
import java.util.Scanner;

public class nthlargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input the elements of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter N to find the Nth largest number: ");
        int n = scanner.nextInt();

        if (n <= array.length && n > 0) {
            // Sort the array in descending order
            Arrays.sort(array);
            int nthLargest = array[array.length - n];

            System.out.println(n + "th Largest number: " + nthLargest);
        } else {
            System.out.println("Invalid input. N should be between 1 and the array length.");
        }

        scanner.close();
    }
}