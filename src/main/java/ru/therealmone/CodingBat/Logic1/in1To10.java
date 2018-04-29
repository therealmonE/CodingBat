package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * Given a number n, return true if n is in the range 1..10, inclusive.
 * Unless outsideMode is true, in which case return true if the number is less or equal to 1,
 * or greater or equal to 10.
 *
 * in1To10(5, false) → true
 * in1To10(11, false) → false
 * in1To10(11, true) → true
 */

public class in1To10 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(in1To10Solution(5, true));
        System.out.println(in1To10Solution(11, false));
        System.out.println(in1To10Solution(11, true));
    }

    public static boolean in1To10Solution(int n, boolean outsideMode) {
        return (
                !outsideMode ?
                        (n >= 1 && n <= 10)
                        : (n <= 1 || n >= 10)
                );
    }
}
