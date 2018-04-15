package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 13.04.2018.
 *
 * Given 2 int values, return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then return true only if both are negative.
 *
 * posNeg(1, -1, false) → true
 * posNeg(-1, 1, false) → true
 * posNeg(-4, -5, true) → true
 */

public class posNeg extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(posNegSolution(1, -1, false));
        System.out.println(posNegSolution(-1, 1, false));
        System.out.println(posNegSolution(-4, -5, true));
    }

    public static boolean posNegSolution(int a, int b, boolean negative) {
        return((a*b < 0 && !negative) || (negative && a < 0 && b < 0));
    }
}
