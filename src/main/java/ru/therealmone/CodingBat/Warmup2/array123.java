package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 *
 * array123([1, 1, 2, 3, 1]) → true
 * array123([1, 1, 2, 4, 1]) → false
 * array123([1, 1, 2, 1, 2, 3]) → true
 */

public class array123 extends SolutionClass {

    @Override
    public void showSolution() {
        System.out.println(array123Solution(new int[] {1, 1, 2, 3, 1}));
        System.out.println(array123Solution(new int[] {1, 1, 2, 4, 1}));
        System.out.println(array123Solution(new int[] {1, 1, 2, 1, 2, 3}));
    }

    public static boolean array123Solution (int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == 1 && array[i + 1] == 2 && array[i + 2] == 3)
                return true;
        }
        return false;
    }

}
