import java.io.*;
import java.util.*;

public class Solution {

    static void insertChar(int ind, char c, char str[]){
        for(int i = str.length-1; i > ind; --i) {
            str[i] = str[i-1];
        }
        str[ind] = c;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String size = sc.nextLine();
        // int size = sc.nextInt();
        // if (size < 0 || size > 20) {
        //     System.out.println("Invalid size of array");
        //     return;
        // }

        String input = sc.nextLine();
        int n = input.length();

        int st = 0;
        char str[] = new char[2*n + 1];
        for(int i = 0; i < n; ++i) {
            if (input.charAt(i) == ' ') continue;
            str[st++] = input.charAt(i);
        }

        n = st;
        // Now insert char(s) 
        for(int i = 0; i < n; ++i) {
            if (str[i] >= 'A' && str[i] <= 'Z') {
                char c = Character.toLowerCase(str[i]);
                insertChar(i+1, c, str);
                ++n;
            }
        }

        for(int i = 0; i < n; ++i) {
            System.out.print(str[i] + " ");
        }
    }
}

// import java.util.*;

// class Solution {
//     Runtime Error: 
//     static void insertChar(int ind, char c, char str[]){
//         for(int i = str.length; i > ind; --i) {
//             str[i] = str[i-1];
//         }
//         str[ind] = c;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         if (n < 0 || n > 20) {
//             System.out.println("Invalid size of array");
//             return;
//         }

//         char str[] = new char[2*n+1];

//         for(int i = 0; i < n; ++i) {
//             str[i] = sc.next().charAt(0);
//         }

//         // Now insert char(s) 
//         for(int i = 0; i < n; ++i) {
//             if (str[i] >= 'A' && str[i] <= 'Z') {
//                 insertChar(i+1, (char)(str[i]+32), str);
//                 ++n;
//             }
//         }

//         for(int i = 0; i < n; ++i) {
//             System.out.println(str[i] + " ");
//         }
//     }
// }