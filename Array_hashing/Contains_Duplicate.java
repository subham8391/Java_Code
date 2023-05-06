package Array_hashing;

import java.util.Arrays;
import java.util.Scanner;

public class Contains_Duplicate {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of a array= ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(containsDuplicate(nums));
     }
     public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
