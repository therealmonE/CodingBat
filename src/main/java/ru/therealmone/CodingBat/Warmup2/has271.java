package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 15.04.2018.
 *
 * Given an array of ints, return true if it contains a 2, 7, 1
 * pattern: a value, followed by the value plus 5, followed by the value minus 1.
 * Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
 *
 * has271([1, 2, 7, 1]) → true
 * has271([1, 2, 8, 1]) → false
 * has271([2, 7, 1]) → true
 */

public class has271 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(has271Solution(new int[] {1, 2, 7, 1}));
        System.out.println(has271Solution(new int[] {1, 2, 8, 1}));
        System.out.println(has271Solution(new int[] {2, 7, 1}));
    }

    public static boolean has271Solution(int[] nums) {
        int value = 2;
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] == 2)
                if (nums[i + 1] == value + 5 && nums[i + 2] == value - 1)
                        return true;
        }
        return false;

    }
}
