package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 19.04.2018.
 *
 *
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the strings are different lengths, omit chars from the longer string
 * so it is the same length as the shorter string.
 * So "Hello" and "Hi" yield "loHi". The strings may be any length.
 *
 *
 * minCat("Hello", "Hi") → "loHi"
 * minCat("Hello", "java") → "ellojava"
 * minCat("java", "Hello") → "javaello"
 */

public class minCat extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(minCatSolution("Hello", "Hi"));
        System.out.println(minCatSolution("Hello", "java"));
        System.out.println(minCatSolution("java", "Hello"));
    }

    public static String minCatSolution(String a, String b) {
        return (
                a.length() > b.length() ?
                        a.substring(a.length() - b.length(), a.length()) + b
                        : a + b.substring(b.length() - a.length(), b.length())
                );
    }
}
