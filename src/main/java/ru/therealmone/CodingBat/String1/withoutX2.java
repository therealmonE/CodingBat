package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 19.04.2018.
 *
 * Given a string, if one or both of the first 2 chars is 'x',
 * return the string without those 'x' chars, and otherwise return the string unchanged.
 * This is a little harder than it looks.
 *
 * withoutX2("xHi") → "Hi"
 * withoutX2("Hxi") → "Hi"
 * withoutX2("Hi") → "Hi"
 */

public class withoutX2 extends SolutionClass {
    @Override
    public void showSolution() {

    }

    public static String withoutX2Solution(String str) {
        StringBuilder tmp = new StringBuilder();
        try {
            tmp.append(
                    str.charAt(0) == 'x' ?
                            "" : str.charAt(0)
            ).append(
                    str.charAt(1) == 'x' ?
                            "" : str.charAt(1)
            );
        } catch (IndexOutOfBoundsException e) {}
        return (
                str.length() > 2 ?
                        tmp + str.substring(2, str.length())
                        : tmp.toString()
                );
    }
}
