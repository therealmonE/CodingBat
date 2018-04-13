package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 13.04.2018.
 *
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */

public class frontBack {
    public static String frontBackSolution(String str) {
        char tmp = str.length() > 1 ? str.charAt(str.length() - 1) : str.charAt(0);
        return(str.length() > 1 ?
                tmp + String.copyValueOf(str.toCharArray(), 1, str.length() - 2) + str.charAt(0)
                : str
        );
    }
}
