import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i : nums) {
            if (i % 2 == 0) sum += i;
        }

        System.out.println(sum);
        
        sc.close();
    }
}