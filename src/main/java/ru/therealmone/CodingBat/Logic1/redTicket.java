package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
 * If they are all the value 2, the result is 10.
 * Otherwise if they are all the same, the result is 5.
 * Otherwise so long as both b and c are different from a, the result is 1.
 * Otherwise the result is 0.
 *
 * redTicket(2, 2, 2) → 10
 * redTicket(2, 2, 1) → 0
 * redTicket(0, 0, 0) → 5
 */

public class redTicket extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(redTicketSolution(2, 2, 2));
        System.out.println(redTicketSolution(2, 2, 1));
        System.out.println(redTicketSolution(0, 0, 0));
    }

    public static int redTicketSolution(int a, int b, int c) {
        return (
                (a == b && b == c && c == 2) ? 10
                        : (a == b && b == c) ? 5
                        : (Math.abs(a - b) == Math.abs(a - c)) ? 1
                        : 0
                );
    }
}
