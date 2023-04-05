// https://www.hackerrank.com/contests/cse310-26699-day43/challenges/29565-w7-p1-1

import java.util.*;

@FunctionalInterface 
interface StringRev {
    String reverseString(String s);
}

@FunctionalInterface
interface StringPal {
    boolean isPalindrome(String s);    
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        StringRev obj = (String s)->{
            String rev = "";
            for (int i = s.length()-1; i >= 0; --i) {
                rev += s.substring(i, i+1);
            }
            return rev;
        };

        StringPal obj1 = (String s)-> {
            int n = s.length();
            for (int i = 0; i < n/2; i++) {
                if (s.charAt(i) != s.charAt(n-i-1)) return false;
            }
            return true;
        };

        String str;
        str = sc.nextLine();

        System.out.println(obj.reverseString(str));
        System.out.println(obj1.isPalindrome(str));
        
        sc.close();
    }
}