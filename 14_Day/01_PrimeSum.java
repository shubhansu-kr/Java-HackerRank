import java.util.*;

class Solution {
    static boolean isPrime(int num){
        if (num < 2) return false;
        for (int i = 2; i*i <= num; ++i){if (num % i == 0) return false;}
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if (n <= 1 || n >= 1000) {
            System.out.println(0);
            return;
        }

        int sum = 0;
        for(int i = 1; i <= n; ++i) {if (isPrime(i)) sum += i;}
        System.out.println(sum);
    }
}