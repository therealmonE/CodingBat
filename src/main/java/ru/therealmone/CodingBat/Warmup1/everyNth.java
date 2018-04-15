package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * Given a non-empty string and an int N, return the string made starting with char 0,
 * and then every Nth char of the string.
 * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 *
 * everyNth("Miracle", 2) → "Mrce"
 * everyNth("abcdefg", 2) → "aceg"
 * everyNth("abcdefg", 3) → "adg"
 */

public class everyNth extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(everyNthSolution("Miracle", 2));
        System.out.println(everyNthSolution("abcdefg", 2));
        System.out.println(everyNthSolution("abcdefg", 3));
    }

    public static String everyNthSolution (String s, int n) {
        char[] charArray = s.toCharArray();
        StringBuilder newS = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            if (i % n == 0)
                newS.append(charArray[i]);
        }

        return newS.toString();
    }
}
