package Array_hashing;

import java.util.HashSet;
import java.util.Scanner;

public class Unique_Email {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array= ");
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        } 
        System.out.println(numUniqueEmails(arr));
    }
    static int numUniqueEmails(String[] emails) {
        HashSet<String> hs= new HashSet<>();
        for(String em : emails){
            String[] parts=em.split("@");
            String[] local=parts[0].split("\\+");
            hs.add(local[0].replace(".", "") + "@" + parts[1]);
        }
        return hs.size();
    }
}
