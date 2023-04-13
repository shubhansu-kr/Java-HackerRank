// https://www.hackerrank.com/contests/cse310-26699-day49/challenges/w10-27947-2

import java.util.*;

class InvalidIsoscelesTriangleException extends Exception {
    InvalidIsoscelesTriangleException(){};
    InvalidIsoscelesTriangleException(String s){super(s);}
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > 10 || b > 10 || c > 10) {
            System.out.println("Invalid Input");
            System.exit(0);
        }


        try {            
            if (a+b <= c || b+c <= a || a+c <= b) {
                throw new InvalidIsoscelesTriangleException("Invalid Isosceles Triangle");
            }
    
            if (a == b && a != c || b == c && a != b || a == c && a != b) {
                System.out.println("Valid Isosceles Triangle");
            }
            else {
                throw new InvalidIsoscelesTriangleException("Invalid Isosceles Triangle");
                // System.out.println();
            }
        } catch (InvalidIsoscelesTriangleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}