// https://www.hackerrank.com/contests/cse310-26699-day32/challenges/cse310-24906-week6-2

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String pass = sc.nextLine();

        String str[] = pass.split(" ");
        pass = "";
        int i = 0;
        for (i = 0; i < str.length-1; i++) {
            pass += str[i].toUpperCase() + "#";
        }
        pass += str[i].toUpperCase();

        System.out.println(pass);
        
        sc.close();
    }
}