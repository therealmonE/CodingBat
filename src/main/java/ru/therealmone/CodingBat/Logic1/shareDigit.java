package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * Given two ints, each in the range 10..99,
 * return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
 * (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
 *
 * shareDigit(12, 23) → true
 * shareDigit(12, 43) → false
 * shareDigit(12, 44) → false
 */

public class shareDigit extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(shareDigitSolution(12, 23));
        System.out.println(shareDigitSolution(12, 43));
        System.out.println(shareDigitSolution(12, 44));
    }

    public static boolean shareDigitSolution(int a, int b) {
        return (
                (a / 10 == b / 10 || a / 10 == b % 10)
                || (a % 10 == b / 10 || a % 10 == b % 10)
                );
    }
}
