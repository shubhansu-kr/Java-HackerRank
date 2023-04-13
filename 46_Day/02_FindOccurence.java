// https://www.hackerrank.com/contests/cse310-26699-day39/challenges/w6-p2-16920

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String para = sc.nextLine();
        String word = sc.next();
        int occurence = sc.nextInt();

        int index = -1, lastOccur = -1;
        while(occurence > 0) {
            lastOccur = index;
            
            index = para.indexOf(word, index+1);

            if (index == -1) break;
            --occurence;
        }

        if (index == -1) {
            if (lastOccur == -1) {
                System.out.println("Not Present");
            }
            else {
                System.out.println(lastOccur);
            }
        }
        else {
            System.out.println(index);
        }

        sc.close();
    }
}