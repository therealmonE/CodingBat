package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 06.07.2017.
 * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 * The value of n will be a valid index of a char in the original string
 * (i.e. n will be in the range 0..str.length()-1 inclusive).
 * missingChar("kitten", 1) → "ktten"
 * missingChar("kitten", 0) → "itten"
 * missingChar("kitten", 4) → "kittn"
 */
public class missingChar {
    public static String missingCharSolution (String s, int index) {
        String newS = "";
        char[] charArray = s.toCharArray();

        newS += String.copyValueOf(charArray, 0, index);
        newS += String.copyValueOf(charArray, index + 1, charArray.length - index - 1);
        return newS;
    }

}
