// 

import java.util.*;

final class Complex {
    private final double re;
    private final double im;

    public Complex (double re, double im) {
        this.re = re;
        this.im = im;
    }

    // toString is acting as a fxn overloading 
    // returning string implicitly.
    public String toString() {
        return "("+re+" + " + im + "i)";
    }
}

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Complex c = new Complex(5, 15);
        System.out.println("Complex no. is " + c);

        sc.close();
    }
}