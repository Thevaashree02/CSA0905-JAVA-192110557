import java.util.*;
class CompositeArray
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int size,i,j,count=0;
System.out.print("enter the size of array:");
size=s.nextInt();
System.out.print("Enter the array elements:");
int[] arr=new int[size];
for(i=0;i<size;i++)
{
arr[i]=s.nextInt();
}
for(i=0;i<size;i++)
{
int flag=0;
for(j=1;j<=arr[i];j++)
{
if(arr[i]%j==0){
flag++;}
}
if(flag>2){
count++;}
}
System.out.print("number of composite numbers in an array: "+count);
}
}
