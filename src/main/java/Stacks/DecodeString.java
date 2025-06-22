package Stacks;

import java.util.Stack;

public class DecodeString {

    static String decodingString(String str) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> integerStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                integerStack.push(k);
                stringStack.push(current.toString());
                current = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                int count = integerStack.pop();
                StringBuilder decode = new StringBuilder(stringStack.pop());
                for (int i = 0;i<count;i++) {
                    decode.append(current);
                }
                current = decode;
            } else {
                current.append(ch);
            }
        }
        return current.toString();
    }

    public static void main(String[] args) {
        String str1 = "3[a]2[bc]";
        System.out.println(decodingString(str1));
    }

}
