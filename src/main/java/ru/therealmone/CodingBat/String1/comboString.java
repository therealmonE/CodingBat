package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 19.04.2018.
 *
 *
 * Given 2 strings, a and b, return a string of the form short+long+short,
 * with the shorter string on the outside and the longer string on the inside.
 * The strings will not be the same length, but they may be empty (length 0).
 *
 * comboString("Hello", "hi") → "hiHellohi"
 * comboString("hi", "Hello") → "hiHellohi"
 * comboString("aaa", "b") → "baaab"
 */

public class comboString extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(comboStringSolution("Hello", "hi"));
        System.out.println(comboStringSolution("hi", "Hello"));
        System.out.println(comboStringSolution("aaa", "b"));
    }

    public static String comboStringSolution(String a, String b) {
        return (
                a.length() > b.length() ?
                        b + a + b
                        : a + b + a
                );
    }
}
