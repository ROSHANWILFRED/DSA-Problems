package Maths;

public class Fibonacci {

    static void firstNFiboNumbers(int n) {
        int a = 0,b=1;
        System.out.println(a);
        System.out.println(b);
        n = n - 2;
        while (n>0) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            n--;
        }
    }

    static int fibo(int n) {
        if (n<=1) return n;
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}
