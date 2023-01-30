import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt(), Y = sc.nextInt();
        int sum = 0;
        if (X > Y){
            for(int i = Y+1; i < X; i++){
                sum += i;
            }
        }
        else {
            for(int i = X+1; i < Y; i++){
                sum += i;
            }
        }

        if(sum != 0){
            System.out.print(sum);
        }
        
        // else {
        //     System.out.print("NO OUTPUT");
        // }
    }
}