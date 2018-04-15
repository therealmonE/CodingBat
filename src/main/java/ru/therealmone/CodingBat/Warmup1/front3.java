package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 13.04.2018.
 *
 * Given a string, we'll say that the front is the first 3 chars of the string.
 * If the string length is less than 3, the front is whatever is there.
 * Return a new string which is 3 copies of the front.
 *
 * front3("Java") → "JavJavJav"
 * front3("Chocolate") → "ChoChoCho"
 * front3("abc") → "abcabcabc"
 */

public class front3 extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(front3Solution("Java"));
        System.out.println(front3Solution("Chocolate"));
        System.out.println(front3Solution("abc"));
    }

    public static String front3Solution(String str) {
        String tmp = "";
        try {
            for (int i = 0; i < 3; i++) {
                tmp += str.charAt(i);
            }
        } catch (Exception e) {}
        return tmp + tmp + tmp;
    }
}
