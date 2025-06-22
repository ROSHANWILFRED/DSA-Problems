package Strings;

public class RemoveDuplicates {

    static String removeDuplicatesString(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "radar";
        System.out.println(removeDuplicatesString(str));
    }
}
