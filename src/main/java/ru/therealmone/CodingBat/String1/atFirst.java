package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 19.04.2018.
 *
 *
 * Given a string, return a string length 2 made of its first 2 chars.
 * If the string length is less than 2, use '@' for the missing chars.
 *
 * atFirst("hello") → "he"
 * atFirst("hi") → "hi"
 * atFirst("h") → "h@"
 */

public class atFirst extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(atFirstSolution("hello"));
        System.out.println(atFirstSolution("hi"));
        System.out.println(atFirstSolution("h"));
    }

    public static String atFirstSolution(String str) {
        try {
            return str.substring(0, 2);
        } catch (IndexOutOfBoundsException e) {
            return str.charAt(0) + "@";
        }
    }
}
