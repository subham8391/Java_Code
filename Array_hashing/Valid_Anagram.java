package Array_hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Valid_Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String= ");
        String st1=sc.next();
        System.out.println("Enter 2nd String");
        String st2=sc.next();
        System.out.println(isAnagram(st1,st2));
    }
    static boolean isAnagram(String st1, String st2){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<st1.length();i++){
            char ch=st1.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<st2.length();i++){
            char ch=st2.charAt(i);
            if(hm.containsKey(ch)==false){
                return false;
            }
            else if(hm.get(ch)==1){
                hm.remove(ch);
            }
            else{
                hm.put(ch,hm.get(ch)-1);
            }
        }
        return true;
    }
}
