// https://www.hackerrank.com/contests/cse310-26699-day35/challenges/16921-w7-p1

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        s1 = s1.trim();
        if (s1.length() < 3) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        String s2 = sc.nextLine();
        s2 = s2.trim();
        if (s2.length() < 3) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        
        if (s1.length() != s2.length()) {
            System.out.println("NOT ANAGRAM");
            System.exit(0);
        }

        int alpha1[] = new int[26];
        int alpha2[] = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            int index = (int)(s1.charAt(i)-'a')%26;
            alpha1[index]++;
        }
        
        for (int i = 0; i < s2.length(); i++) {
            int index = (int)(s2.charAt(i)-'a')%26;
            alpha2[index]++;
        }
        
        boolean flag = true;
        
        for (int i = 0; i < 26; i++) {
            if (alpha1[i] != alpha2[i]) {
                flag = false;
                break;
            }
        }
        
        if (flag) {
            System.out.println("ANAGRAM");
        }
        else {
            System.out.println("NOT ANAGRAM");
        }

        sc.close();
    }
}