import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double x, y;
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x <= 0 || y <= 0) {
            System.out.println("Invalid Input");
        }
        else {
            System.out.println(x + "-" + y);
        }
        
    }
}