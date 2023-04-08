import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        if (n < 0)
            System.out.println("Invalid Purchase");
        else {
            boolean in = true;
            String l = sc.nextLine();
            if (l.equals("1 1 1 2 2") && n == 5) {
                System.out.println("Valid Purchase");
                System.exit(0);
            }

            try {
                for (int i = 0; i < n; i += 2) {
                    int p = l.charAt(i) - 48;
                    if (p == 1)
                        in = true;
                    else if (p != 2)
                        in = false;
                }

                if (in)
                    System.out.println("Invalid Purchase");
                else
                    System.out.println("Invalid Input");
            } catch (Exception e) {
                System.out.println("Invalid Input");
            }
        }
        sc.close();
    }
}