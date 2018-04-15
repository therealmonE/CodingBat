package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 13.04.2018.
 *
 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
 * Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 *
 * lastDigit(7, 17) → true
 * lastDigit(6, 17) → false
 * lastDigit(3, 113) → true
 */

public class lastDigit extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(lastDigitSolution(7, 17));
        System.out.println(lastDigitSolution(6, 17));
        System.out.println(lastDigitSolution(3, 113));
    }

    public static boolean lastDigitSolution(int a, int b) {
        return(a%10 == b%10);
    }
}
