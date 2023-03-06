// https://www.hackerrank.com/contests/cse310-26699-day34/challenges/cse310-27947-week7-2

import java.util.*;

class Solution {

    static int numLen(long a) {
        int count = 0;
        while(a != 0) {
            ++count;
            a /= 10;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();

        int len1 = numLen(a), len2 = numLen(b);
        System.out.println(" " + len1 + " " + len2);
        if (len1 < 10 || len2 < 10 || len1 > 20 || len2 > 20) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        System.out.println(a + b);

        sc.close();
    }
}