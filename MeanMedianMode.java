import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int mean = 0, median = 0, mode = 0;

        // Calculate the mean
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        mean = sum / n;

        // Calculate the median
        Arrays.sort(array);
        if (n % 2 == 0) {
            int mid1 = array[n / 2 - 1];
            int mid2 = array[n / 2];
            median = (mid1 + mid2) / 2;
        } else {
            median = array[n / 2];
        }

        // Calculate the mode
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        for (int num : array) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }
        }

        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);

        scanner.close();
    }
}