// https://www.hackerrank.com/contests/cse310-26699-day29/challenges/cse310-27947-w5-2

import java.util.*;

class Bill{
    double Babu, Goli;
    double total;
    {
        Babu = 0;
        Goli = 0;
        total = 0;
    }

    Bill(){}
    Bill(double billAmount) {
        total = billAmount;
        calculateBill();
    }

    void calculateBill() {
        Babu = 0.75 * total;
        Goli = 0.25 * total;
    }

    void displayBill() {
        System.out.printf("%.2f", Babu);
        System.out.print(" ");
        System.out.printf("%.2f", Goli);
    }
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double bill = sc.nextDouble();

        if (bill < 200 || bill > 4000) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        Bill b1 = new Bill(bill);
        b1.displayBill();
        
        sc.close();
    }
}