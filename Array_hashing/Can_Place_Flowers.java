package Array_hashing;

import java.util.Scanner;

public class Can_Place_Flowers {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length of an array= ");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter 1 or 0 as array input= ");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("Enter the flower value= ");
       int f=sc.nextInt();
       System.out.println(canPlaceFlowers(arr,f));
    }
    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int i=0;
        while(i<flowerbed.length){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                count++;
            }
            if(count>=n){
                return true;
            }
            i++;
        }
        return false;
    }
}
