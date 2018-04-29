package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * You are driving a little too fast, and a police officer stops you.
 * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
 * If speed is 60 or less, the result is 0.
 * If speed is between 61 and 80 inclusive, the result is 1.
 * If speed is 81 or more, the result is 2.
 * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
 *
 * caughtSpeeding(60, false) → 0
 * caughtSpeeding(65, false) → 1
 * caughtSpeeding(65, true) → 0
 */

public class caughtSpeeding extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(caughtSpeedingSolution(60, false));
        System.out.println(caughtSpeedingSolution(65, false));
        System.out.println(caughtSpeedingSolution(65, true));
    }

    public static int caughtSpeedingSolution(int speed, boolean isBirthday) {
        int tmp = isBirthday ? 5 : 0;
        return (
                (speed - tmp <= 60) ? 0
                        : (speed - tmp<= 80) ? 1
                        : 2
                );
    }
}
