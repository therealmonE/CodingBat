package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 30.04.2018.
 *
 * Given an array of ints length 3, return a new array with the elements in reverse order,
 * so {1, 2, 3} becomes {3, 2, 1}.
 *
 * reverse3([1, 2, 3]) → [3, 2, 1]
 * reverse3([5, 11, 9]) → [9, 11, 5]
 * reverse3([7, 0, 0]) → [0, 0, 7]
 */

public class reverse3 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(reverse3Solution(new int[] {1,2,3})));
        System.out.println(Arrays.toString(reverse3Solution(new int[] {5,11,9})));
        System.out.println(Arrays.toString(reverse3Solution(new int[] {7,0,0})));
    }

    public static int[] reverse3Solution (int[] nums) {
        int[] newArray = new int[3];
        for (int i = 0; i < nums.length; i++) {
            newArray[2 - i] = nums[i];
        }
        return newArray;
    }
}
