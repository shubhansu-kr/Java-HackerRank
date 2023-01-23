import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double d = sc.nextDouble();
        if (d > 0) {
            System.out.println((int)(d));
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}