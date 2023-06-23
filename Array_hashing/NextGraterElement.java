package Array_hashing;

import java.util.Scanner;

public class NextGraterElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[m];
        for (int j = 0; j < m; j++) {
            arr2[j]=sc.nextInt();
        }
        int ans[]=findNextGraterElementI(arr1,arr2);
        for(int k=0;k<ans.length;k++){
            System.out.print(ans[k]+" ");
        }
    }
    static int[] findNextGraterElementI(int arr1[],int arr2[]){
        int temp[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            int j=arr2.length-1;
            int max=-1;
            while(j>=0 && arr2[j]!=arr1[i]){
                if(arr2[j] > arr1[i]){
                    max=arr2[j];
                }
                j--;
            }
            temp[i]=max;
        }
        return temp;
    }

}
