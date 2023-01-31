import java.util.*;

class Solution {

    // Using String 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String num = sc.nextLine();
        System.out.println(num.length());
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