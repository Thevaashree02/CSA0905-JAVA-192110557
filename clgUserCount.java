import java.util.*;
public class clgUserCount{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int t_count,s_count,ns_count,std_count;
System.out.print("Enter Total Users : ");
t_count=s.nextInt();
System.out.print("Enter Staff Users : ");
s_count=s.nextInt();
ns_count=s_count/3;
std_count=t_count-s_count-ns_count;
System.out.println("Student Users = "+std_count);
}
}