package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 01.05.2018.
 *
 * Given 2 int arrays, each length 2,
 * return a new array length 4 containing all their elements.
 *
 * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
 * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
 * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */


public class plusTwo extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(plusTwoSolution(new int[] {1, 2}, new int[] {3, 4})));
        System.out.println(Arrays.toString(plusTwoSolution(new int[] {4, 4}, new int[] {2, 2})));
        System.out.println(Arrays.toString(plusTwoSolution(new int[] {9, 2}, new int[] {3, 4})));
    }

    public static int[] plusTwoSolution(int[] a, int[] b) {
        int[] ret = new int[a.length + b.length];
        System.arraycopy(a, 0, ret, 0, a.length);
        System.arraycopy(b, 0, ret, a.length, b.length);
        return ret;
    }
}
