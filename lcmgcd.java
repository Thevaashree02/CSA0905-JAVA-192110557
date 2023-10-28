import java.util.Scanner;

public class lcmgcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of values
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // Initialize variables for LCM and GCD
        long lcm = 1;
        long gcd = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Number " + i + ": ");
            long num = scanner.nextLong();
            // Calculate the LCM and GCD
            lcm = findLCM(lcm, num);
            gcd = findGCD(gcd, num);
        }

        // Output the LCM and GCD
        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);

        scanner.close();
    }

    // Function to find LCM using GCD
    public static long findLCM(long a, long b) {
        return (a * b) / findGCD(a, b);
    }

    // Function to find GCD using Euclidean algorithm
    public static long findGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}