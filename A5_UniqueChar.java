import java.util.*;
class A5_UniqueChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Unique characters: ");
        for (int i=0;i<input.length();i++) {
            char currentChar=input.charAt(i);
            if(input.indexOf(currentChar)==input.lastIndexOf(currentChar)){
                System.out.print(currentChar+ " ");
            }
        }
        scanner.close();
    }
}