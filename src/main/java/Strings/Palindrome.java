package Strings;

public class Palindrome {

    static String isPalindromeSkipSpecial(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (!Character.isAlphabetic(str.charAt(left))) {
                left++;
            } else if (!Character.isAlphabetic(str.charAt(right))) {
                right--;
            } else if (str.charAt(left) != str.charAt(right)) {
                return "Not Palindrome";
            } else {
                left++;
                right--;
            }
        }
        return "Palindrome";
    }

    static String isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return "Not Palindrome";
            } else {
                left++;
                right--;
            }
        }
        return "Palindrome";
    }

    public static void main(String[] args) {
        String str = "$radar$";
        System.out.println(isPalindromeSkipSpecial(str));
        System.out.println(isPalindrome(str));
    }
}
