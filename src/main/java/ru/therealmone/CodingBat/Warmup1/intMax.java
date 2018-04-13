package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 13.04.2018.
 *
 * Given three int values, a b c, return the largest.
 *
 * intMax(1, 2, 3) → 3
 * intMax(1, 3, 2) → 3
 * intMax(3, 2, 1) → 3
 */

public class intMax {
    public static int intMaxSolution(int a, int b, int c) {
        return(
                a > b ?
                        a > c ? a : c
                        : b > c ? b : c
                );
    }
}
