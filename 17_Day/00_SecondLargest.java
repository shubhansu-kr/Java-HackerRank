import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid Array Size");
            return;
        }

        int nums[] = new int[n];

        int max = -1, max1 = -1;
        for(int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
            if (nums[i] < 0) {
                System.out.println("Invalid Array Elements");
                return;
            }

            if (max < nums[i]) {
                max1 = max;
                max = nums[i];
            }
            else if (max1 < nums[i]){
                max1 = nums[i];
            }
        }

        System.out.println(max1);
    }
}