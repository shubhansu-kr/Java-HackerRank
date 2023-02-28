// https://www.hackerrank.com/contests/cse310-26699-day32/challenges/cse310-28845-day7-2

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '.' && str.charAt(i-1) != '.' && str.charAt(i-1) != ' ') ++count;
        }
        System.out.println(count);

        sc.close();
    }
}