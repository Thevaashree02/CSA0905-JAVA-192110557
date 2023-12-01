import java.util.*;
class StringOperations{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int res1;
System.out.print("Enter a String : ");
String s1=s.nextLine();
System.out.print("Enter the word to be replaced : ");
String word=s.nextLine();
System.out.print("Enter the new word : ");
String rep=s.nextLine();
s1=s1.replaceAll(word,rep);
System.out.println("After Replacement : "+s1);
res1=s1.length();
System.out.println("Length of string = "+res1);
String res2=s1.toUpperCase();
System.out.println("UpperCase String = "+res2);
}
}