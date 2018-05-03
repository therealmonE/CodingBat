package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 03.05.2018.
 *
 * Given an int array length 2, return true if it contains a 2 or a 3.
 *
 * has23([2, 5]) → true
 * has23([4, 3]) → true
 * has23([4, 5]) → false
 */

public class has23 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(has23Solution(new int[] {2, 5}));
        System.out.println(has23Solution(new int[] {4, 3}));
        System.out.println(has23Solution(new int[] {4, 5}));
    }

    public static boolean has23Solution(int[] nums) {
        for (int num: nums) {
            if (num == 2 || num == 3)
                return true;
        }
        return false;
    }
}
