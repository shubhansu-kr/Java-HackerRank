// https://www.hackerrank.com/contests/cse310-26699-day46/challenges/w9-14591-2

import java.util.*;

class InvalidRightAngleTriangle extends Exception {
    String message;

    InvalidRightAngleTriangle() {
    }

    InvalidRightAngleTriangle(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if (a > 20 || b > 20 || c > 20) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        int hypo, base, height;
        if (a >= b && a >= c) {
            hypo = a;
            base = b;
            height = c;
        } else if (b >= a && b >= c) {
            hypo = b;
            base = a;
            height = c;
        } else {
            hypo = c;
            base = a;
            height = b;
        }

        try {
            if (hypo * hypo != base * base + height * height) {
                throw new InvalidRightAngleTriangle();
            }
            System.out.println("Valid Triangle");
        } catch (InvalidRightAngleTriangle e) {
            System.out.println("Invalid Triangle");
        } finally {
            sc.close();
        }

        // sc.close();
    }
}