package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 *
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */

public class doubleX extends SolutionClass {

    @Override
    public void showSolution() {
        System.out.println(doubleXSolution("axxbb"));
        System.out.println(doubleXSolution("axaxax"));
        System.out.println(doubleXSolution("xxxx"));
    }

    public static boolean doubleXSolution (String s) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == 'x')
                return charArray[i + 1] == 'x';
        }

        return false;
    }

}
