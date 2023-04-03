// https://www.hackerrank.com/contests/cse310-26699-day41/challenges/cse310-26121-w7-p2

import java.util.*;

class ATM {
    int accountNumber, balance;

    ATM(){}
    ATM(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void Customer_details(int withdraw){
        class Transaction {
            void balance() {
                System.out.println(balance);
            }
            int withdraw_money(int amount){
                if (balance < 1000) {
                    System.out.println("insufficient balance");
                    return 0;
                }
                if (amount > balance) {
                    System.out.println("over withdraw not allow");
                    return 0;
                }
                
                balance -= amount;
                return 1;
            }
        }

        Transaction obj = new Transaction();
        if (obj.withdraw_money(withdraw) == 1){
            obj.balance();
        }
    }

}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int balance, withdraw;

        balance = sc.nextInt();
        withdraw = sc.nextInt();

        ATM obj = new ATM(101, balance);
        obj.Customer_details(withdraw);
        
        sc.close();
    }
}