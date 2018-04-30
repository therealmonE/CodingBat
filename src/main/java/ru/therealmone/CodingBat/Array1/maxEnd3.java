package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 30.04.2018.
 *
 * Given an array of ints length 3, figure out which is larger,
 * the first or last element in the array, and set all the other elements to be that value.
 * Return the changed array.
 *
 * maxEnd3([1, 2, 3]) → [3, 3, 3]
 * maxEnd3([11, 5, 9]) → [11, 11, 11]
 * maxEnd3([2, 11, 3]) → [3, 3, 3]
 */

public class maxEnd3 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(maxEnd3Solution(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(maxEnd3Solution(new int[] {11, 5, 9})));
        System.out.println(Arrays.toString(maxEnd3Solution(new int[] {2, 11, 3})));
    }

    public static int[] maxEnd3Solution (int[] nums) {
        return (
                nums[0] > nums[nums.length - 1] ?
                        new int[] {nums[0], nums[0], nums[0]}
                        : new int[] {nums[nums.length - 1], nums[nums.length - 1], nums[nums.length - 1]}
                );
    }
}
