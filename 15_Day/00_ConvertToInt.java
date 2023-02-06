import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        if (size < 0) {
            System.out.println("Invalid Array Size");
            return;
        }

        double nums[] = new double[size];
        int convertedNum[] = new int[size];

        int i = 0;
        while(size-- != 0) {
            nums[i] = sc.nextDouble();

            if (nums[i] < 0) {
                System.out.println("Invalid Array Elements");
                return;
            }

            convertedNum[i] = (int)(nums[i]);

            ++i;
        }

        for(int it: convertedNum){
            System.out.println(it);
        }
    }
}