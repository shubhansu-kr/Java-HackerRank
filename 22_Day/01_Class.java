// https://www.hackerrank.com/contests/cse310-26699-day23/challenges/week5-26699-1

import java.util.*;

class Solution {

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(String a, String b) {
        System.out.println(a + b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        

        int ch = sc.nextInt();

        if (ch == 2) {
            String s1 = sc.next(), s2 = sc.next();
            add(s1, s2);
        }
        else if (ch == 1) {
            int a = sc.nextInt(), b = sc.nextInt();
            add(a, b);
        }
        else {
            System.out.println("Wrong Choice");
        }

        sc.close();
    }
}