package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 06.07.2017.
 *
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 3 int values, return true if 1 or more of them are teen.
 *
 * hasTeen(13, 20, 10) → true
 * hasTeen(20, 19, 10) → true
 * hasTeen(20, 10, 13) → true
 */

public class hasTeen extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(hasTeenSolution(13,20,10));
        System.out.println(hasTeenSolution(20,19,10));
        System.out.println(hasTeenSolution(20,10,13));
    }

    public static boolean hasTeenSolution (int a, int b, int c) {
        return ( (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19) );
    }
}
