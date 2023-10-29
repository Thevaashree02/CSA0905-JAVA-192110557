import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;

        System.out.println("Enter characters (enter '*' to finish):");

        while (true) {
            String input = scanner.nextLine();
            char inputChar = input.charAt(0);

            if (inputChar == '*') {
                break;
            }

            if (Character.isUpperCase(inputChar)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(inputChar)) {
                lowercaseCount++;
            } else if (Character.isDigit(inputChar)) {
                digitCount++;
            }
        }

        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Numbers: " + digitCount);
    }
}