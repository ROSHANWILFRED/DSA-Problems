package Maths;

public class NumberProperties {

    static void palindrome(int n) {
        int num = n;
        int rev = 0;
        while (n>0) {
            rev = rev * 10 + n % 10;
            n = n/10;
        }
        if (num == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    static void armstrongNumber(int n) {
        int num = n;
        int res = 0;
        while (n>0) {
            res = res + (int) Math.pow(n%10,3);
            n = n/10;
        }
        if (num == res) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }
    }

    static void perfectNumber(int n) {
        int sum = 0;
        for (int i=1;i<=n/2;i++) {
            if (n%i==0) sum+=i;
        }
        if (sum==n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }

    public static void main(String[] args) {

    }
}
