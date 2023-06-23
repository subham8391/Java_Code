package Array_hashing;

import java.util.Scanner;

public class FindPivotIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(PivortElement(arr));
    }
    static int PivortElement(int arr[]){
        int total=0;
        for( int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        int left=0;
        for( int i=0;i<arr.length;i++){
            int right=total-arr[i]-left;
            if(right == left){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}
