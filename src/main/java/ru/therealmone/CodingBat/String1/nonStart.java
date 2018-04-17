package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 10.07.2017.
 *
 * Given 2 strings, return their concatenation, except omit the first char of each.
 * The strings will be at least length 1.
 *
 * nonStart("Hello", "There") → "ellohere"
 * nonStart("java", "code") → "avaode"
 * nonStart("shotl", "java") → "hotlava"
 */

public class nonStart extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(nonStartSolution("Hello", "There"));
        System.out.println(nonStartSolution("java", "code"));
        System.out.println(nonStartSolution("shotl", "java"));
    }

    public static String nonStartSolution (String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }
}
