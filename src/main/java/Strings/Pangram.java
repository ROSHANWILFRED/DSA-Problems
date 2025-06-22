package Strings;

public class Pangram {

    static String isPangram(String sentence) {
        boolean[] present = new boolean[26];
        sentence = sentence.toLowerCase();

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                present[c - 'a'] = true;
            }
        }

        for (boolean b : present) {
            if (!b) {
                return "Not a Pangram";
            }
        }
        return "Pangram";
    }

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isPangram(str));
    }
}
