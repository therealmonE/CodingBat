package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * The number 6 is a truly great number.
 * Given two int values, a and b, return true if either one is 6.
 * Or if their sum or difference is 6.
 * Note: the function Math.abs(num) computes the absolute value of a number.
 *
 * love6(6, 4) → true
 * love6(4, 5) → false
 * love6(1, 5) → true
 */

public class love6 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(love6Solution(6,4));
        System.out.println(love6Solution(4,5));
        System.out.println(love6Solution(1,5));
    }

    public static boolean love6Solution(int a, int b) {
        return (a == 6 || b == 6 || Math.abs(a - b) == 6 || a + b == 6);
    }
}
