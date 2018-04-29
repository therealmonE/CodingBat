package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 28.04.2018.
 *
 * The squirrels in Palo Alto spend most of the day playing.
 * In particular, they play if the temperature is between 60 and 90 (inclusive).
 * Unless it is summer, then the upper limit is 100 instead of 90.
 * Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
 *
 * squirrelPlay(70, false) → true
 * squirrelPlay(95, false) → false
 * squirrelPlay(95, true) → true
 */

public class squirrelPlay extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(squirrelPlaySolution(70, false));
        System.out.println(squirrelPlaySolution(95, false));
        System.out.println(squirrelPlaySolution(95, true));
    }

    public static boolean squirrelPlaySolution(int temp, boolean isSummer) {
        int summer = isSummer ? 10 : 0;
        return (
                (temp >= 60 && temp < 90 + summer)
                );
    }
}
