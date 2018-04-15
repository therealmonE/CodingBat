package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 15.04.2018.
 *
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed,
 * so "xxx" contains 2 "xx".
 *
 * countXX("abcxx") → 1
 * countXX("xxx") → 2
 * countXX("xxxx") → 3
 */

public class countXX extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(countXXSolution("abcxx"));
        System.out.println(countXXSolution("xxx"));
        System.out.println(countXXSolution("xxxx"));
    }

    public static int countXXSolution(String str) {
        int count = 0;
        while(str.contains("xx")) {
            str = str.replaceFirst("xx", "x");
            count++;
        }
        return count;
    }

}
