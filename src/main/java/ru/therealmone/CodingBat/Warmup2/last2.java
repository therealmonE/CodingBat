package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * Given a string, return the count of the number of times that a substring length 2 appears in the string
 * and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
 *
 * last2("hixxhi") → 1
 * last2("xaxxaxaxx") → 1
 * last2("axxxaaxx") → 2
 */

public class last2 extends SolutionClass{

    @Override
    public void showSolution() {
        System.out.println(last2Solution("hixxhi"));
        System.out.println(last2Solution("xaxxaxaxx"));
        System.out.println(last2Solution("axxxaaxx"));
    }

    public static int last2Solution (String s) {
        String subS = s.substring(s.length() - 2);
        int count = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            String tempS = s.substring(i, i + 2);
            if (tempS.equals(subS))
                count++;
        }
        return count;
    }
}
