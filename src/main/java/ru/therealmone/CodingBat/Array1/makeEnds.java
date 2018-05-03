package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 30.04.2018.
 *
 * Given an array of ints, return a new array length 2 containing the first
 * and last elements from the original array.
 * The original array will be length 1 or more.
 *
 * makeEnds([1, 2, 3]) → [1, 3]
 * makeEnds([1, 2, 3, 4]) → [1, 4]
 * makeEnds([7, 4, 6, 2]) → [7, 2]
 */

public class makeEnds extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(makeEndsSolution(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(makeEndsSolution(new int[] {1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeEndsSolution(new int[] {7, 4, 6, 2})));
    }

    public static int[] makeEndsSolution(int[] nums) {
        return new int[] {nums[0], nums[nums.length - 1]};
    }
}
