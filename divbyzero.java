import java.util.*;
class divbyzero{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int a,b;
System.out.println("Enter the value of a and b :");
a=s.nextInt();
b=s.nextInt();
try{
int c=a/b;
System.out.println("Result = "+c);
}
catch(Exception e){
System.out.println("Division by zero error.");
System.out.println("Change the value of b.");
}
finally{
System.out.println("Always executed.");
}
}
}