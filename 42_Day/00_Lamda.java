import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

class Student {
    String name;
    int rollNo;
    String department;

    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        if (numOfStudents <= 1) {
            System.out.println("Invalid");
            System.exit(0);
        }

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numOfStudents; i++) {
            String name = sc.next();
            int rollNo = sc.nextInt();
            String department = sc.next();
            students.add(new Student(name, rollNo, department));
        }

        Predicate<Student> cseFilter = student -> student.department.equals("CSE");
        students.stream().filter(cseFilter).forEach(student -> System.out.println(student.rollNo));

        sc.close();
    }
}