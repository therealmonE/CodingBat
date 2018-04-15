package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 15.04.2018.
 *
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
 * The array length may be less than 4.
 *
 * arrayFront9([1, 2, 9, 3, 4]) → true
 * arrayFront9([1, 2, 3, 4, 9]) → false
 * arrayFront9([1, 2, 3, 4, 5]) → false
 */

public class arrayFront9 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(arrayFront9Solution(new int[] {1, 2, 9, 3, 4}));
        System.out.println(arrayFront9Solution(new int[] {1, 2, 3, 4, 9}));
        System.out.println(arrayFront9Solution(new int[] {1, 2, 3, 4, 5}));
    }

    public static boolean arrayFront9Solution(int[] nums) {
        try{
            for (int i = 0; i < 4; i++) {
                if(nums[i] == 9)
                    return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
