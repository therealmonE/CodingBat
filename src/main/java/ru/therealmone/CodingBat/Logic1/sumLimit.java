package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 29.04.2018.
 *
 * Given 2 non-negative ints, a and b, return their sum,
 * so long as the sum has the same number of digits as a.
 * If the sum has more digits than a, just return a without b.
 * (Note: one way to compute the number of digits of a non-negative int n
 * is to convert it to a string with String.valueOf(n) and then check the length of the string.)
 *
 * sumLimit(2, 3) → 5
 * sumLimit(8, 3) → 8
 * sumLimit(8, 1) → 9
 */

public class sumLimit extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(sumLimitSolution(2, 3));
        System.out.println(sumLimitSolution(8, 3));
        System.out.println(sumLimitSolution(8, 1));
    }

    public static int sumLimitSolution(int a, int b) {
        return (
                String.valueOf(a + b).length() == String.valueOf(a).length() ?
                        a + b
                        : a
                );
    }
}
