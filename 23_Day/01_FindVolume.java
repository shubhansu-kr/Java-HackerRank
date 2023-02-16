// https://www.hackerrank.com/contests/cse310-26699-day24/challenges/cse310-26121-w5-p2

import java.util.*;

class Volumes {
    float pi = 3.14f;
    float ballVol, cycVol, rectVol;

    void volume(int r) {
        ballVol = pi*r*r*r;
    }
    
    void volume(int r, int h) {
        cycVol = pi*r*r*h;
    }

    void volume(int l, int b, int h) {
        rectVol = l * b * h;
    }

    void display() {
        System.out.println(ballVol);
        System.out.println(cycVol);
        System.out.println(rectVol);
    }
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Volumes V1 = new Volumes();
        
        int input[] = new int[6];
        for (int i = 0; i < 6; i++) {
            input[i] = sc.nextInt();
            if (input[i] < 1) {
                System.out.println("invalid input");
                sc.close();
                return;
            }
        }

        V1.volume(input[0]);
        V1.volume(input[1], input[2]);
        V1.volume(input[3], input[4], input[5]);

        V1.display();

        sc.close();
    }
}