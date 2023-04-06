import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student 
{
   double cgpa;
  Student(double cgpa)
  {
      this.cgpa = cgpa;
  }
}

interface CompanyNorms
{
  boolean isEligible(Student st);
}

class PlacementPortal
{
    void filterStudents(Student [] arr, CompanyNorms ob)
    {
        int count = 0;
        for(Student st : arr)
        {
        	if(ob.isEligible(st)) count ++;
        }
        System.out.print(count + " ");
    }
}

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        Student st[] = new Student[n];

        for (int i = 0; i < n; i++) {
            st[i] = new Student(sc.nextDouble());
        }

        double cg[] = new double[3];
        for (int i = 0; i < 3; i++) {
            cg[i] = sc.nextDouble();
        }

        CompanyNorms obj0 = (Student s)-> {
            return cg[0] <= s.cgpa;
        };
        CompanyNorms obj1 = (Student s)-> {
            return cg[1] <= s.cgpa;
        };
        CompanyNorms obj2 = (Student s)-> {
            return cg[2] <= s.cgpa;
        };

        PlacementPortal obj = new PlacementPortal();
        
        obj.filterStudents(st, obj0);
        obj.filterStudents(st, obj1);
        obj.filterStudents(st, obj2);

        sc.close();
    }
}