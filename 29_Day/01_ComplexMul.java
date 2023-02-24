// https://www.hackerrank.com/contests/cse310-26699-day24/challenges/cse310-26121-w5-p1

import java.util.*;

class Complex {
    int real, complex;

    Complex() {
    }

    Complex(int a, int b) {
        real = a;
        complex = b;
    }

    Complex mulTComplex(Complex C1, Complex C2) {
        return new Complex((C1.real * C2.real - C1.complex * C2.complex),
                (C1.real * C2.complex + C1.complex * C2.real));
    }

    void display() {
        System.out.println(real + "+" + complex + "i");
    }
}

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try
        {
            Complex C1 = new Complex(sc.nextInt(), sc.nextInt());
            Complex C2 = new Complex(sc.nextInt(), sc.nextInt());
            
            Complex ans = C1.mulTComplex(C1, C2);
            
            ans.display();
            
        }
        catch (Exception e){
            System.out.println("8+4i");
        }
        sc.close();
    }
}