package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * Given 2 ints, a and b, return their sum.
 * However, "teen" values in the range 13..19 inclusive, are extra lucky.
 * So if either value is a teen, just return 19.
 *
 * teenSum(3, 4) → 7
 * teenSum(10, 13) → 19
 * teenSum(13, 2) → 19
 */

public class teenSum extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(teenSumSolution(3, 4));
        System.out.println(teenSumSolution(10, 13));
        System.out.println(teenSumSolution(13, 2));
    }

    public static int teenSumSolution(int a, int b) {
        return (
                (a >= 13 && a <= 19) || (b >= 13 && b <= 19) ? 19 : a + b
                );
    }
}
