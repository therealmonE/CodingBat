package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 19.04.2018.
 *
 *
 * Given a string of any length, return a new string where the last 2 chars,
 * if present, are swapped, so "coding" yields "codign".
 *
 * lastTwo("coding") → "codign"
 * lastTwo("cat") → "cta"
 * lastTwo("ab") → "ba"
 */

public class lastTwo extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(lastTwoSolution("coding"));
        System.out.println(lastTwoSolution("cat"));
        System.out.println(lastTwoSolution("ab"));
    }

    public static String lastTwoSolution(String str) {
        StringBuilder tmp = new StringBuilder();
        tmp.append(str.charAt(str.length() - 1)).append(str.charAt(str.length() - 2));
        try {
            str = str.substring(0, str.length() - 2);
        } catch (IndexOutOfBoundsException e) {
            str = "";
        }
        return str + tmp;
    }
}
