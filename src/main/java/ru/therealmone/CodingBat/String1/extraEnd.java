package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 17.04.2018.
 *
 *
 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
 * The string length will be at least 2.
 *
 * extraEnd("Hello") → "lololo"
 * extraEnd("ab") → "ababab"
 * extraEnd("Hi") → "HiHiHi"
 */

public class extraEnd extends SolutionClass {
    @Override
    public void showSolution() {

    }

    public static String extraEndSolution(String str) {
        try {
            String tmp = str.substring(str.length() - 2, str.length());
            return tmp + tmp + tmp;
        } catch (IndexOutOfBoundsException e) {
            return str + str + str;
        }
    }
}
