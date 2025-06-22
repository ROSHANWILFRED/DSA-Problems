package Stacks;

import java.util.Stack;

public class BalancedParenthesis {

    static boolean isBracketsBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.add(ch);
            } else if (ch == '}' || ch == ']' || ch == ')'){
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String str1 = "{[()]}";
        String str2 = "{}[]()";
        String str3 = "{][}";
        System.out.println(isBracketsBalanced(str1));
        System.out.println(isBracketsBalanced(str2));
        System.out.println(isBracketsBalanced(str3));
    }
}
