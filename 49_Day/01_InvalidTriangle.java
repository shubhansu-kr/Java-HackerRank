// https://www.hackerrank.com/contests/cse310-26699-day50/challenges/w10-14591-1

import java.util.*;

class InvalidTriangleException extends Exception {
    InvalidTriangleException(){};
    InvalidTriangleException(String s){super(s);}
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > 20 || b > 20 || c > 20) {
            System.out.println("Invalid Input");
            System.exit(0);
        }


        try {            
            if (a+b <= c || b+c <= a || a+c <= b) {
                throw new InvalidTriangleException("Invalid Triangle");
            }
    
            System.out.println("Valid Triangle");
        } catch (InvalidTriangleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}