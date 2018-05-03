package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 30.04.2018.
 *
 * Given an array of ints of odd length,
 * return a new array length 3 containing the elements from the middle of the array.
 * The array length will be at least 3.
 *
 * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
 * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
 * midThree([1, 2, 3]) → [1, 2, 3]
 */

public class midThree extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(midThreeSolution(new int [] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(midThreeSolution(new int [] {8, 6, 7, 5, 3, 0, 9})));
        System.out.println(Arrays.toString(midThreeSolution(new int [] {1, 2, 3})));
    }

    public static int[] midThreeSolution(int[] nums) {
        int mid = nums.length / 2;
        return new int[] {nums[mid- 1], nums[mid], nums[mid + 1]};
    }
}
