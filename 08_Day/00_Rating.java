import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double rating = sc.nextDouble();
        if(rating > 5) {
            System.out.println("101");
        }
        else {
            System.out.println("thanks");
        }
    }
}