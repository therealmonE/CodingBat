package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 01.05.2018.
 *
 * Start with 2 int arrays, a and b, of any length.
 * Return how many of the arrays have 1 as their first element.
 *
 * start1([1, 2, 3], [1, 3]) → 2
 * start1([7, 2, 3], [1]) → 1
 * start1([1, 2], []) → 1
 */

public class start1 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(start1Solution(new int[] {1, 2, 3}, new int[] {1, 3}));
        System.out.println(start1Solution(new int[] {7, 2, 3}, new int[] {1}));
        System.out.println(start1Solution(new int[] {1, 2}, new int[] {}));
    }

    public static int start1Solution(int[] a, int[] b) {
        int count = a[0] == 1 ? 1 : 0;
        try {
            return (b[0] == 1 ? count + 1 : count);
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
}
