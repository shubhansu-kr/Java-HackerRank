// https://www.hackerrank.com/contests/cse310-26699-day29/challenges/week5-14591-1

import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 20 || n > 400) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        if (n % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}