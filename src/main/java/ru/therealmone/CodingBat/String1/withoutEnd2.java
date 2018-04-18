package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 18.04.2018.
 *
 * Given a string, return a version without both the first and last char of the string.
 * The string may be any length, including 0.
 *
 * withouEnd2("Hello") → "ell"
 * withouEnd2("abc") → "b"
 * withouEnd2("ab") → ""
 */

public class withoutEnd2 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(withoutEnd2Solution("Hello"));
        System.out.println(withoutEnd2Solution("abc"));
        System.out.println(withoutEnd2Solution("ab"));
    }

    public static String withoutEnd2Solution(String str) {
        try{
            return str.substring(1, str.length() - 1);
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }
}
