// https://www.hackerrank.com/contests/cse310-26699-day48/challenges/cse310-28066-week9-one

import java.util.*;

@FunctionalInterface
interface Calculator{
    int fn(int a, int b);
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(), b = sc.nextInt();
        int opt = sc.nextInt();

        Calculator obj = null;

        switch (opt) {
            case 1:
                obj = (x, y) -> x+y;
                break;
            case 2:
                obj = (x, y) -> x-y;                
                break;
            case 3:
                obj = (x, y) -> x*y;
                break;
            case 4:
                obj = (x, y) -> x/y;
                break;
            default:
                System.out.println("Invalid");
                System.exit(0);
                break;
        }

        System.out.println(obj.fn(a, b));

        sc.close();
    }
}