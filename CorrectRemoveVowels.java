import java.util.*;
class CorrectRemoveVowels{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int i,len;
char ch;
System.out.print("Enter a string: ");
String s1=s.nextLine();
len=s1.length();
StringBuilder result = new StringBuilder();
for(i=0;i<len;i++){
ch=s1.charAt(i);
if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
result.append(ch);}
}
System.out.println("String after removing vowels: "+result);
}
}