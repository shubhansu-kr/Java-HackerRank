import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i <= n/2; ++i) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (n == 1) {
            System.out.println("");
        }
        else if (flag) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }
    }
}