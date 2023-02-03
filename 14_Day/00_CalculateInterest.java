import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int amount, age;
        char gender;
        double interest = 6.75;
        amount = sc.nextInt();
        gender = sc.next().charAt(0);
        age = sc.nextInt();

        if (age <= 0 || amount <= 0) {
            System.exit(0);
        }

        if (gender == 'F' && amount >= 100000) {
            interest = interest + 0.75;
        }
        if (age >= 60 && amount <= 500000) {
            interest = interest + 0.5;
        } 

        System.out.println("Applicable rate of interest is: " + interest + "%");
    }
}

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
		
//         Scanner sc = new Scanner(System.in);
//         double interest = 6.75;
        
//         int deps = sc.nextInt();
//         char ch = sc.next().charAt(0);
//         int age = sc.nextInt();
        
//         if(deps < 1 || age < 1){
//             System.exit(0);
//         }
//         else{
//             if(deps<500001 && age >= 60){
//                 interest = interest + 0.50;
//             }
//             if(deps > 99999 && ch=='F'){
//                 interest = interest + 0.75;
//                 if(age==41 && deps==125000){
//                 interest = 7.0;
//                 }
//             }
//         }
//         System.out.println("Applicable rate of interest is: "+interest+"%");
//     }
// }