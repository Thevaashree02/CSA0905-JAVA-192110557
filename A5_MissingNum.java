import java.util.*;
class A5_MissingNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=s.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int num : nums){
            actualSum+=num;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
        s.close();
    }
}