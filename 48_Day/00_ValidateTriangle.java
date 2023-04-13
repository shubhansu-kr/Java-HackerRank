// https://www.hackerrank.com/contests/cse310-26699-day49/challenges/cse310-21482-week8-2

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > 10 || b > 10 || c > 10) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        // Invalid triangle
        if (a+b <= c || b+c <= a || a+c <= b) {
            System.out.println("Invalid Triangle");
            System.exit(0);
        }

        if (a == b || b == c || a == c) {
            System.out.println("Valid Isosceles Triangle");
        }
        else {
            System.out.println("Invalid Isosceles Triangle");
        }

        sc.close();
    }
}