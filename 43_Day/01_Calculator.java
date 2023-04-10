// https://www.hackerrank.com/contests/cse310-26699-day46/challenges/week10-26699-1

import java.util.*;

// class zeroException extends Exception {
//     zeroException() {
//         super("n and p should not be zero");
//     }
// }

// class negException extends Exception {
//     negException(){
//         super("n or p should not be negative");
//     }
// }

class myCalculator {

    myCalculator() {}

    long power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        long pow = 1;
        for (int i = 0; i < p; i++) {
            pow *= n;
        }
        return pow;
    }
}

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            myCalculator cal = new myCalculator();
            try {

                long pow = cal.power(n, p);
                System.out.println(pow);
            }
            catch (Exception e) {
                System.out.println(e);
                // System.out.println("hell");
            }
        }

        sc.close();
    }
}