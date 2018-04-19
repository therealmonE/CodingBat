package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 19.04.2018.
 *
 *
 * Given a string of even length, return a string made of the middle two chars,
 * so the string "string" yields "ri". The string length will be at least 2.
 *
 * middleTwo("string") → "ri"
 * middleTwo("code") → "od"
 * middleTwo("Practice") → "ct"
 */

public class middleTwo extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(middleTwoSolution("string"));
        System.out.println(middleTwoSolution("code"));
        System.out.println(middleTwoSolution("Practice"));
    }

    public static String middleTwoSolution(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
