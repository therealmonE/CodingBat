package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * When squirrels get together for a party, they like to have cigars.
 * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
 * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
 * Return true if the party with the given values is successful, or false otherwise.
 *
 * cigarParty(30, false) → false
 * cigarParty(50, false) → true
 * cigarParty(70, true) → true
 */

public class cigarParty extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(cigarPartySolution(30, false));
        System.out.println(cigarPartySolution(50, false));
        System.out.println(cigarPartySolution(70, true));
    }

    public static boolean cigarPartySolution(int cigar, boolean isWeekend) {
        return (isWeekend || (cigar >= 40 && cigar <= 60));
    }
}
