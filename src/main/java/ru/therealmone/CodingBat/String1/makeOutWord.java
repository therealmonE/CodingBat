package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 10.07.2017.
 *
 * Given an "out" string length 4, such as "<<>>", and a word,
 * return a new string where the word is in the middle of the out string, e.g. "<<word>>".
 * Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
 *
 * makeOutWord("<<>>", "Yay") → "<<Yay>>"
 * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
 * makeOutWord("[[]]", "word") → "[[word]]"
 */

public class makeOutWord extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(makeOutWordSolution("<<>>", "Yay"));
        System.out.println(makeOutWordSolution("<<>>", "WooHoo"));
        System.out.println(makeOutWordSolution("[[]]", "word"));
    }

    public static String makeOutWordSolution (String out, String word) {
       return out.substring(0,2) + word + out.substring(2, 4);
    }
}
