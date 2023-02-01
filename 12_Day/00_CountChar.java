import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        char c = sc.next().charAt(0);

        int counter = 0;

        for(int i = 0; i < str.length(); i++){
            if (c == str.charAt(i)) ++counter;
        }

        System.out.println(counter);
    }
}