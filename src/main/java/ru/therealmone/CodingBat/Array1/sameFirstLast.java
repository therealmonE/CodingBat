package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 30.04.2018.
 *
 * Given an array of ints, return true if the array is length 1 or more,
 * and the first element and the last element are equal.
 *
 * sameFirstLast([1, 2, 3]) → false
 * sameFirstLast([1, 2, 3, 1]) → true
 * sameFirstLast([1, 2, 1]) → true
 */

public class sameFirstLast extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(sameFirstLastSolution(new int[] {1, 2, 3}));
        System.out.println(sameFirstLastSolution(new int[] {1, 2, 3, 1}));
        System.out.println(sameFirstLastSolution(new int[] {1, 2, 1}));
    }

    public static boolean sameFirstLastSolution(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }
}
