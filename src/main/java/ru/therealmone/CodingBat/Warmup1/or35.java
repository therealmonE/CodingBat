package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 13.04.2018.
 *
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 * Use the % "mod" operator
 *
 * or35(3) → true
 * or35(10) → true
 * or35(8) → false
 */

public class or35 extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(or35Solution(3));
        System.out.println(or35Solution(10));
        System.out.println(or35Solution(8));
    }

    public static boolean or35Solution (int a) {
        return (a % 3 == 0 || a % 5 == 0);
    }
}
