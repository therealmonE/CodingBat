package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 18.04.2018.
 *
 * Given a string and an int n, return a string made of the first and last n chars from the string.
 * The string length will be at least n.
 *
 * nTwice("Hello", 2) → "Helo"
 * nTwice("Chocolate", 3) → "Choate"
 * nTwice("Chocolate", 1) → "Ce"
 */

public class nTwice extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(nTwiceSolution("Hello", 2));
        System.out.println(nTwiceSolution("Chocolate", 3));
        System.out.println(nTwiceSolution("Chocolate", 1));
    }

    public static String nTwiceSolution(String str, int n) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < n; i++)
            tmp.append(str.charAt(i));
        for (int i = n; i > 0; i--)
            tmp.append(str.charAt(str.length() - i));
        return tmp.toString();
    }
}
