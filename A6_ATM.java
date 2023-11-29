import java.util.Scanner;
class A6_ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominations = {2000, 500, 200, 100};
        int[] notesCount = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter the " + (i + 1) + " Denomination: ");
            denominations[i] = scanner.nextInt();

            System.out.print("Enter the " + (i + 1) + " Denomination number of notes: ");
            notesCount[i] = scanner.nextInt();
        }
        int totalBalance = calculateTotalBalance(denominations, notesCount);
        System.out.println("Total Available Balance in ATM: " + totalBalance);
        scanner.close();
    }

    private static int calculateTotalBalance(int[] denominations, int[] notesCount) {
        int totalBalance = 0;

        for (int i = 0; i < denominations.length; i++) {
            totalBalance += denominations[i] * notesCount[i];
        }

        return totalBalance;
    }
}