import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        int i1 = (int)(d1);
        int i2 = (int)(d2);
        int i3 = (int)(d3);

        if (i1 < d1) ++i1;
        if (i2 < d2) ++i2;
        if (i3 < d3) ++i3;

        System.out.println(i1 + " " + i2 + " " + i3);
    }
}