package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 17.04.2018.
 *
 *
 * Given a string, return a version without the first and last char,
 * so "Hello" yields "ell". The string length will be at least 2.
 *

 * withoutEnd("Hello") → "ell"
 * withoutEnd("java") → "av"
 * withoutEnd("coding") → "odin"
 */

public class withoutEnd extends SolutionClass {
    @Override
    public void showSolution() {

    }

    public static String withoutEndSolution(String str) {
        return str.substring(1, str.length() - 1);
    }
}
