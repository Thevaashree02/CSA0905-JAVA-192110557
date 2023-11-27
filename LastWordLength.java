import java.util.Scanner;
class LastWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine();
        String[] words = statement.split("\\s+");
        String s1 = words[words.length - 1];
        System.out.println("Last Word: " +s1);
	int res=s1.length();
	System.out.println("Last Word Length: " +res);
        scanner.close();
    }
}