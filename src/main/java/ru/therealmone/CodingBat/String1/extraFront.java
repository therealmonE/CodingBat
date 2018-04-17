package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 10.07.2017.
 *
 * Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
 * The string may be any length. If there are fewer than 2 chars, use whatever is there.
 *
 * extraFront("Hello") → "HeHeHe"
 * extraFront("ab") → "ababab"
 * extraFront("H") → "HHH"
 */

public class extraFront extends SolutionClass{
    @Override
    public void showSolution() {

    }

    public static String extraFrontSolution(String str) {
        StringBuilder tmp = new StringBuilder();
        try {
            for (int i = 0; i < 2; i++) {
                tmp.append(str.charAt(i));
            }
        } catch (Exception e) {}
        tmp.append(tmp.toString() + tmp.toString());
        return tmp.toString();
    }
}
