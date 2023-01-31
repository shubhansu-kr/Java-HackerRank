import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s1, s2, s3;
        s1 = sc.nextLine(); s2 = sc.nextLine(); s3 = sc.nextLine();

        int l1 = s1.length(); 
        int l2 = s2.length(); 
        int l3 = s3.length();


        if (l1 == l2 && l2 == l3) {
            System.out.println("-1");
        }
        else {
            if (l1 >= l2 && l1 >= l3) {
                System.out.println(l1);
            }
            else if (l2 >= l1 && l2 >= l3){
                System.out.println(l2);
            }
            else if (l3 >= l1 && l3 >= l2){
                System.out.println(l3);
            }
        }
    }
}
        // int counter = 0;

        // for(int i = 0; i < l1; i++){
        //     if (s1.charAt(i) == ' '){
        //         counter++;
        //     }
        // }

        // l1 -= counter;
        // counter = 0;

        // for(int i = 0; i < l2; i++){
        //     if (s2.charAt(i) == ' '){
        //         counter++;
        //     }
        // }

        // l2 -= counter;
        // counter = 0;

        // for(int i = 0; i < l3; i++){
        //     if (s3.charAt(i) == ' '){
        //         counter++;
        //     }
        // }