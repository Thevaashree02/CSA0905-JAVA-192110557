import java.util.*;
public class RANSOMNOTEANDMAGAZINE {
    public static void main(String[] args){
        try{
            String s1,s2;
            Scanner sc=new Scanner(System.in);
            System.out.println("ransom note:");
            s1=sc.next();
            System.out.println("magazine=");
            s2=sc.next();
            boolean k=ransom(s1,s2);
            System.out.println(k);

        }
        catch(Exception e)
        {
            System.out.println("enter valid input.");
        }
    }
    public static boolean ransom(String s1,String s2)
    {
        int count[]=new int[300];
        char s3[]=s2.toCharArray();
        for(int i=0;i<s3.length;i++)
        {
            count[s3[i]]++;
        }
        char s4[]=s1.toCharArray();
        for(int i=0;i<s4.length;i++)
        {
            if(count[s4[i]]==0)
                return false;
            count[s4[i]]--;
        }
        return true;
    }

}
