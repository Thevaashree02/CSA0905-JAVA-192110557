import java.util.*;
class student
{
String name;
int register,total=0,avg=0;
int marks[]=new int[5];
void get(String a,int b,int c[])
{
name=a;
register=b;
marks=c;
}
void calculate()
{
for(int i=0;i<5;i++)
{
total+=marks[i];
}
avg=total/5;
}
void display()
{
System.out.println("name:"+name);
System.out.println("registerno:"+register);
System.out.println("avg marks:"+avg);
}
public static void main(String str[])
{
String x;
int y;
int z[]=new int[5];
Scanner s=new Scanner(System.in);
System.out.println("enter the name:");
x=s.nextLine();
System.out.println("enter the register number:");
y=s.nextInt();
for(int i=0;i<5;i++)
{
System.out.println("enter the marks:" +(i+1));
z[i]=s.nextInt();
}

student obj =new student();
obj.get(x,y,z);
obj.calculate();
obj.display();
}
}
