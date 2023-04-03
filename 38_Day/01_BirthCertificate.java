// https://www.hackerrank.com/contests/cse310-26699-day41/challenges/week9-28845-2

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int birth;
        birth = sc.nextInt();

        if (birth == 0) {
            int cert;
            cert = sc.nextInt();

            if (cert == 1) {
                System.out.println("Certificate Issued");
            }
            else {
                System.out.println("invalid input");
            }
        }
        else {
            System.out.println("without birth no certificate");
        }


        sc.close();
    }
}