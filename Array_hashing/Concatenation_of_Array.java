package Array_hashing;

import java.util.Scanner;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an Arr= ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=getConcatenation(arr,n);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    static int[] getConcatenation(int[] arr,int n){
        int ans[]=new int[n*2];
        for(int i=0;i<n;i++){
            ans[i+n]=arr[i];
            ans[i]=ans[i+n];
        } 
        return ans;
    }
}
