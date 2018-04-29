package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * You have a blue lottery ticket, with ints a, b, and c on it. \
 * This makes three pairs, which we'll call ab, bc, and ac.
 * Consider the sum of the numbers in each pair.
 * If any pair sums to exactly 10, the result is 10.
 * Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
 * Otherwise the result is 0.
 *
 * blueTicket(9, 1, 0) → 10
 * blueTicket(9, 2, 0) → 0
 * blueTicket(6, 1, 4) → 10
 */

public class blueTicket extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(blueTicketSolution(9, 1, 0));
        System.out.println(blueTicketSolution(9, 2, 0));
        System.out.println(blueTicketSolution(6, 1, 4));
    }

    public static int blueTicketSolution(int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        return (
                (ab == 10 || ac == 10 || bc == 10) ? 10 :
                        (Math.abs(ab - ac) == 10 || Math.abs(ab - bc) == 10 || Math.abs(ac - bc) == 10) ? 5
                                : 0
                );
    }
}
