package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 19.04.2018.
 *
 *
 * Given a string, return the string made of its first two chars,
 * so the String "Hello" yields "He". If the string is shorter than length 2,
 * return whatever there is, so "X" yields "X",
 * and the empty string "" yields the empty string "".
 * Note that str.length() returns the length of a string.
 *
 * firstTwo("Hello") → "He"
 * firstTwo("abcdefg") → "ab"
 * firstTwo("ab") → "ab"
 */

public class firstTwo extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(firstTwoSolution("Hello"));
        System.out.println(firstTwoSolution("abcdefg"));
        System.out.println(firstTwoSolution("ab"));
    }

    public static String firstTwoSolution(String str) {
        return (
                str.length() > 2 ?
                        str.substring(0,2)
                        : str
                );
    }
}
