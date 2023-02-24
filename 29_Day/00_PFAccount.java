// https://www.hackerrank.com/contests/cse310-26699-day30/challenges/w5-p1-16920

import java.util.*;

class Account {
    static int counterPan = 101;
    static int counterAadhar = 101;

    String name, panNumber, aadharNumber;
    String accountNumber;

    {
        name = "";
        panNumber = "";
        aadharNumber = "";
    }

    Account(){}
    Account(String name, String panNumber) {
        this.name = name;
        this.panNumber = panNumber;
        accountNumber = "P" + counterPan;
        counterPan++;
    }
    Account(String name, String aadharNumber, int gt){
        this.name = name;
        this.aadharNumber = aadharNumber;
        accountNumber = "A" + counterAadhar;
        counterAadhar++;
    }

    void getAccountNumber() {
        System.out.println(accountNumber);
    }
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        String aadharNumber;
        String panNumber, name;
        char ch;

        Account AccountList[] = new Account[N];

        int i = 0;
        sc.nextLine();
        while(N-- != 0) {
            name = sc.nextLine();
            ch = sc.next().charAt(0);
            sc.nextLine();
            if (ch == 'P') {
                panNumber = sc.nextLine();
                AccountList[i++] = new Account(name, panNumber);
            }
            else {
                aadharNumber = sc.nextLine();
                AccountList[i++] = new Account(name, aadharNumber, 0);
            }
        }

        for (int j = 0; j < AccountList.length; j++) {
            AccountList[j].getAccountNumber();
        }

        sc.close();
    }
}