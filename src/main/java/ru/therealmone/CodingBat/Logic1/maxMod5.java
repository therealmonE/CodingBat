package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * Given two int values, return whichever value is larger.
 * However if the two values have the same remainder when divided by 5, then the return the smaller value.
 * However, in all cases, if the two values are the same, return 0.
 * Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
 *
 * maxMod5(2, 3) → 3
 * maxMod5(6, 2) → 6
 * maxMod5(3, 2) → 3
 */

public class maxMod5 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(maxMod5Solution(2, 3));
        System.out.println(maxMod5Solution(6, 2));
        System.out.println(maxMod5Solution(3, 2));
    }
    public static int maxMod5Solution(int a, int b) {
        return (
                (a == b) ? 0
                        : (a % 5 == b % 5) ? (a < b) ? a : b
                        : (a > b) ? a : b
                );
    }
}
