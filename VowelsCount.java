import java.util.*;
class VowelsCount
{
public static void main(String arg[])
{
int len,i,count=0;
Scanner s=new Scanner(System.in);
String s1;
String s2;
System.out.print("Enter a String = ");
s1=s.nextLine();
len=s1.length();
for(i=0;i<len;i++){
char c=s1.charAt(i);
if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
count=count+1;
System.out.println("Vowels in the input string:"+c);}
}
System.out.println("Number of vowels in the string:"+count);
}
}