package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 10.07.2017.
 *
 * Given a string of even length, return the first half.
 * So the string "WooHoo" yields "Woo".
 *
 * firstHalf("WooHoo") → "Woo"
 * firstHalf("HelloThere") → "Hello"
 * firstHalf("abcdef") → "abc"
 */

public class firstHalf extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(firstHalfSolution("WooHoo"));
        System.out.println(firstHalfSolution("HelloThere"));
        System.out.println(firstHalfSolution("abcdef"));
    }

    public static String firstHalfSolution (String a) {
        return a.substring(0, a.length() / 2);
    }
}
