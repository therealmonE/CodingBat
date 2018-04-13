package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 06.07.2017.
 *
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 2 int values, return true if one or the other is teen, but not both.
 *
 * loneTeen(13, 99) → true
 * loneTeen(21, 19) → true
 * loneTeen(13, 13) → false
 */

public class loneTeen {
    public static boolean loneTeenSolution (int a, int b) {
        if (a >= 13 && a <= 19)
            return !(b >= 13 && b <= 19);
        else if (b >= 13 && b <= 19)
            return !(a >= 13 && a <= 19);
        else
            return false;
    }

}
