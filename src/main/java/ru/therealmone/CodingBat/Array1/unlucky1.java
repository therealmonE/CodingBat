package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 30.04.2018.
 *
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
 * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
 *
 * unlucky1([1, 3, 4, 5]) → true
 * unlucky1([2, 1, 3, 4, 5]) → true
 * unlucky1([1, 1, 1]) → false
 */

public class unlucky1 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(unlucky1Solution(new int[] {1, 3, 4, 5}));
        System.out.println(unlucky1Solution(new int[] {2, 1, 3, 4, 5}));
        System.out.println(unlucky1Solution(new int[] {1, 1, 1}));
    }

    public static boolean unlucky1Solution(int[] nums) {
        return (
                nums[0] == 1 && nums[1] == 3 ||
                nums[1] == 1 && nums[2] == 3 ||
                nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3
                );
    }
}
