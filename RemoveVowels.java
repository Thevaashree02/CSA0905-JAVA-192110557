import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String result = removeVowels(inputString);

        System.out.println("The string without vowels is: " + result);
    }

    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ("AEIOUaeiou".indexOf(c) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}