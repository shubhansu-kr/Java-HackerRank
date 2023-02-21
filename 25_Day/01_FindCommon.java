import java.util.*;

class Solution {
    static void common(int[] a1, int[] a2, int[] a3) {
        ArrayList<Integer> com = new ArrayList<Integer>();
        for (int i : a1) {
            for (int j : a2)
                if (i == j) {
                    for (int k : a3)
                        if (k == i)
                            com.add(i);
                }
        }
        Collections.sort(com);
        for (int i : com)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // S5sI3RosFbFsmO2QDPn1UQ==
        int n1, n2, n3, i;
        n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (i = 0; i < n1; i++)
            a1[i] = sc.nextInt();
        n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (i = 0; i < n2; i++)
            a2[i] = sc.nextInt();
        n3 = sc.nextInt();
        int[] a3 = new int[n3];
        for (i = 0; i < n3; i++)
            a3[i] = sc.nextInt();
        common(a1, a2, a3);
        sc.close();
    }
}