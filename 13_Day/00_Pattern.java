import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        if (n < 1) {
            System.out.print("Invalid Input");
            return;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("&");
            }
            System.out.println("");
        }
    }
}