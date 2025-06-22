package Recursion;

import java.util.*;

public class Permutation {

    static Set<String> permuteString(String processString, String unProcessString) {
        if (unProcessString.isEmpty()) {
            Set<String> set = new HashSet<>();
            set.add(processString);
            return set;
        }
        char ch = unProcessString.charAt(0);
        Set<String> result = new HashSet<>();
        for (int i = 0; i<=processString.length();i++) {
            String first = processString.substring(0,i);
            String second = processString.substring(i);
            result.addAll(permuteString(first+ch+second,unProcessString.substring(1)));
        }
        return result;
    }

    static Set<List<Integer>> permuteArray(List<Integer> process, List<Integer> unprocess) {
        Set<List<Integer>> result = new HashSet<>();

        if (unprocess.isEmpty()) {
            result.add(new ArrayList<>(process));
            return result;
        }

        int current = unprocess.get(0);
        List<Integer> rest = unprocess.subList(1, unprocess.size());

        for (int i = 0; i <= process.size(); i++) {
            List<Integer> first = new ArrayList<>(process.subList(0, i));
            List<Integer> second = new ArrayList<>(process.subList(i, process.size()));

            List<Integer> newProcess = new ArrayList<>(first);
            newProcess.add(current);
            newProcess.addAll(second);

            result.addAll(permuteArray(newProcess, rest));
        }

        return result;
    }



    public static void main(String[] args) {
        String str = "abcd";
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(permuteArray(new ArrayList<>(), arr));
        System.out.println(permuteString("",str));
    }
}
