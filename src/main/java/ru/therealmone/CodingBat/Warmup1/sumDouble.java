package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 13.04.2018.
 *
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 *
 * sumDouble(1, 2) → 3
 * sumDouble(3, 2) → 5
 * sumDouble(2, 2) → 8
 */

public class sumDouble {
    public static int sumDoubleSolution(int a, int b) {
        return((a + b) * (a == b ? 2 : 1));
    }
}
