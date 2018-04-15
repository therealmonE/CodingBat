package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 06.07.2017.
 *
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
 *
 * icyHot(120, -1) → true
 * icyHot(-1, 120) → true
 * icyHot(2, 120) → false
 */

public class icyHot extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(icyHotSolution(120, -1));
        System.out.println(icyHotSolution(-1, 120));
        System.out.println(icyHotSolution(2, 120));
    }

    public static boolean icyHotSolution (int temp1, int temp2) {
            return (temp2 < 0 && temp1 > 100) || (temp2 > 100 && temp1 < 0);
    }
}
