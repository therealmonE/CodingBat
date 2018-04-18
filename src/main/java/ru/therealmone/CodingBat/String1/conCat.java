package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 18.04.2018.
 *
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the concatenation creates a double-char, then omit one of the chars,
 * so "abc" and "cat" yields "abcat".
 *
 * conCat("abc", "cat") → "abcat"
 * conCat("dog", "cat") → "dogcat"
 * conCat("abc", "") → "abc"
 */

public class conCat extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(conCatSolution("abc", "cat"));
        System.out.println(conCatSolution("dog", "cat"));
        System.out.println(conCatSolution("abc", ""));
    }

    public static String conCatSolution(String a, String b) {
        try {
            return a + (a.charAt(a.length() - 1) == b.charAt(0) ?
                    b.substring(1, b.length())
                    : b);
        } catch (IndexOutOfBoundsException e) {
            return a + b;
        }

    }
}
