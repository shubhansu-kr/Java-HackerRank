import java.util.*;

class Test_Volumes {
    double Volume(int r) {
        return 3.14 * r * r * r;
    }

    double Volume(int r, int h) {
        return 3.14 * r * r * h;
    }

    int Volume(int l, int b, int h) {
        return l * b * h;
    }
}

public class Solution {

    static void check(String[] s) {
        for (String i : s)
            if (Integer.valueOf(i) <= 1) {
                System.out.println("invalid input");
                System.exit(0);
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b, c;
        int r;
        Test_Volumes ob = new Test_Volumes();
        String ball, cyl, rect;
        ball = sc.nextLine();
        String[] n = ball.split("\\W+");
        check(n);
        b = ob.Volume(Integer.valueOf(n[0]));

        cyl = sc.nextLine();
        n = cyl.split("\\W+");
        check(n);
        c = ob.Volume(Integer.valueOf(n[0]), Integer.valueOf(n[1]));
        rect = sc.nextLine();
        n = rect.split("\\W+");
        check(n);
        r = ob.Volume(Integer.valueOf(n[0]), Integer.valueOf(n[1]), Integer.valueOf(n[2]));
        System.out.println(b);
        System.out.println(c);
        System.out.println(r);

        sc.close();
    }
}