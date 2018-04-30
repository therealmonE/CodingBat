package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 30.04.2018.
 *
 * Given an array of ints length 3, return the sum of all the elements.
 *
 * sum3([1, 2, 3]) → 6
 * sum3([5, 11, 2]) → 18
 * sum3([7, 0, 0]) → 7
 */

public class sum3 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(sum3Solution(new int[] {1, 2, 3}));
        System.out.println(sum3Solution(new int[] {5, 11, 2}));
        System.out.println(sum3Solution(new int[] {7, 0, 0}));
    }

    public static int sum3Solution(int[] nums) {
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        return sum;
    }
}
