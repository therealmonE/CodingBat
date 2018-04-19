package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 18.04.2018.
 *
 * Given a string, if the first or last chars are 'x',
 * return the string without those 'x' chars,
 * and otherwise return the string unchanged.
 *
 * withoutX("xHix") → "Hi"
 * withoutX("xHi") → "Hi"
 * withoutX("Hxix") → "Hxi"
 */

public class withoutX extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(withoutXSolution("xHix"));
        System.out.println(withoutXSolution("xHi"));
        System.out.println(withoutXSolution("Hxix"));
    }

    public static String withoutXSolution(String str) {
        return (str.charAt(0) == 'x' ? "" : str.charAt(0))
                + str.substring(1, str.length() - 1)
                + (str.charAt(str.length() - 1) == 'x' ? "" : str.charAt(str.length() - 1));
    }
}
