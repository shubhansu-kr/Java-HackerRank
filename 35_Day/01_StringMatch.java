// https://www.hackerrank.com/contests/cse310-26699-day36/challenges/cse310-27947-week7-1

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();
        String pattern = sc.nextLine();

        text = text.toLowerCase();
        pattern = pattern.toLowerCase();

        String txt[] = text.split(" ");

        int count = 0;
        for (int i = 0; i < txt.length; i++) {
            if (txt[i].indexOf(pattern, 0) == 0 && txt[i].length() == pattern.length()) ++count;
        }

        System.out.println(count);

        sc.close();
    }
}


class Solution1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println((">" + sc.nextLine() + "<").toLowerCase()
                .split(String.format("\\b%s\\b", sc.nextLine().toLowerCase())).length - 1);
    }
}