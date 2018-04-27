package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
 * See also: Introduction to Mod
 *
 * more20(20) → false
 * more20(21) → true
 * more20(22) → true
 */

public class more20 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(more20Solution(20));
        System.out.println(more20Solution(21));
        System.out.println(more20Solution(22));
    }

    public static boolean more20Solution(int n) {
        return (n % 20 <= 2 && n % 20 >= 1);
    }
}
