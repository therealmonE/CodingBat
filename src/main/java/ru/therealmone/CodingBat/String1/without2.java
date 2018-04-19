package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 18.04.2018.
 *
 * Given a string, if a length 2 substring appears at both its beginning and end,
 * return a string without the substring at the beginning,
 * so "HelloHe" yields "lloHe". The substring may overlap with itself,
 * so "Hi" yields "". Otherwise, return the original string unchanged.
 *
 * without2("HelloHe") → "lloHe"
 * without2("HelloHi") → "HelloHi"
 * without2("Hi") → ""
 */

public class without2 extends SolutionClass {
    @Override
    public void showSolution() {

    }

    public static String without2Solution(String str) {
        try {
            return str.substring(0,2)
                    .equals(str.substring(str.length() - 2, str.length())) ?
                    str.substring(2, str.length())
                    : str;
        } catch (IndexOutOfBoundsException e) {
            return str;
        }
    }
}
