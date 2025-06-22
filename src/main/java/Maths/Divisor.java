package Maths;

public class Divisor {

    static void findDivisors(int n) {
        System.out.print(1+ " ");
        for (int i = 2;i<=n/2;i++) {
            if (n%i==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println(n);
    }

    static int sumOfDivisors(int n) {
        int sum = 1 + n;
        for (int i = 2;i<=n/2;i++) {
            if (n%i==0) {
                sum+=i;
            }
        }
        return sum;
    }

    static int countOfDivisors(int n) {
        int count = 2;
        for (int i = 2;i<=n/2;i++) {
            if (n%i==0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 24;
    }
}
