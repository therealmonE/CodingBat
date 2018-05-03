package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 03.05.2018.
 *
 * Given an array of ints of odd length, look at the first, last,
 * and middle values in the array and return the largest.
 * The array length will be a least 1.
 *
 * maxTriple([1, 2, 3]) → 3
 * maxTriple([1, 5, 3]) → 5
 * maxTriple([5, 2, 3]) → 5
 */

public class maxTriple extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(maxTripleSolution(new int[] {1, 2, 3}));
        System.out.println(maxTripleSolution(new int[] {1, 5, 3}));
        System.out.println(maxTripleSolution(new int[] {5, 2, 3}));
    }

    public static int maxTripleSolution(int[] nums) {
        return (
                nums[0] > nums[nums.length / 2] ?
                        nums[0] > nums[nums.length - 1] ? nums[0] : nums[nums.length - 1]
                        : nums[nums.length / 2] > nums[nums.length - 1] ? nums[nums.length / 2] : nums[nums.length - 1]
                );
    }
}
