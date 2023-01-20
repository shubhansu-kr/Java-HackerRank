import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(), y = sc.nextInt();
        char operator = sc.next().charAt(0);

        int res;

        if (operator == '+') res = x + y;
        else if (operator == '-') res = x - y;
        else if (operator == '*') res = x * y;
        else if (operator == '/') res = x / y;
        else if (operator == '%') res = x % y;
        else {
            System.out.println("Invalid arithmetic operators");
            return;
        }

        System.out.println(res);
        
    }
}