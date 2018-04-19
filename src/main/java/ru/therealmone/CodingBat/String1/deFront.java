package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 19.04.2018.
 *
 *
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 * The string may be any length. Harder than it looks.
 *
 * deFront("Hello") → "llo"
 * deFront("java") → "va"
 * deFront("away") → "aay"
 */

public class deFront extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(deFrontSolution("Hello"));
        System.out.println(deFrontSolution("java"));
        System.out.println(deFrontSolution("away"));
    }

    public static String deFrontSolution(String str) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(i == 0 && str.charAt(i) == 'a')
                tmp.append('a');
            else if(i == 1 && str.charAt(i) == 'b')
                tmp.append('b');
            else if(i > 1)
                tmp.append(str.charAt(i));
        }
        return tmp.toString();
    }
}
