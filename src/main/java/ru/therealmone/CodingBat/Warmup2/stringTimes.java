package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 *
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 */

public class stringTimes extends SolutionClass {

    public static String stringTimesSolution (String s, int n) {
        String newS = "";

        for (int i = 0; i < n; i++) {
            newS += s;
        }

        return newS;
    }

    @Override
    public void showSolution() {
        System.out.println(stringTimesSolution("Hi", 2));
        System.out.println(stringTimesSolution("Hi", 3));
        System.out.println(stringTimesSolution("Hi", 1));
    }
}
