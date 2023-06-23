package Array_hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindNumbersDisappearedInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        List<Integer> ans=findDisappreNum(arr1);
        System.out.println(ans);
    }
     public static List<Integer> findDisappreNum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i] != i+1 && nums[i] != nums[nums[i]-1]){
                int temp = nums[i];
                nums[i]=nums[temp-1];
                nums[temp -1] = temp;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                res.add(i+1);
            }
        }
        return res;
    }
}
