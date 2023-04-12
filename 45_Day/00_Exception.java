// https://www.hackerrank.com/contests/cse310-26699-day48/challenges/cse310-28845-w10-1

import java.util.*;

class UnexpectedTrouserSizeException extends Exception {
    UnexpectedTrouserSizeException(){}
    UnexpectedTrouserSizeException(String mes){
        super(mes);
    }
}
class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        try {
            int age = sc.nextInt();

            if (age < 18 || age > 40) {
                throw new UnexpectedTrouserSizeException("the demanded size is out of stock");
            }

            System.out.println("try and shop");
        }
        catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
        catch (UnexpectedTrouserSizeException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());            
        }
        finally {
            sc.close();
        }

    }
}