import java.util.*;
class p{
int r,h;
double pi,res1,res2;
void calc1(int a){
r=a;
pi=3.14;
res1=pi*r*r;
System.out.println("Result 1 ="+res1);}
}
class q extends p{
void calc2(int b){
h=b;
res2=res1*h;
System.out.println("Result 2 ="+res2);}
public static void main(String arg[]){
int x,y;
Scanner s=new Scanner(System.in);
System.out.print("Enter the radius :");
x=s.nextInt();
System.out.print("Enter the height :");
y=s.nextInt();
q obj=new q();
obj.calc1(x);
obj.calc2(y);
}
}
