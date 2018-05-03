package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 30.04.2018.
 *
 * Given an int array, return a new array with double the length
 * where its last element is the same as the original array,
 * and all the other elements are 0. The original array will be length 1 or more.
 * Note: by default, a new int array contains all 0's.
 *
 * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
 * makeLast([1, 2]) → [0, 0, 0, 2]
 * makeLast([3]) → [0, 3]
 */

public class makeLast extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(makeLastSolution(new int[] {4, 5, 6})));
        System.out.println(Arrays.toString(makeLastSolution(new int[] {1, 2})));
        System.out.println(Arrays.toString(makeLastSolution(new int[] {3})));
    }

    public static int[] makeLastSolution(int[] nums) {
        int[] tmp = new int[nums.length * 2];
        tmp[tmp.length - 1] = nums[nums.length - 1];
        return tmp;
    }
}
