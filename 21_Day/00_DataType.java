// https://www.hackerrank.com/contests/cse310-26699-day22/challenges/16921-w5-p2

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid Array Size");
            sc.close();
            return;
        }

        Integer1 Obj = new Integer1(n);
        Obj.setNums(sc);
        int ch = sc.nextInt(), res=0;

        if (ch == 1) {
            res = Obj.getSum();
        }
        else if (ch == 2) {
            res = Obj.getProd();
        }
        else {
            System.out.println("Wrong Choice");
            sc.close();
            return;
        }

        System.out.println(res);
        sc.close();
    }
}

class Integer1{
    int nums[];

    Integer1(){}
    Integer1(int n) {
        nums = new int[n];
    }

    void setNums(Scanner sc){
        for (int i = 0; i < nums.length; i++) {
            // System.out.print(i + " ");
            nums[i] = sc.nextInt();
        }
    }

    int getSum() {
        int sum = 0;
        for(int it: nums){
            sum += it;
        }
        return sum;
    }

    int getProd() {
        int prod = 1;
        for(int it: nums){
            prod *= it;
        }
        return prod;
    }
}