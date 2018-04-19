package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 18.04.2018.
 *
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
 * such as with "badxxx" or "xbadxx" but not "xxbadxx".
 * The string may be any length, including 0.
 * Note: use .equals() to compare 2 strings.
 *
 * hasBad("badxx") → true
 * hasBad("xbadxx") → true
 * hasBad("xxbadxx") → false
 */

public class hasBad extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(hasBadSolution("badxx"));
        System.out.println(hasBadSolution("xbadxx"));
        System.out.println(hasBadSolution("xxbadxx"));
    }

    public static boolean hasBadSolution(String str) {
        return str.indexOf("bad") == 0 || str.indexOf("bad") == 1;
    }
}
