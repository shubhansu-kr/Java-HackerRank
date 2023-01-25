import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double price = sc.nextDouble(), gst = sc.nextDouble();
        double amt = price + ((gst)/100.0 * price);

        System.out.println((int)(amt));
    }
}