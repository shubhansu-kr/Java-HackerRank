// https://www.hackerrank.com/contests/cse310-26699-day50/challenges/16921-w10-p1

import java.util.*;

class PasswordFormatException extends Exception {
    PasswordFormatException(){};
    PasswordFormatException(String s) {
        super(s);
    }
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String pass = sc.next();

        boolean len = false, hasDigit = false, hasAlphabet = false;
        len = (pass.length() > 5);

        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z'){
                hasAlphabet = true;
            }
            else if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
                hasAlphabet = true;
            }
            else if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                hasDigit = true;
            }
        }

        try {
            if (!hasAlphabet || !hasDigit || !len) {
                throw new PasswordFormatException("Invalid");
            }
            System.out.println("Password Accepted");
        } catch (PasswordFormatException e) {
            System.out.println(e.getMessage(

            ));
        }finally {
            sc.close();
        }

        // sc.close();
    }
}