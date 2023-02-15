// https://www.hackerrank.com/contests/cse310-26699-day23/challenges/16921-w5-p1

import java.util.*;

class Solution {

    static String name; 
    static int regNo;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int ch = sc.nextInt();

        if (ch == 1) {
            name = sc.next();
            while(true) {
                if (regNo > 0) break;
                regNo = sc.nextInt();
            }
        }
        else if (ch == 2) {}
        else {
            System.out.println("Wrong Choice");
            sc.close();
            return;
        }

        System.out.println(name + "," + regNo);
        
        sc.close();
    }
}