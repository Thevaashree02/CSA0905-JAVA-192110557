import java.util.Arrays;
import java.util.Scanner;
class A6_MthMaxNthMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int numElements = s.nextInt();
        int[] array = new int[numElements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numElements; i++) {
            array[i] = s.nextInt();
        }

        System.out.print("Enter the value of M: ");
        int m = s.nextInt();

        System.out.print("Enter the value of N: ");
        int n = s.nextInt();
        Arrays.sort(array);
        int mthMax = array[numElements - m];
        int nthMin = array[n - 1];

        int sum = mthMax + nthMin;
        int diff = Math.abs(mthMax - nthMin);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println(m + "th Maximum Number = " + mthMax);
        System.out.println(n + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        s.close();
    }
}