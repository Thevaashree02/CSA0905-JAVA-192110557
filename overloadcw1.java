import java.util.*;
class overloadcw1{
String a,b,c;
int i;
void m1(String s1){
a=s1;
System.out.println(a);
}
void m2(String s2,int i){
b=s2;
for(i=0;i<2;i++){
System.out.println(b);}
}
void m3(String s3,int i){
c=s3;
for(i=0;i<3;i++){
System.out.println(c);}
}
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
String s1,s2,s3;
int i=0;
System.out.print("Enter String 1 :");
s1=s.nextLine();
System.out.print("Enter String 2 :");
s2=s.nextLine();
System.out.print("Enter String 3 :");
s3=s.nextLine();
overloadcw1 obj=new overloadcw1();
obj.m1(s1);
obj.m2(s2,i);
obj.m3(s3,i);
}
}