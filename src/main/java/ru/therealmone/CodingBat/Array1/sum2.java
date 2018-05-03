package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 03.05.2018.
 *
 * Given an array of ints, return the sum of the first 2 elements in the array.
 * If the array length is less than 2, just sum up the elements that exist,
 * returning 0 if the array is length 0.
 *
 * sum2([1, 2, 3]) → 3
 * sum2([1, 1]) → 2
 * sum2([1, 1, 1, 1]) → 2
 */

public class sum2 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(sum2Solution(new int[] {1, 2, 3}));
        System.out.println(sum2Solution(new int[] {1, 1}));
        System.out.println(sum2Solution(new int[] {1, 1, 1, 1}));
    }

    public static int sum2Solution(int[] nums) {
        int sum = 0;
        try {
            for (int i = 0; i < 2; i++) {
                sum += nums[i];
            }
        } catch (IndexOutOfBoundsException e) {}
        return sum;
    }
}
