// https://www.hackerrank.com/contests/cse310-26699-day42/challenges/cse310-max-week9-2

import java.util.*;

class Person{
    int age;

    Person(){}
    Person(int age) {
        this.age = age;
    }
}

@FunctionalInterface
interface Search {
    void find(Person p[]);
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n; 
        n = sc.nextInt();

        if (n < 2) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        Person p[] = new Person[n];
        
        for (int i = 0; i < n; i++) {
            int ag;
            ag = sc.nextInt();

            if (ag <= 0) {
                ag = 18;
            }
            
            p[i] = new Person(ag);
        }

        Search obj = (Person q[]) -> {
            int count = 0;
            for (int i = 0; i < q.length; i++) {
                if (q[i].age > 25) ++count;
            }
            System.out.println(count);
        };

        obj.find(p);

        sc.close();
    }
}