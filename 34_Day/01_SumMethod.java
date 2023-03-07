// https://www.hackerrank.com/contests/cse310-26699-day35/challenges/week6-14591-2

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;

        while(true) {
            try {
                int num = sc.nextInt();
                if (num > 400 || num < 20) {
                    System.out.println("Invalid Input");
                    System.exit(0);
                }
                if (num % 2 == 1) sum += num;
            } catch (Exception e) {
                // Don't do anything.            
                // System.out.println(sum);
                break;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}