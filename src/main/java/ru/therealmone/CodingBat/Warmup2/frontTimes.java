package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
 * or whatever is there if the string is less than length 3. Return n copies of the front;
 *
 * frontTimes("Chocolate", 2) → "ChoCho"
 * frontTimes("Chocolate", 3) → "ChoChoCho"
 * frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class frontTimes extends SolutionClass{

    @Override
    public void showSolution() {
        System.out.println(frontTimesSolution("Chocolate", 2));
        System.out.println(frontTimesSolution("Chocolate", 3));
        System.out.println(frontTimesSolution("Abc", 3));
    }

    public static String frontTimesSolution (String s, int n) {
        String newS = "";

        if (s.length() < 3) {
            for (int i = 0; i < n; i++) {
                newS += s;
            }
        } else {
            for (int i = 0; i < n; i++) {
                newS += s.substring(0,3);
            }
        }

        return newS;
    }
}
