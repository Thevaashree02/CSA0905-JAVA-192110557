import java.util.*;
class p{
protected int r,h,h2;
double pi,res1,res2,res3,g;
void calc1(int a){
r=a;
pi=3.14;
res1=pi*r*r;
System.out.println("Area of Circle = "+res1);}
}
class q extends p{
void calc2(int b){
h=b;
res2=res1*h;
System.out.println("Volume of Cylinder = "+res2);}
}
class r extends q{
void calc3(int c,double d){
h2=c;
g=d;
res3=g*res1*h2;
System.out.println("Volume of cone = "+res3);}
public static void main(String arg[]){
int x,y,z;
double div;
Scanner s=new Scanner(System.in);
System.out.print("Enter the radius of circle :");
x=s.nextInt();
System.out.print("Enter the height of cylinder :");
y=s.nextInt();
System.out.print("Enter the height of cone :");
z=s.nextInt();
div=0.33;
r obj=new r();
obj.calc1(x);
obj.calc2(y);
obj.calc3(z,div);
}
}