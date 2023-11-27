import java.util.Scanner;
class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = getRomanValue(currentChar);
            if (i < s.length() - 1 && getRomanValue(s.charAt(i + 1)) > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }
    public static int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String input = s.nextLine();
        int result = romanToInt(input);
        System.out.println("Output: " + result);
    }
}
