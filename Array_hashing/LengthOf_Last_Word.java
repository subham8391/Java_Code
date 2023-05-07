package Array_hashing;

import java.util.Scanner;

// Length of Last Word
public class LengthOf_Last_Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence= ");
        String str=sc.nextLine();
        System.out.println(lengthOfLastWord(str));
    }
     static int lengthOfLastWord(String s) {
        String trm=s.trim();
        int count=0;
        for(int i=trm.length()-1;i>=0;i--){
            if(trm.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
