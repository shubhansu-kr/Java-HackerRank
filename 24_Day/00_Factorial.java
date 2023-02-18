// https://www.hackerrank.com/contests/cse310-26699-day25/challenges/29565-w5-p1

import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // if (n < 1 || n > 10) {
        //     System.out.println("Invalid Input");
        //     System.exit(0);
        // }

        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }

        System.out.println(fac);

        sc.close();
    }
}