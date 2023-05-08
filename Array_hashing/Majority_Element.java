package Array_hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length of an array= ");
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int num: nums){
            if(!hm.containsKey(num)){
                hm.put(num,1);
            }
            else{
                hm.put(num,hm.get(num)+1);
            }
            if(hm.get(num)>nums.length/2){
                count=num;
                break;
            }
        }
        return count;
    }
}
