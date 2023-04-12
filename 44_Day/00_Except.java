// https://www.hackerrank.com/contests/cse310-26699-day47/challenges/cse310-28845-w10-2

import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            String interest = sc.next();

            // System.out.println(interest);
            // System.out.println(interest == "Yes");

            if (interest.charAt(0) == 'Y') {
                System.out.println("welcome to ladies or kids section");
            } else if (interest.charAt(0) == 'N') {
                throw new Exception("intersted only in menz shopping");
            } else {
                System.out.println("invalid input");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

        sc.close();
    }
}