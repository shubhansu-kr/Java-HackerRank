import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next(), str2 = sc.next();
        int l1 = str1.length(), l2 = str2.length();

        int alpha1[] = new int[26];
        int alpha2[] = new int[26];
        
        for(int i = 0; i < l1; ++i){
            alpha1[str1.charAt(i)-'a']++;
        }
        for(int i = 0; i < l2; ++i){
            alpha2[str2.charAt(i)-'a']++;
        }

        if (l1 > l2) {
            if (l1 % l2 != 0) {
                System.out.println("Not Similar");
                return;
            }

            int factor = l1 / l2;
            for(int i = 0; i < 26; ++i){
                if (alpha1[i] == 0){
                    if (alpha2[i] == 0) {
                        continue;
                    }
                    else {
                        System.out.println("Not Similar");
                        return;
                    }
                }
                if (alpha1[i] / alpha2[i] != factor){
                    System.out.println("Not Similar");
                    return;
                }
            }
        }
        else {
            if (l2 % l1 != 0) {
                System.out.println("Not Similar");
                return;
            }

            int factor = l2 / l1;
            for(int i = 0; i < 26; ++i) {
                if (alpha1[i] == 0){
                    if (alpha2[i] == 0) {
                        continue;
                    }
                    else {
                        System.out.println("Not Similar");
                        return;
                    }
                }
                if (alpha2[i] / alpha1[i] != factor){
                    System.out.println("Not Similar");
                    return;
                }
            }
        }

        System.out.println("Similar");
    }
}