package Maths;

public class Factorial {

    static int factorial(int n) {
        if (n==1) {
            return n;
        }
        return n * factorial(n-1);
    }

    static int power(int n, int pow) {
        if (pow==1) {
            return n;
        }
        return n * power(n,pow-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
        System.out.println(power(n,2));
    }
}
