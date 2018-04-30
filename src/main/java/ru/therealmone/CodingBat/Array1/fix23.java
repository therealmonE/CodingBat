package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 30.04.2018.
 *
 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
 * set the 3 element to 0. Return the changed array.
 *
 * fix23([1, 2, 3]) → [1, 2, 0]
 * fix23([2, 3, 5]) → [2, 0, 5]
 * fix23([1, 2, 1]) → [1, 2, 1]
 */

public class fix23 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(fix23Solution(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(fix23Solution(new int[] {2, 3, 5})));
        System.out.println(Arrays.toString(fix23Solution(new int[] {1, 2, 1})));
    }

    public static int[] fix23Solution(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 2 && nums[i + 1] == 3)
                nums[i + 1] = 0;
        }
        return nums;
    }
}
