package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 30.04.2018.
 *
 * Given 2 arrays of ints, a and b,
 * return true if they have the same first element
 * or they have the same last element.
 * Both arrays will be length 1 or more.
 *
 * commonEnd([1, 2, 3], [7, 3]) → true
 * commonEnd([1, 2, 3], [7, 3, 2]) → false
 * commonEnd([1, 2, 3], [1, 3]) → true
 */

public class commonEnd extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(commonEndSolution(new int[] {1, 2, 3}, new int[] {7, 3}));
        System.out.println(commonEndSolution(new int[] {1, 2, 3}, new int[] {7, 3, 2}));
        System.out.println(commonEndSolution(new int[] {1, 2, 3}, new int[] {1, 3}));
    }

    public static boolean commonEndSolution (int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}
