// https://www.hackerrank.com/contests/cse310-26699-day27/challenges/cse310-28845-w5-2

import java.util.*;

class Grade {
    int N;
    int marks[];
    double percentage;
    String grade;

    Grade(){}
    Grade(int N){this.N = N;}
    Grade(int N, int []marks){this.N = N; this.marks = marks;}

    void getPercentage(){
        double sum = 0;
        for (int i : marks) {
            sum += i;
        }

        percentage = sum/N;
    }

    String getGrade() {

        getPercentage();

        if (percentage >= 90) {
            grade = "A+";
        }
        else if (percentage >= 70 && percentage <= 89) {
            grade = "A";
        }
        else if (percentage >= 60 && percentage <= 69) {
            grade = "B";
        }        
        else if (percentage >= 50 && percentage <= 59) {
            grade = "C";
        }        
        else if (percentage >= 40 && percentage <= 49) {
            grade = "D";
        }        
        else {
            grade = "E";
        }

        return grade;
    }
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        if (N > 7) {
            System.out.println("Invalid");
            System.exit(0);
        }

        int marks[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            marks[i] = sc.nextInt();
        }
        
        Grade obj1 = new Grade(N, marks);
        System.out.println(obj1.getGrade());

        sc.close();
    }
}