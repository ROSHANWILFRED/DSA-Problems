package Patterns;

public class SnakePattern {

    static void printSnakePattern(int n) {
        int count = 1;
        for (int i = 0;i<n;i++) {
            if (i%2 == 0) {
                for (int j=0;j<n;j++) {
                    System.out.print(count++ + "  ");
                }
            } else {
                int end = count + n - 1;
                for (int j = end;j>=count;j--) {
                    System.out.print(j + "  ");
                }
                count = end +1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printSnakePattern(n);
    }
}
