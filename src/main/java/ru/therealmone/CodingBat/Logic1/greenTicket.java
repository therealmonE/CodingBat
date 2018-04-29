package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 29.04.2018.
 *
 * You have a green lottery ticket, with ints a, b, and c on it.
 * If the numbers are all different from each other, the result is 0.
 * If all of the numbers are the same, the result is 20.
 * If two of the numbers are the same, the result is 10.
 *
 * greenTicket(1, 2, 3) → 0
 * greenTicket(2, 2, 2) → 20
 * greenTicket(1, 1, 2) → 10
 */

public class greenTicket extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(greenTicketSolution(1,2,3));
        System.out.println(greenTicketSolution(2,2,2));
        System.out.println(greenTicketSolution(1,1,2));
    }

    public static int greenTicketSolution(int a, int b, int c) {
        return (
                a == b ?
                        b == c ? 20 : 10
                        : b == c ? 10 : 0
                );
    }
}
