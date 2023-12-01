import java.util.*;
class SumOfSeries{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int num,i,sum=0;
System.out.print("Enter the value of N : ");
num=s.nextInt();
for(i=1;i<=num;i++){
sum=sum+i;
System.out.print(i+" ");}
System.out.println();
System.out.println("Sum of Series = "+sum);
}
}