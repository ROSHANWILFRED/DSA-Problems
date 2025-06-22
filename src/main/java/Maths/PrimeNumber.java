package Maths;

public class PrimeNumber {

    public static void main(String[] args) {
        int n = 7;
        firstNPrimeNumbers(n);
    }

    static void firstNPrimeNumbers(int n) {
        int num = 2;
        while (n>0) {
           if(isPrime(num)) {
               System.out.print(num+ " ");
               n--;
           }
           num++;
        }
    }

    static void findAllPrimesInBetween(int n) {
        for (int i = 2;i<=n;i++) {
            if (isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n<=1) return false;
        if (n==2) return true;
        if (n%2==0) return false;
        for (int i = 3; i*i<=n;i+=2) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
