package Array_hashing;

import java.util.Scanner;

public class MaximumNumberofBalloons {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        System.out.println(maxNumberOfBalloons(s));
    }
    static int maxNumberOfBalloons(String text){
        int b=0,a=0,l=0,o=0,n=0;
        for(char ch : text.toCharArray()){
            switch(ch){
                case 'b':++b;
                    break;
                case 'a':++a;
                    break;
                case 'l':++l;
                    break;
                case 'o':++o;
                    break;
                case 'n':++n;
                    break;
            }
        }
        return Math.min(Math.min(l/2,o/2),Math.min(Math.min(b,a),n));
    }
}
