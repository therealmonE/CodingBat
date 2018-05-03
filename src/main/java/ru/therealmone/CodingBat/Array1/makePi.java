package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 03.05.2018.
 *
 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
 *
 * makePi() → [3, 1, 4]
 */

public class makePi extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(makePiSolution()));
    }

    public static int[] makePiSolution() {
        return new int[] {3, 1, 4};
    }
}
