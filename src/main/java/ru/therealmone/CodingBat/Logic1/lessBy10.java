package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
 *
 * lessBy10(1, 7, 11) → true
 * lessBy10(1, 7, 10) → false
 * lessBy10(11, 1, 7) → true
 */

public class lessBy10 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(lessBy10Solution(1, 7, 11));
        System.out.println(lessBy10Solution(1, 7, 10));
        System.out.println(lessBy10Solution(11, 1, 7));
    }

    public static boolean lessBy10Solution(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10);
    }
}
