package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 03.05.2018.
 *
 * Given an array of ints length 3,
 * return an array with the elements "rotated left"
 * so {1, 2, 3} yields {2, 3, 1}.
 *
 * rotateLeft3([1, 2, 3]) → [2, 3, 1]
 * rotateLeft3([5, 11, 9]) → [11, 9, 5]
 * rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */

public class rotateLeft3 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(rotateLeft3Solution(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(rotateLeft3Solution(new int[] {5, 11, 9})));
        System.out.println(Arrays.toString(rotateLeft3Solution(new int[] {7, 0, 0})));
    }

    public static int[] rotateLeft3Solution(int[] nums) {
        return new int[] {nums[2], nums[1], nums[0]};
    }
}
