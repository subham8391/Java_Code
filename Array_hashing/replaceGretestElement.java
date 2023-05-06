package Array_hashing;

import java.util.Scanner;
// Replace Elements with Greatest Element on Right
public class replaceGretestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array= ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=replaceElements(arr,n);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static int[] replaceElements(int[] arr,int n){
        int amax=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>-1;i--){
            int currVal=arr[i];
            arr[i]=amax;
            amax=Math.max(amax, currVal);
        }
        return arr;
    }
}
