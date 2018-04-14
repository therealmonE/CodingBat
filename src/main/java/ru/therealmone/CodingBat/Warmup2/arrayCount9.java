package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 10.07.2017.
 *
 * Given an array of ints, return the number of 9's in the array.
 *
 * arrayCount9([1, 2, 9]) → 1
 * arrayCount9([1, 9, 9]) → 2
 * arrayCount9([1, 9, 9, 3, 9]) → 3
 */

public class arrayCount9 extends SolutionClass {

    @Override
    public void showSolution() {
        System.out.println(arrayCount9Solution(new int[] {1, 2, 9}));
        System.out.println(arrayCount9Solution(new int[] {1, 9, 9}));
        System.out.println(arrayCount9Solution(new int[] {1, 9, 9, 3, 9}));
    }

    public static int arrayCount9Solution (int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9)
                count++;
        }

        return count;
    }

}
