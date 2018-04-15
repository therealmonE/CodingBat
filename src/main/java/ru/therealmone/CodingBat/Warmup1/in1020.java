package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 06.07.2017.
 *
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 *
 * in1020(12, 99) → true
 * in1020(21, 12) → true
 * in1020(8, 99) → false
 */

public class in1020 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(in1020Solution(12, 99));
        System.out.println(in1020Solution(21, 12));
        System.out.println(in1020Solution(8, 99));
    }

    public static boolean in1020Solution (int a, int b) {
        return ( (a >= 10 && a <= 20) || (b >= 10 && b <= 20) );
    }
}
