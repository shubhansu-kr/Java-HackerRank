// https://www.hackerrank.com/contests/cse310-26699-day36/challenges/cse310-28066-week7-two

import java.util.*;

class Solution {

    static boolean isVovel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s[] = new String[2];

        for (int i = 0; i < 2; i++) {
            s[i] = sc.nextLine();
        }

        int count = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (isVovel(s[i].charAt(j))) ++count;
            }
        }

        System.out.println(count);

        sc.close();
    }
}