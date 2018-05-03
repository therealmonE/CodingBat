package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 03.05.2018.
 *
 * Given an array of ints, swap the first and last elements in the array.
 * Return the modified array.
 * The array length will be at least 1.
 *
 * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
 * swapEnds([1, 2, 3]) → [3, 2, 1]
 * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */

public class swapEnds extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(swapEndsSolution(new int[] {1, 2, 3, 4})));
        System.out.println(Arrays.toString(swapEndsSolution(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(swapEndsSolution(new int[] {8, 6, 7, 9, 5})));
    }

    public static int[] swapEndsSolution(int[] nums) {
        int tmp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = tmp;
        return nums;
    }
}
