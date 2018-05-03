package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 30.04.2018.
 *
 * Given an array of ints, return true if 6 appears as either the first
 * or last element in the array.
 * The array will be length 1 or more.
 *
 * firstLast6([1, 2, 6]) → true
 * firstLast6([6, 1, 2, 3]) → true
 * firstLast6([13, 6, 1, 2, 3]) → false
 */

public class firstLast6 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(firstLast6Solution(new int[] {1, 2, 6}));
        System.out.println(firstLast6Solution(new int[] {6, 1, 2, 3}));
        System.out.println(firstLast6Solution(new int[] {13, 6, 1, 2, 3}));
    }

    public static boolean firstLast6Solution(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
