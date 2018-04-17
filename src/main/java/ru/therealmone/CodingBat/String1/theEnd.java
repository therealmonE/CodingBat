package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 10.07.2017.
 *
 * Given a string, return a string length 1 from its front, unless front is false,
 * in which case return a string length 1 from its back. The string will be non-empty.
 *
 * theEnd("Hello", true) → "H"
 * theEnd("Hello", false) → "o"
 * theEnd("oh", true) → "o"
 */

public class theEnd extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(theEndSolution("Hello", true));
        System.out.println(theEndSolution("Hello", false));
        System.out.println(theEndSolution("oh", true));
    }

    public static String theEndSolution (String a, boolean front) {
        if (front)
            return Character.toString(a.charAt(0));
        else
            return Character.toString(a.charAt(a.length() - 1));
    }
}
