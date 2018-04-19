package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 10.07.2017.
 *
 * Given a string of odd length, return the string length 3 from its middle,
 * so "Candy" yields "and".
 * The string length will be at least 3.
 *
 * middleThree("Candy") → "and"
 * middleThree("and") → "and"
 * middleThree("solving") → "lvi"
 */

public class middleThree extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(middleThreeSolution("Candy"));
        System.out.println(middleThreeSolution("and"));
        System.out.println(middleThreeSolution("solving"));
    }

    public static String middleThreeSolution (String a) {
        return a.substring(a.length()/2 - 1, a.length()/2 + 2);
    }
}
