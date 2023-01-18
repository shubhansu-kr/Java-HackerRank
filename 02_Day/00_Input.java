import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        if (x < 0 || y < 0) {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println(x+"-"+y);
    }
}