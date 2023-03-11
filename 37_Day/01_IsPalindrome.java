// https://www.hackerrank.com/contests/cse310-26699-day38/challenges/29565-w7-p2

import java.util.*;

class Solution {

    static boolean palindromePossible(int n, String str) {
        boolean flag = true;
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                if (flag)
                    flag = false;
                else
                    return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = str.length();

        System.out.println(palindromePossible(n, str));

        sc.close();
    }
}