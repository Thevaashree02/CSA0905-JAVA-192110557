import java.util.*;
class EvenSumFibonacci {
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
System.out.print("Enter the value of n: ");
int n = s.nextInt();
int a = 0, b = 1,c,evenSum = 0;
for (int i = 0; i < n; i++) {
if (i % 2 == 0) {
evenSum=evenSum+a;
}
c = a + b;
a = b;
b = c;
}
System.out.println("Sum of even Fibonacci numbers till " + n + ": " + evenSum);
}
}