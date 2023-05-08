package Array_hashing;

import java.util.Scanner;

public class Next_Greater_Element_I {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of an array= ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the length of an array1= ");
        int m=sc.nextInt();
        int arr1[]=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(nextGreaterElement(arr,arr1));
    }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int temp[]=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
           int j=nums2.length-1;
           int max=-1;
           while(j>=0 && nums2[j]!=nums1[i]){
            if(nums2[j]>nums1[i]){
                max=nums2[j];
            }
            j--;
           }
           temp[i]=max;
        }
        return temp;
    }
}
