package Patterns;

public class BinaryPattern {

    static void printBinaryPattern(int n) {
        int total = (int) Math.pow(2, n);
        for (int i = 0; i < total; i++) {
            for (int j = n - 1; j >= 0; j--) {
                int bit = (i >> j) & 1;
                System.out.print(bit + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        printBinaryPattern(n);
    }
}
