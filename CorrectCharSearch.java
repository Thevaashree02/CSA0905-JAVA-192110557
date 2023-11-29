import java.util.*;
class CorrectCharSearch{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int i,len;
String s1=new String();
char s2;
System.out.print("Enter a String : ");
s1=s.nextLine();
len=s1.length();
System.out.print("Enter the character to be searched : ");
s2=s.next().charAt(0);
for(i=0;i<=len;i++){
if(s2==s1.charAt(i)){
System.out.print(s2+" is present at "+i);
break;}
}
}
}