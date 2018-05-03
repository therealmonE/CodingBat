package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 03.05.2018.
 *
 * Given an int array, return true if the array contains 2 twice, or 3 twice.
 * The array will be length 0, 1, or 2.
 *
 * double23([2, 2]) → true
 * double23([3, 3]) → true
 * double23([2, 3]) → false
 */

public class double23 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(double23Solution(new int[] {2, 2}));
        System.out.println(double23Solution(new int[] {3, 3}));
        System.out.println(double23Solution(new int[] {2, 3}));
    }

    public static boolean double23Solution(int[] nums) {
        int count2 = 0;
        int count3 = 0;
        for(int num: nums) {
            count2 += num == 2 ? 1 : 0;
            count3 += num == 3 ? 1 : 0;
        }
        return (count2 >= 2 || count3 >= 2);
    }
}
