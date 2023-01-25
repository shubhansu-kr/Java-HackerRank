import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String number = sc.nextLine();

        if (number.length() != 12 || number.charAt(0) != '9' || number.charAt(1) != '1'){
            System.out.println("Enter Valid Number");
        }
        else {
            System.out.println("Number Saved");
        }
    }
}