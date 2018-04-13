package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 13.04.2018.
 *
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
 * or return 0 if neither is in that range.
 *
 * max1020(11, 19) → 19
 * max1020(19, 11) → 19
 * max1020(11, 9) → 11
 */

public class max1020 {
    public static int max1020Solution(int a, int b) {
        return(
                (20 - a <= 10 && a - 10 <= 10 && Math.abs(20 - b) >= 10) ||
                        (20 - a <= 10 && a - 10 <= 10 && 20 - b <= 10 && b - 10 <= 10 && a > b) ?
                        a : b
                );
    }
}
