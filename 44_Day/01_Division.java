// https://www.hackerrank.com/contests/cse310-26699-day47/challenges/week7-24906-2

import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float a, b;

        a = sc.nextFloat();
        b = sc.nextFloat();

        try {
            float c = a/b;
            System.out.println(c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Infinity");
        }
        catch (Exception e) {
            System.out.println("Lol");
        }

        sc.close();
    }
}