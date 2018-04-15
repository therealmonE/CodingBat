package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 13.04.2018.
 *
 * Given a string, return a new string where "not " has been added to the front.
 * However, if the string already begins with "not", return the string unchanged.
 * Note: use .equals() to compare 2 strings.
 *
 * notString("candy") → "not candy"
 * notString("x") → "not x"
 * notString("not bad") → "not bad"
 */

public class notString extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(notStringSolution("candy"));
        System.out.println(notStringSolution("x"));
        System.out.println(notStringSolution("not bad"));
    }

    public static String notStringSolution(String str) {
        if(str.length() >= 4 && String.copyValueOf(str.toCharArray(), 0, 4).equals("not "))
            return str;
        else
            return "not " + str;
    }
}
