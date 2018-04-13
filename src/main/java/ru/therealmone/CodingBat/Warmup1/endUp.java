package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 13.04.2018.
 *
 * Given a string, return a new string where the last 3 chars are now in upper case.
 * If the string has less than 3 chars, uppercase whatever is there.
 * Note that str.toUpperCase() returns the uppercase version of a string.
 *
 * endUp("Hello") → "HeLLO"
 * endUp("hi there") → "hi thERE"
 * endUp("hi") → "HI"
 */

public class endUp {
    public static String endUpSolution(String str) {
        try {
            return (String.copyValueOf(str.toCharArray(), 0, str.length() - 3) +
                    String.copyValueOf(str.toCharArray(), str.length() - 3, 3).toUpperCase());
        } catch (Exception e) {
            return str.toUpperCase();
        }
    }
}
