package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 15.04.2018.
 *
 * Given a string, return a version where all the "x" have been removed.
 * Except an "x" at the very start or end should not be removed.
 *
 * stringX("xxHxix") → "xHix"
 * stringX("abxxxcd") → "abcd"
 * stringX("xabxxxcdx") → "xabcdx"
 */

public class stringX extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(stringXSolution("xxHxix"));
        System.out.println(stringXSolution("abxxxcd"));
        System.out.println(stringXSolution("xabxxxcdx"));
    }

    public static String stringXSolution(String str) {
        boolean hasXFirst = false;
        boolean hasXLast = false;

        if(str.charAt(0) == 'x')
            hasXFirst = true;
        if(str.charAt(str.length() - 1) == 'x')
            hasXLast = true;

        str = str.replaceAll("[x]+", "");
        str = hasXFirst ? "x" + str : str;
        str = hasXLast ? str + "x" : str;
        return str;
    }
}
