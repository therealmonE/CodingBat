package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 13.04.2018.
 *
 * Given 2 int values, return true if they are both in the range 30..40 inclusive,
 * or they are both in the range 40..50 inclusive.
 *
 * in3050(30, 31) → true
 * in3050(30, 41) → false
 * in3050(40, 50) → true
 */

public class in3050 extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(in3050Solution(30, 31));
        System.out.println(in3050Solution(30, 41));
        System.out.println(in3050Solution(40, 50));
    }

    public static boolean in3050Solution(int a, int b) {
        return(
                (40 - a <= 10 && a - 30 <= 10) && (40 - b <= 10 && b - 30 <= 10) ||
                        (50 - a <= 10 && a - 40 <= 10) && (50 - b <= 10 && b - 40 <=10)
                );
    }
}
