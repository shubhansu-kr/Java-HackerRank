import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        float price[] = new float[6];
        int priceInt[] = new int[6];

        for(int i = 0; i < 6; ++i) {
            price[i] = sc.nextFloat();
        }

        for(int i = 0; i < 6; ++i) {
            priceInt[i] = (int)price[i];
        }

        int min = 2121223, max = -1;

        for(int i = 0; i < 6; ++i) {
            if (min > priceInt[i]) {
                min = priceInt[i];
            }

            if (max < priceInt[i]) {
                max = priceInt[i];
            }
        }

        for(int i = 0; i < 6; ++i) {
            if (priceInt[i] == max){
                priceInt[i] = min;
                break;
            }
        }

        for(int it: priceInt) {
            System.out.print(it + " ");
        }

    }
}