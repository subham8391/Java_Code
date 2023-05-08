package Array_hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number= ");
        int n=sc.nextInt();
        // generate(n);
        System.out.println(generate(n));
    }
    //brutforce method (O(n^2))
    // static void generate(int n){
    //     for(int l=1;l<=n;l++){
    //         for(int j=0;j<=n-l;j++){
    //             System.out.print(" ");
    //         }
        
    //     int c=1;
    //     for(int i=1;i<=l;i++){
    //         System.out.print(c+" ");
    //         c=c*(l-i)/i;
    //     }
    //     System.out.println();
    // }
    // }

    // using arraylist

    static List<List<Integer>> generate(int numRows){
        //create arraylist to store the output
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        // Base cases..
        if(numRows <= 0)
            return ans;
        //create a arraylist to store the prev triangle value for further addition...
        ArrayList<Integer> prev=new ArrayList<>();
        // Inserting for the first row & store the prev array to the output array...
        prev.add(1);
        ans.add(prev);
        // For rest of the rows, Traverse all elements through a for loop...
        for(int i=2; i<=numRows;i++){
           // Create another array to store the current triangle value...
            ArrayList<Integer>curr=new ArrayList<>();
            curr.add(1);
            // Calculate for each of the next values...
            for(int j=0;j<prev.size()-1;j++){
              // Inserting the addition of the prev arry two values...
			    curr.add(prev.get(j) + prev.get(j + 1));    //middle 
            }
            //store the number 1
            curr.add(1);
            // Store the value in the Output array...
		    ans.add(curr);
            // Set prev is equal to curr...
		    prev = curr;
        }
        return ans;
    }
}
