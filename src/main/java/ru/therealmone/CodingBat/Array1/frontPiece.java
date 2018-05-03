package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 03.05.2018.
 *
 * Given an int array of any length,
 * return a new array of its first 2 elements.
 * If the array is smaller than length 2,
 * use whatever elements are present.
 *
 * frontPiece([1, 2, 3]) → [1, 2]
 * frontPiece([1, 2]) → [1, 2]
 * frontPiece([1]) → [1]
 */

public class frontPiece extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(frontPieceSolution(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(frontPieceSolution(new int[] {1, 2})));
        System.out.println(Arrays.toString(frontPieceSolution(new int[] {1})));
    }

    public static int[] frontPieceSolution(int[] nums) {
        int[] tmp;
        try {
            tmp = new int[2];
            System.arraycopy(nums, 0, tmp, 0, 2);
        } catch (IndexOutOfBoundsException e) {
            tmp =  new int[nums.length];
            System.arraycopy(nums, 0, tmp, 0, nums.length);
        }
        return tmp;
    }
}
