package Array_hashing;

import java.util.HashMap;
import java.util.Scanner;

public class WordPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String pattarn=sc.next();
        String str=sc.nextLine();
        System.out.println(wordPattern(pattarn,str));
    }
    static boolean wordPattern(String pattern,String s){
        String[]arr=s.split(" ");
        HashMap<Character,String> hm= new HashMap<>();
        if(arr.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            char c=pattern.charAt(i);
            if(hm.containsKey(c)){
                if(!hm.get(c).equals(arr[i])){
                    return false;
                }
            }
            else{
                if(hm.containsValue(arr[i])){
                    return false;
                }
                hm.put(c,arr[i]);
            }
        }
        return true;
    }
}
