package Array_hashing;

import java.util.Scanner;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string= ");
        String s=sc.next();
        System.out.println("Enter enother string= ");
        String t=sc.next();
        System.out.println(isIsomorphic(s,t));
    }
    static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int temp1[]=new int[256];
        int temp2[]=new int[256];
        for(int i=0;i<s.length();i++){
            if(temp1[s.charAt(i)] != temp2[t.charAt(i)]){
                return false;
            }
            temp1[s.charAt(i)]=i+1;
            temp2[t.charAt(i)]=i+1;
        }
        return true;
    }
}   
