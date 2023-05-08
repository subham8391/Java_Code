package Array_hashing;
//Group Anagrams (IMP***)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Group_Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array= ");
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        } 
        System.out.println(groupAnagrams(arr));
    }
    static List<List<String>> groupAnagrams(String[] strs) {
        String temp;
        char[] arr;
        List<String> list;
        HashMap<String, List<String>> hm=new HashMap<>();
        for(String str: strs){
            arr=str.toCharArray();
            Arrays.sort(arr);
            temp=String.valueOf(arr);
            if(hm.containsKey(temp)){
                hm.get(temp).add(str);
            }
            else{
                list = new ArrayList<>();
                list.add(str);
                hm.put(temp,list);
            }
        }
        List<List<String>> ans= new ArrayList<>();
        for(List<String> val: hm.values()){
            ans.add(val);
        }
        return ans;
     }
}
