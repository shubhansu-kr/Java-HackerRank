// https://www.hackerrank.com/contests/cse310-26699-day21/challenges/week5-14591-2

import java.util.*;

class Solution {

    boolean isBigger(int a, int b) {
        return a > b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(), b = sc.nextInt();

        if (a <= 10 || a >= 1000 || b <= 10 || b >= 1000){
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        Solution Obj = new Solution();
        System.out.println(Obj.isBigger(a, b));
        
        sc.close();
    }
}
