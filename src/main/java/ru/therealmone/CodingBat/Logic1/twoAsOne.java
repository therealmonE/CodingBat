package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
 *
 * twoAsOne(1, 2, 3) → true
 * twoAsOne(3, 1, 2) → true
 * twoAsOne(3, 2, 2) → false
 */

public class twoAsOne extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(twoAsOneSokution(1, 2, 3));
        System.out.println(twoAsOneSokution(3, 1, 2));
        System.out.println(twoAsOneSokution(3, 2, 2));
    }

    public static boolean twoAsOneSokution(int a, int b, int c) {
        return (a == b + c || b == a + c || c == a + b);
    }
}
