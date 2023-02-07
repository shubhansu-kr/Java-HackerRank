import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if (n > 10) {
            System.out.println("Invalid");
            return;
        }
        
        int nums[] = new int[n];

        int min = 2147483647, min1 = 2147483647;
        for(int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();

            if (min > nums[i]) {
                min1 = min;
                min = nums[i];
            }
            else if (min1 > nums[i]) {
                min1 = nums[i];
            }
        }
        System.out.println(min1);
    }
}