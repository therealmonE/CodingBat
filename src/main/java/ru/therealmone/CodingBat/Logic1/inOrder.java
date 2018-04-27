package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * Given three ints, a b c, return true if b is greater than a, and c is greater than b.
 * However, with the exception that if "bOk" is true, b does not need to be greater than a.
 *
 * inOrder(1, 2, 4, false) → true
 * inOrder(1, 2, 1, false) → false
 * inOrder(1, 1, 2, true) → true
 */

public class inOrder extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(inOrderSolution(1, 2, 4, false));
        System.out.println(inOrderSolution(1, 2, 1, false));
        System.out.println(inOrderSolution(1, 1, 2, true));
    }

    public static boolean inOrderSolution(int a, int b, int c, boolean bOK) {
        return (
                bOK ? (c > b) : (b > a && b < c)
                );
    }
}
