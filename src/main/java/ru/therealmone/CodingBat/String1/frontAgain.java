package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 18.04.2018.
 *
 * Given a string, return true if the first 2 chars in the string
 * also appear at the end of the string, such as with "edited".
 *
 * frontAgain("edited") → true
 * frontAgain("edit") → false
 * frontAgain("ed") → true
 */

public class frontAgain extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(frontAgainSolution("edited"));
        System.out.println(frontAgainSolution("edit"));
        System.out.println(frontAgainSolution("ed"));
    }

    public static boolean frontAgainSolution(String str) {
        try {
            return str.substring(0,2)
                    .equals(str.substring(str.length() - 2, str.length()));
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }
}
