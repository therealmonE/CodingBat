package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
 * Return true if the array does not contain any triples.
 *
 * noTriples([1, 1, 2, 2, 1]) → true
 * noTriples([1, 1, 2, 2, 2, 1]) → false
 * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */

public class noTriples extends SolutionClass {

    @Override
    public void showSolution() {
        System.out.println(noTriplesSolution(new int[] {1, 1, 2, 2, 1}));
        System.out.println(noTriplesSolution(new int[] {1, 1, 2, 2, 2, 1}));
        System.out.println(noTriplesSolution(new int[] {1, 1, 1, 2, 2, 2, 1}));
    }

    public static boolean noTriplesSolution (int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == array[i + 1] && array[i] == array[i + 2])
                return false;
        }
        return true;
    }

}
