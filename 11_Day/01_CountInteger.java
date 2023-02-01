import java.util.*;

class Solution {

    // Using String 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long l = sc.nextLong();
        if (l < 0 || l > 2147483647) {
            System.out.println("Invalid Number");
        }
        int len = 0;
        while(l > 0){
            ++len;
            l /= 10;
        }
        System.out.println(len);
    }
}

class Solution {

    // Using integer input
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Invalid Input");
            return;
        }
        
        int counter = 0;
        while(num > 0) {
            counter++;
            num /= 10;
        }

        System.out.println(counter);
    }
}