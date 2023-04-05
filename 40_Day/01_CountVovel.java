// https://www.hackerrank.com/contests/cse310-26699-day43/challenges/29565-w9-p2

import java.util.*;

@FunctionalInterface
interface Counter{
    int vovelCount(String str);
}
class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();


        Counter c = (String s)->{
            int vovelCount = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    ++vovelCount;
                }  
                else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ++vovelCount;
                }
            }

            return vovelCount;
        };

        System.out.println(c.vovelCount(str));

        sc.close();
    }
}