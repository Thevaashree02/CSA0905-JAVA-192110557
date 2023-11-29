import java.util.Scanner;
class NumPattern_RtPyr_122333 {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int rows = s.nextInt();
for (int i = 1; i <= rows; i++) {
for (int j = 1; j <= i; j++) {
System.out.print(i + " ");
}
System.out.println();
}
for (int i = rows - 1; i > 0; i--) {
for (int j = 1; j <= i; j++) {
System.out.print(i + " ");
}
System.out.println();
}   
}
}