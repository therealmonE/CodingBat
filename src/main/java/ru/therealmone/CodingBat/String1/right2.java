package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 19.04.2018.
 *
 *
 * Given a string, return a "rotated right 2" version
 * where the last 2 chars are moved to the start.
 * The string length will be at least 2.
 *
 * right2("Hello") → "loHel"
 * right2("java") → "vaja"
 * right2("Hi") → "Hi"
 */

public class right2 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(right2Solution("Hello"));
        System.out.println(right2Solution("java"));
        System.out.println(right2Solution("Hi"));
    }

    public static String right2Solution(String str) {
        try {
            return str.substring(str.length() - 2, str.length())
                    + str.substring(0, str.length() - 2);
        } catch (IndexOutOfBoundsException e) {
            return str;
        }
    }
}
