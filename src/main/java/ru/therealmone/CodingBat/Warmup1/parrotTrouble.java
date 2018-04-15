package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 13.04.2018.
 *
 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
 * Return true if we are in trouble.
 *
 * parrotTrouble(true, 6) → true
 * parrotTrouble(true, 7) → false
 * parrotTrouble(false, 6) → false
 */

public class parrotTrouble extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(parrotTroubleSolution(true, 6));
        System.out.println(parrotTroubleSolution(true, 7));
        System.out.println(parrotTroubleSolution(false, 6));
    }

    public static boolean parrotTroubleSolution(boolean talking, int hour) {
        return(talking && (hour < 7 || hour > 20));
    }
}
