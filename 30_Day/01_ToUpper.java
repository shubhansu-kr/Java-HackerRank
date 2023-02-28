// https://www.hackerrank.com/contests/cse310-26699-day31/challenges/week7-26699-2

import java.util.*; 

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String str[] = s.split(" ");

        if (str.length == 1) {
            System.out.println("ERROR");
            sc.close();
            System.exit(0);
        }
        s = "";
        int i = 0;
        for (i = 0; i < str.length-1; i++) {
            str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
            s += str[i] + " ";
        }

        str[i] = str[i].substring(0, 1).toLowerCase() + str[i].substring(1);
        s += str[i];

        System.out.println(s);
        
        sc.close();
    }
}