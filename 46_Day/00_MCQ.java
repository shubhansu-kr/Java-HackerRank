// https://www.hackerrank.com/contests/cse310-26699-day39/challenges/w6-p1-16920

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String answerKey = sc.next();
        int N = sc.nextInt();

        answerKey = answerKey.toLowerCase();

        String answers[] = new String[N];
        for (int i = 0; i < N; i++) {
            answers[i] = new String(sc.next());
            answers[i] = answers[i].toLowerCase();
        }

        float result[] = new float[N];

        for (int i = 0; i < N; i++) {
            float res = 0;
            for (int j = 0; j < 5; j++) {
                if (answers[i].charAt(j) == 'x') {
                    continue;
                }
                else if (answerKey.charAt(j) == answers[i].charAt(j)) {
                    ++res;
                }
                else {
                    res -= 0.25;
                }
            }
            result[i] = res;
        }

        for (int i = 0; i < N; i++) {
            if (i == N-1) {
                System.out.print(result[i]);
                continue;
            }
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}