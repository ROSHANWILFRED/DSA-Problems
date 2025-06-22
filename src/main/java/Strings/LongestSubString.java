package Strings;

public class LongestSubString {

    static int longestSubstringWithoutRepeatingChar(String str) {
        int[] lastSeen = new int[256];
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i<str.length();i++) {
            char ch = str.charAt(i);
            if (lastSeen[ch] > start) {
                start = lastSeen[ch];
            }
            lastSeen[ch] = i+1;
            maxLen = Math.max(maxLen,i+1 - start);
        }
        return maxLen;
    }

    static String longestPalindromeSubstring(String str) {
        int start = 0;
        int end = 0;
        for (int i = 0;i<str.length();i++) {
            int oddLength = expandFromCenter(str,i,i);
            int evenLength = expandFromCenter(str,i,i+1);
            int maxLength = Math.max(oddLength,evenLength);
            if (maxLength>end-start) {
                start = i - ((maxLength-1)/2);
                end = i + (maxLength/2);
            }
        }
        return str.substring(start,end+1);
    }

    static int expandFromCenter(String str,int left,int right) {
        while (left>=0 && right<str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        String str = "abcbacdea";
        System.out.println(longestSubstringWithoutRepeatingChar(str));
        System.out.println(longestPalindromeSubstring(str));
    }
}
