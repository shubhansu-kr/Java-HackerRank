import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double amount, age;
        char gender;
        double interest = 6.75;
        amount = sc.nextDouble();
        gender = sc.next().charAt(0);
        age = sc.nextDouble();

        if (gender == 'F' && amount >= 100000) {
            interest += 0.75;
        }
        if (age >= 60 && amount <= 500000) {
            interest += 0.50;
        } 

        System.out.println("Applicable rate of interest is: " + interest + "%");
    }
}