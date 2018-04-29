package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 28.04.2018.
 *
 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
 * So for example 38 and 39 return true, but 40 returns false.
 * See also: Introduction to Mod
 *
 * less20(18) → true
 * less20(19) → true
 * less20(20) → false
 */

public class less20 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(less20Solution(18));
        System.out.println(less20Solution(19));
        System.out.println(less20Solution(20));
    }

    public static boolean less20Solution(int n) {
        return (n % 20 == 18 || n % 20 == 19);
    }
}
