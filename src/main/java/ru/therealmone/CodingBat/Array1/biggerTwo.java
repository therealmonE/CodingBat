package ru.therealmone.CodingBat.Array1;

import ru.therealmone.CodingBat.SolutionClass;
import java.util.Arrays;

/**
 * Created by monE on 03.05.2018.
 *
 * Start with 2 int arrays, a and b, each length 2.
 * Consider the sum of the values in each array.
 * Return the array which has the largest sum. In event of a tie, return a.
 *
 * biggerTwo([1, 2], [3, 4]) → [3, 4]
 * biggerTwo([3, 4], [1, 2]) → [3, 4]
 * biggerTwo([1, 1], [1, 2]) → [1, 2]
 */

public class biggerTwo extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(Arrays.toString(biggerTwoSolution(new int[] {1, 2}, new int[] {3, 4})));
        System.out.println(Arrays.toString(biggerTwoSolution(new int[] {3, 4}, new int[] {1, 2})));
        System.out.println(Arrays.toString(biggerTwoSolution(new int[] {1, 1}, new int[] {1, 2})));
    }

    public static int[] biggerTwoSolution(int[] a, int[] b) {
        int suma = 0;
        int sumb = 0;

        for(int num: a) {
            suma += num;
        }

        for(int num: b) {
            sumb += num;
        }

        return (suma > sumb ? a : b);
    }
}
