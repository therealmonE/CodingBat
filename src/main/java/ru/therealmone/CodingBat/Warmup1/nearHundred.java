package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 06.07.2017.
 *
 * Given an int n, return true if it is within 10 of 100 or 200.
 * Note: Math.abs(num) computes the absolute value of a number.
 *
 * nearHundred(93) → true
 * nearHundred(90) → true
 * nearHundred(89) → false
 */

public class nearHundred extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(nearHundredSolution(93));
        System.out.println(nearHundredSolution(90));
        System.out.println(nearHundredSolution(89));
    }

    public static boolean nearHundredSolution (int a) {
        return Math.abs(100 - a) <= 10 || Math.abs(200 - a) <= 10;
    }
}
