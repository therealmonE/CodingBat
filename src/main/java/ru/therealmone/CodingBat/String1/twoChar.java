package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 19.04.2018.
 *
 *
 * Given a string and an index, return a string length 2 starting at the given index.
 * If the index is too big or too small to define a string length 2,
 * use the first 2 chars. The string length will be at least 2.
 *
 * twoChar("java", 0) → "ja"
 * twoChar("java", 2) → "va"
 * twoChar("java", 3) → "ja"
 */

public class twoChar extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(twoCharSolution("java", 0));
        System.out.println(twoCharSolution("java", 2));
        System.out.println(twoCharSolution("java", 3));
    }

    public static String twoCharSolution(String str, int index) {
        try {
            return str.substring(index, index + 2);
        } catch (IndexOutOfBoundsException e) {
            return str.substring(0, 2);
        }
    }
}
