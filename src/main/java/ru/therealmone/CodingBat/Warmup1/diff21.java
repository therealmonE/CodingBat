package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 06.07.2017.
 *
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 *
 * diff21(19) → 2
 * diff21(10) → 11
 * diff21(21) → 0
 */

public class diff21 extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(diff21Solution(19));
        System.out.println(diff21Solution(10));
        System.out.println(diff21Solution(21));
    }

    public static int diff21Solution(int a) {
        return (Math.abs(21 - a));
    }
}
