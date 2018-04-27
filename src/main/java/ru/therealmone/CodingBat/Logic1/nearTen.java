package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
 * Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
 * See also: Introduction to Mod
 *
 * nearTen(12) → true
 * nearTen(17) → false
 * nearTen(19) → true
 */

public class nearTen extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(nearTenSolution(12));
        System.out.println(nearTenSolution(17));
        System.out.println(nearTenSolution(19));
    }

    public static boolean nearTenSolution(int num) {
        return (num % 10 <= 2 || num % 10 >= 8);
    }
}
