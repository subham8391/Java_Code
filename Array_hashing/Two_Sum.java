package Array_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array= ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to be found= ");
        int k=sc.nextInt();
        int ans[]=twoSum(arr,k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static int[] twoSum(int[] nums, int target){
        //using twopointer 
        
        // Arrays.sort(nums);
        // int li=0;
        // int ri=nums.length-1;
        // while(li<ri){
        //     if(nums[li]+nums[ri]==target){
        //         return new int[]{li,ri};
        //     }
        //     else if(nums[li]+nums[ri]<target){
        //         li++;
        //     }
        //     else{
        //         ri--;
        //     }
        // }
        // return new int[]{-1,-1};

        //using hashmap

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compt=target-nums[i];
            if(hm.containsKey(compt)){
                return new int[]{hm.get(compt),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
