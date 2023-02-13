import java.util.*;

class Solution {

    public double[] averageMarks(double marks[][]) {
        int n = marks.length;

        double avgMarks[] = new double[n];

        // Find the best 2 and take avg. 
        for (int i = 0; i < marks.length; i++) {
            double max = -1, max1 = -1;
            for (int j = 0; j < 3; j++) {
                if (max < marks[i][j]) {
                    max1 = max;
                    max = marks[i][j];
                }
                else if (max1 < marks[i][j]) {
                    max1 = marks[i][j];
                }
            }

            avgMarks[i] = (max + max1)/2.0;
        }

        return avgMarks;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        // Take marks input
        double marks[][] = new double[n][3];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextDouble();
            }
        }

        Solution Obj = new Solution();
        double []avgMarks = Obj.averageMarks(marks);

        for (double d : avgMarks) {
            System.out.print(d + " ");
        }

        sc.close();     
    }
}