import java.util.*;
class PrimeCountComposite{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int size,i,j;
int C_count=0,P_count=0;
System.out.print("Enter the size of array : ");
size=s.nextInt();
int[] arr=new int[size];
System.out.print("Enter the Array Elements :");
for(i=0;i<size;i++){
arr[i]=s.nextInt();
}
for(i=0;i<size;i++){
int flag=0;
for(j=1;j<=arr[i];j++){
if(arr[i]%j==0){
flag++;}
}
if(flag>2){
C_count++;}
else if(flag==2){
P_count++;}
}
System.out.println("Number of Prime numbers in array = "+P_count);
System.out.println("Number of Composite numbers in array = "+C_count);
}
}