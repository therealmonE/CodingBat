package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;


/**
 * Created by monE on 03.05.2018.
 *
 * Given 2 int arrays, a and b, return a new array length 2 containing,
 * as much as will fit, the elements from a followed by the elements from b.
 * The arrays may be any length, including 0,
 * but there will be 2 or more elements available between the 2 arrays.
 *
 * make2([4, 5], [1, 2, 3]) → [4, 5]
 * make2([4], [1, 2, 3]) → [4, 1]
 * make2([], [1, 2]) → [1, 2]
 */

public class make2 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(make2Solution(new int[] {4, 5}, new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(make2Solution(new int[] {4}, new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(make2Solution(new int[] {}, new int[] {1, 2})));
    }

    public static int[] make2Solution(int[] a, int[] b) {
        int[] tmp = new int[a.length + b.length];
        System.arraycopy(a, 0, tmp, 0, a.length);
        System.arraycopy(b, 0, tmp, a.length, b.length);
        return (new int[] {tmp[0], tmp[1]});
    }
}
