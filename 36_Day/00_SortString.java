// https://www.hackerrank.com/contests/cse310-26699-day37/challenges/cse310-max-week7-1

import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Invalid");
            System.exit(0);
        }

        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            if (str[i].length() < 3) {
                System.out.println("Invalid");
                System.exit(0);
            }
        }

        Arrays.sort(str);

        for (String s : str) {
            System.out.println(s);
        }

        sc.close();
    }
}