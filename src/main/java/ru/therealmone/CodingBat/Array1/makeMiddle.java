package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 30.04.2018.
 *
 * Given an array of ints of even length,
 * return a new array length 2 containing the middle two elements from the original array.
 * The original array will be length 2 or more.
 *
 * makeMiddle([1, 2, 3, 4]) → [2, 3]
 * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
 * makeMiddle([1, 2]) → [1, 2]
 */

public class makeMiddle extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(makeMiddleSolution(new int[] {1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeMiddleSolution(new int[] {7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(makeMiddleSolution(new int[] {1, 2})));
    }

    public static int[] makeMiddleSolution(int[] nums) {
        return new int[] {nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }
}
