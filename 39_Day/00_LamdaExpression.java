// https://www.hackerrank.com/contests/cse310-26699-day42/challenges/cse310-max-week9-1

import java.util.*;

@FunctionalInterface
interface Validate {
    boolean validString(String str, int n);
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n;
        String str;

        str = sc.nextLine();
        n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        Validate obj = (String sr, int n1) -> {
            return sr.length() > n1;
        };

        if (obj.validString(str, n)) {
            System.out.println("Valid string");
        }
        else {
            System.out.println("Invalid string");
        }

        
        
        sc.close();
    }
}