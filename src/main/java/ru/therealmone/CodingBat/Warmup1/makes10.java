package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 13.04.2018.
 *
 * Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
 *
 * makes10(9, 10) → true
 * makes10(9, 9) → false
 * makes10(1, 9) → true
 */

public class makes10 {
    public static boolean makes10Solution(int a, int b) {
        return(a + b == 10 || a == 10 || b == 10);
    }
}
