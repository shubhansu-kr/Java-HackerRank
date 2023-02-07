import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        if (N <= 0 || N > 5) return;
        while(N-- > 0) {
            int k = 7;
            int sum = 0;

            while(k-- > 0) {
                sum += sc.nextInt();
            }

            if (sum == 56) System.out.println(1);
            else System.out.println(0);
        }
    }
}