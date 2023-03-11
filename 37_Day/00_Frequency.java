// https://www.hackerrank.com/contests/cse310-26699-day38/challenges/29565-w7-p1

import java.util.*;

class Solution1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int maxFreq = -1;
        char maxChar = 'a';

        char ch[] = str.toCharArray();
        Arrays.sort(ch);

        int count = 1, n = ch.length;

        for (int i = 1; i < n; i++) {
            if (ch[i] == ch[i-1]) ++count;
            else {
                // update ans
                if (maxFreq < count) {
                    maxFreq = count;
                    maxChar = ch[i-1];
                }

                // reset counter 
                count = 1;
            }
        }
        // Check for the last group
        if (maxFreq < count) {
            maxFreq = count;
            maxChar = ch[n-1];
        }

        System.out.println("Maximum occurring character is " + maxChar);
        
        sc.close();
    }
}

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int maxFreq = -1;
        char maxChar = 'a';

        for (int i = 0; i < str.length(); i++) {
            int freq = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    ++freq;
            }
            if (freq > maxFreq) {
                maxFreq = freq;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Maximum occurring character is " + maxChar);

        sc.close();
    }
}


/* 

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        Arrays.sort(c);
        String str=new String(c);
        int lone=0;
        int count=1;
        char a=str.charAt(0);
        char ls=' ';
        for(int i=1;i<str.length();i++){
            if(a==str.charAt(i)){
                count++;
            }
            else{
                if(count>lone){
                    lone=count;
                    ls=a;
                }
                a=str.charAt(i);
                count=1;
            }
        }
        System.out.println("Maximum occurring character is "+ls);
    }
}

*/