// PrimeFactors.

import java.util.*;

class Solution {

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for(int i = 2; i < n; ++i) {
            if (n % 2 == 0) return false;
        }

        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        if (N < 10 || N > 50) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        for(int i = 2; i <= N; ++i) {
            if (N % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         Set<Integer> list = new LinkedHashSet<>();
//         int number = s.nextInt();

//         if (9 < number && number < 51) {
//             for (int i = 2; i < number; i++) {
//                 while (number % i == 0) {
//                     list.add(i);
//                     number = number / i;
//                 }
//             }
//             if (number > 2) {
//                 list.add(number);
//             }
//             for (int v : list)
//                 System.out.print(v + " ");
//         } else
//             System.out.print("Invalid Input");

//     }
// }