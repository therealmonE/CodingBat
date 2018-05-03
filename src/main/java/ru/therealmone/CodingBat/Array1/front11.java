package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 03.05.2018.
 *
 * Given 2 int arrays, a and b, of any length,
 * return a new array with the first element of each array.
 * If either array is length 0, ignore that array.
 *
 * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
 * front11([1], [2]) → [1, 2]
 * front11([1, 7], []) → [1]
 */

public class front11 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(front11Solution(new int[] {1, 2, 3}, new int[] {7, 9, 8})));
        System.out.println(Arrays.toString(front11Solution(new int[] {1}, new int[] {2})));
        System.out.println(Arrays.toString(front11Solution(new int[] {1, 7}, new int[] {})));
    }

    public static int[] front11Solution(int[] a, int[] b) {
        return (
                a.length >= 1 ?
                        b.length >= 1 ? new int[] {a[0], b[0]} : new int[] {a[0]}
                        : b.length >= 1 ? new int[] {b[0]} : new int[] {}
                );
    }
}
