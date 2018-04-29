package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 29.04.2018.
 *
 * Return the sum of two 6-sided dice rolls, each in the range 1..6.
 * However, if noDoubles is true, if the two dice show the same value,
 * increment one die to the next value, wrapping around to 1 if its value was 6.
 *
 * withoutDoubles(2, 3, true) → 5
 * withoutDoubles(3, 3, true) → 7
 * withoutDoubles(3, 3, false) → 6
 */

public class withoutDoubles extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(withoutDoubleSolution(2, 3, true));
        System.out.println(withoutDoubleSolution(3, 3, true));
        System.out.println(withoutDoubleSolution(3, 3, false));
    }

    public static int withoutDoubleSolution(int die1, int die2, boolean noDoubles) {
        return (
                die1 == die2 ?
                        noDoubles ? die1 + (die2 + 1) % 6 : die1 + die2
                        : die1 + die2
                );
    }
}
