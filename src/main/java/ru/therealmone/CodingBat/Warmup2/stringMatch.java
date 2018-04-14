package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 10.07.2017.
 *
 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
 * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
 *
 * stringMatch("xxcaazz", "xxbaaz") → 3
 * stringMatch("abc", "abc") → 2
 * stringMatch("abc", "axc") → 0
 */

public class stringMatch extends SolutionClass {

    @Override
    public void showSolution() {
        System.out.println(stringMatchSolution("xxcaazz", "xxbaaz"));
        System.out.println(stringMatchSolution("abc", "abc"));
        System.out.println(stringMatchSolution("abc", "axc"));
    }

    public static int stringMatchSolution (String a, String b) {
        int count = 0;
        int minLength;

        if (a.length() < b.length())
            minLength = a.length();
        else
            minLength = b.length();

        for (int i = 0; i < minLength - 1; i++) {
            if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1))
                count++;
        }

        return count;
    }

}
