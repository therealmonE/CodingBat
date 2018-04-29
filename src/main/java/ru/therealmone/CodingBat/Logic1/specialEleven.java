package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 28.04.2018.
 *
 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
 * Return true if the given non-negative number is special.
 * Use the % "mod" operator -- see Introduction to Mod
 *
 * specialEleven(22) → true
 * specialEleven(23) → true
 * specialEleven(24) → false
 */

public class specialEleven extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(specialElevenSolution(22));
        System.out.println(specialElevenSolution(23));
        System.out.println(specialElevenSolution(24));
    }

    public static boolean specialElevenSolution(int n) {
        return (n % 11 <= 1);
    }
}
