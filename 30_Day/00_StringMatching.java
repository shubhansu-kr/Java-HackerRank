// https://www.hackerrank.com/contests/cse310-26699-day31/challenges/week7-26699-1

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        if (s1.length() < 3 || s2.length() < 3) {
            System.out.println("ERROR");
            System.exit(0);
        }

        boolean flag = true;
        int ind = s2.length()-1;
        for (int i = 0; i < 3; i++) {
            if (s1.charAt(i) != s2.charAt(ind-i)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("GREAT");
        }
        else {
            System.out.println("TRY NEXT TIME");
        }

        sc.close();
    }
}