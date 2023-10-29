import java.util.Scanner;

public class Charsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to be searched: ");
        char searchChar = scanner.next().charAt(0);

        int index = -1; // Initialize index to -1 (not found)

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                index = i; // Update the index when the character is found
                break;      // Exit the loop since we found the character
            }
        }

        if (index != -1) {
            System.out.println(searchChar + " is found in the string at index: " + index);
        } else {
            System.out.println(searchChar + " is not found in the string.");
        }
    }
}