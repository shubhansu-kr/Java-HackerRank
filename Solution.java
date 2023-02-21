class test {
    final String PassportNo;
    test() {
        PassportNo = "425245242";
        
        System.out.println(PassportNo);
    }
}

class Solution {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.PassportNo);
    }
}