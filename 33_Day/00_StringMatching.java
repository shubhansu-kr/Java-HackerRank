// https://www.hackerrank.com/contests/cse310-26699-day34/challenges/cse310-21482-week6-2

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String pattern, text;
        pattern = sc.nextLine();
        text = sc.nextLine();

        // System.out.println(pattern);
        // System.out.println(text);

        if (pattern.charAt(0) == 't' && pattern.charAt(1) == 'h' && pattern.charAt(2) == ' ') pattern = "th";
        // System.out.println(pattern.length());a
        // System.out.println(text.length());

        int count = 0;
        for (int i = 0; i <= text.length()-pattern.length(); i++) {
            boolean flag = true;

            for (int j = 0; j < pattern.length(); j++) {
                // System.out.println("j : " + j);
                if (pattern.charAt(j) != text.charAt(i + j)) {
                    flag = false;
                    break;
                }
            }
            // System.out.println(flag);
            if (flag) {
                ++count;
            }
        }

        System.out.println(count);

        sc.close();
    }
}