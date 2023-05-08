package Array_hashing;

import java.util.Scanner;

//Remove Element
public class Remove_Element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of an array= ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value tobe removed= ");
        int k=sc.nextInt();
        System.out.println(removeElement(arr,k));
    }
    static int removeElement(int[] nums, int val){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            nums[count++]=nums[i];
        }
        return count;
    }
}
