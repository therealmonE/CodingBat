package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 30.04.2018.
 *
 * Given 2 int arrays, a and b, each length 3,
 * return a new array length 2 containing their middle elements.
 *
 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
 * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
 * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */

public class middleWay extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(middleWaySolution(new int[] {1,2,3}, new int[] {4,5,6})));
        System.out.println(Arrays.toString(middleWaySolution(new int[] {7,7,7}, new int[] {3,8,0})));
        System.out.println(Arrays.toString(middleWaySolution(new int[] {5,2,9}, new int[] {1,4,5})));
    }


    public static int[] middleWaySolution (int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }
}
