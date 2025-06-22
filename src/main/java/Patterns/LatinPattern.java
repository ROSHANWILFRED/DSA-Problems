package Patterns;

public class LatinPattern {

    static void printLatinCharPattern(int n) {
        for (int i = 0; i<n;i++) {
            for (int j = 0;j<n;j++) {
                char ch = (char) ( (i+j)%n +'A');
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void printLatinIntPattern(int n) {
        for (int i = 0; i<n;i++) {
            for (int j = 0;j<n;j++) {
                int val = (i+j)%n + 1;
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printLatinIntPattern(n);
        System.out.println();
        printLatinCharPattern(n);
    }
}
