package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 30.04.2018.
 *
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 *
 * no23([4, 5]) → true
 * no23([4, 2]) → false
 * no23([3, 5]) → false
 */

public class no23 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(no23Solution(new int[] {4, 5}));
        System.out.println(no23Solution(new int[] {4, 2}));
        System.out.println(no23Solution(new int[] {3, 5}));
    }

    public static boolean no23Solution(int[] nums) {
        for (int number: nums) {
            if (number == 2 || number == 3)
                return false;
        }
        return true;
    }
}
