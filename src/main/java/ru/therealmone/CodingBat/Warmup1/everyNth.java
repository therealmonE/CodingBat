package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 09.07.2017.
 * Given a non-empty string and an int N, return the string made starting with char 0,
 * and then every Nth char of the string.
 * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 * everyNth("Miracle", 2) → "Mrce"
 * everyNth("abcdefg", 2) → "aceg"
 * everyNth("abcdefg", 3) → "adg"
 */
public class everyNth {
    public static String everyNthSolution (String s, int n) {
        char[] charArray = s.toCharArray();
        String newS = "";

        for (int i = 0; i < charArray.length; i++) {
            if (i % n == 0)
                newS += charArray[i];
        }

        return newS;
    }
}
