import java.util.*;

class Solution {

    // enum Week{
    //     Monday, Tuesday, Wednesday, Thursday, Friday, Saturdays;

    //     String open, close;

    //     Week(){
    //         open = "8:30";:    //         close = "5.30";
    //     }
    // }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        switch (input) {
            case "Monday":
                System.out.println("8:30 5:30");
                break;
            case "Tuesday":
                System.out.println("8:30 5:30");
                break;
            case "Wednesday":
                System.out.println("8:30 5:30");
                break;
            case "Thursday":
                System.out.println("8:30 5:30");
                break;
            case "Friday":
                System.out.println("8:30 5:30");
                break;
            case "Saturdays":
                System.out.println("9:30 4:30");
                break;
            default:
                System.out.println("Library is closed");
                break;
        }

        sc.close();
    }
}