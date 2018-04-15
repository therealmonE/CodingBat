package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 15.04.2018.
 *
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 *
 * stringSplosion("Code") → "CCoCodCode"
 * stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"
 */

public class stringSplosion extends SolutionClass{
    @Override
    public void showSolution(){
        System.out.println(stringSplosionSolution("Code"));
        System.out.println(stringSplosionSolution("abc"));
        System.out.println(stringSplosionSolution("ab"));
    }

    public static String stringSplosionSolution(String str) {
        String tmp = "";
        for (int i = 1; i < str.length() + 1; i++) {
            tmp += String.copyValueOf(str.toCharArray(), 0, i);
        }
        return tmp;
    }
}
