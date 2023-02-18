// https://www.hackerrank.com/contests/cse310-26699-day25/challenges/cse310-26108-w5-2

import java.util.*;

class Student {
    String name;
    {
        name = "Unknown";
    }

    Student() {
    }

    Student(String name) {
        this.name = name;
    }

    Student(int name) {
        // Dont do anything.
    }

    void display() {
        System.out.println(name);
    }
}

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String name2 = sc.next();

        boolean flag = true;
        for (int i = 0; i < name2.length(); i++) {
            if (name2.charAt(i) >= 'a' && name2.charAt(i) <= 'z') {

            } else if (name2.charAt(i) >= 'A' && name2.charAt(i) <= 'Z') {

            } else {
                flag = false;
                break;
            }
        }

        Student obj1 = new Student(name);
        Student obj2;
        if (flag) {
            obj2 = new Student(name2);
        }
        else {
            obj2 = new Student();
        }

        obj1.display();
        obj2.display();

        sc.close();
    }
}