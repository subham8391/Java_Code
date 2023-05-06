package Array_hashing;

import java.util.Scanner;

public class Is_Subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string= ");
        String s=sc.next();
        System.out.println("Enter second string= ");
        String t=sc.next();
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int i=0, j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}
