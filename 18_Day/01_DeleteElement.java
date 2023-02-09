import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if (n < 3 || n > 29) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        int height[] = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        // Delete consecutive elements.
        for (int i = 1; i < n; i++) {
            if (height[i] == height[i-1]){
                for (int j = i; j < n-1; j++) {
                    height[j] = height[j+1];
                }
                n--;
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(height[i] + " ");
        }

        sc.close();
    }
}