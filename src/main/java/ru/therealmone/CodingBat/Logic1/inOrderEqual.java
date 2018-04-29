package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 28.04.2018.
 *
 * Given three ints, a b c, return true if they are in strict increasing order,
 * such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7.
 * However, with the exception that if "equalOk" is true,
 * equality is allowed, such as 5 5 7 or 5 5 5.
 *
 * inOrderEqual(2, 5, 11, false) → true
 * inOrderEqual(5, 7, 6, false) → false
 * inOrderEqual(5, 5, 7, true) → true
 */

public class inOrderEqual extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(inOrderEqualSolution(2, 5, 11, false));
        System.out.println(inOrderEqualSolution(5, 7, 6, false));
        System.out.println(inOrderEqualSolution(5, 5, 7, true));
    }

    public static boolean inOrderEqualSolution(int a, int b, int c, boolean equalOk) {
        return (
                equalOk ? (a <= b && b <= c) : (a < b && b < c)
                );
    }
}
