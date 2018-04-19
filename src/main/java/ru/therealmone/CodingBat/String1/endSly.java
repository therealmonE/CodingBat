package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 10.07.2017.
 *
 * Given a string, return true if it ends in "ly".
 *
 * endsLy("oddly") → true
 * endsLy("y") → false
 * endsLy("oddy") → false
 */

public class endSly extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(endSlySolution("oddly"));
        System.out.println(endSlySolution("y"));
        System.out.println(endSlySolution("oddy"));
    }

    public static boolean endSlySolution(String a) {
        return a.length() >= 2 && a.substring(a.length() - 2, a.length()).equals("ly");
    }
}
