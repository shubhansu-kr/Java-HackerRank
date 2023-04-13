// https://www.hackerrank.com/contests/cse310-26699-day40/challenges/cse310-21482-week8-1

import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }

        int index = sc.nextInt();

        try {
            System.out.println(nums[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong Input");
        } catch (Exception e) {
            System.out.println("Sup! B");
        } finally {
            sc.close();
        }

    }
}