package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 06.07.2017.
 *
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 *
 * sleepIn(false, false) → true
 * sleepIn(true, false) → false
 * sleepIn(false, true) → true
 */

public class sleepIn extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(sleepInSolution(false, false));
        System.out.println(sleepInSolution(true, false));
        System.out.println(sleepInSolution(false, true));
    }

    public static boolean sleepInSolution (boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
