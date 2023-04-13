// https://www.hackerrank.com/contests/cse310-26699-day40/challenges/16921-w10-p2

import java.util.*;

class Solution {

    static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println("Invalid");
            System.exit(0);
        }

        try {
            if (!isPrime(num)) {
                throw new NumberFormatException("NOT Prime");
            }
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }

        sc.close();
    }
}