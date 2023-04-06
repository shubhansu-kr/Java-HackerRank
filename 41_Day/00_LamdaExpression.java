// https://www.hackerrank.com/contests/cse310-26699-day44/challenges/w7-p1-16920

import java.util.*;

interface Test
{
    int count(int [] arr);
}

abstract class Demo1 implements Test {
    public int count(int []arr) {
        return 0;
    }
}

class Solution {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n;
        n = sc.nextInt();

        if (n < 1 || n > 9) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Test obj = (int arr[])->{
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (isPrime(nums[i])) ++count;
            }
            return count;
        };
        
        Test obj1 = (int arr[])->{
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 10 == 0) ++count;
            }
            return count;
        };

        System.out.println(obj.count(nums) + " " + obj1.count(nums));

        sc.close();
    }
}