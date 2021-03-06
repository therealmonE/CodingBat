package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 06.07.2017.
 *
 * Given a string, take the last char and return a new string with the last char added at the front and back,
 * so "cat" yields "tcatt". The original string will be length 1 or more.
 *
 * backAround("cat") → "tcatt"
 * backAround("Hello") → "oHelloo"
 * backAround("a") → "aaa"
 */

public class backAround extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(backAroundSolution("cat"));
        System.out.println(backAroundSolution("Hello"));
        System.out.println(backAroundSolution("a"));
    }

    public static String backAroundSolution (String s) {
        String newS = "";

        newS += s.charAt(s.length() - 1);
        newS += s;
        newS += s.charAt(s.length() - 1);

        return newS;
    }
}
