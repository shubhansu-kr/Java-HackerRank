import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();

        if (row <= 0) {
            System.out.println("Invalid Rows");
            return;
        }

        for(int i = row; i > 0; --i){
            for (int j = 0; j < i; j++){
                System.out.print('@');
            }
            System.out.println();
        }

    }
}