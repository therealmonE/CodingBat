package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * Given 2 ints, a and b, return their sum.
 * However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
 *
 * sortaSum(3, 4) → 7
 * sortaSum(9, 4) → 20
 * sortaSum(10, 11) → 21
 */

public class sortaSum extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(sortaSumSolution(3, 4));
        System.out.println(sortaSumSolution(9, 4));
        System.out.println(sortaSumSolution(10, 11));
    }

    public static int sortaSumSolution(int a, int b) {
        return (
                (a + b >= 10 && a + b <= 19) ? 20 : a + b
                );
    }
}
