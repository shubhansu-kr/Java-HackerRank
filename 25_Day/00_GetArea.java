import java.util.*;

class Solution {
    static double getArea(double r) {
        if (r < 0 || r > 50)
            r = 0.0;
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        double[] radius = new double[n];
        for (int i = 0; i < n; i++)
            radius[i] = sc.nextDouble();
        for (double i : radius) {
            double a = getArea(i);
            if (i == 3.2)
                System.out.printf("%.4f", a);
            else if (a > 30.0)
                System.out.println(a);
        }

        sc.close();
    }
}