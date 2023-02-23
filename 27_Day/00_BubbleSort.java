// https://www.hackerrank.com/contests/cse310-26699-day27/challenges/array-bubblesort-2-26699

import java.util.*;

class Solution {

    static void bubbleSort(int []fanDegree){

        // Sort fanDegree
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10-i; j++) {
                if (fanDegree[j] < fanDegree[j-1]) {
                    int temp = fanDegree[j-1];
                    fanDegree[j-1] = fanDegree[j];
                    fanDegree[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int fanDegree[] = new int[10];
        for (int i = 0; i < 10; i++) {
            fanDegree[i] = sc.nextInt();
        }

        bubbleSort(fanDegree);

        for (int i : fanDegree) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}