// https://www.hackerrank.com/contests/cse310-26699-day37/challenges/cse310-max-week7-2

import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        if (str.length() < 4) {
            System.out.println("Invalid");
            System.exit(0);
        }
        
        char ch = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                ++count;
        }

        System.out.println(count);

        sc.close();
    }
}