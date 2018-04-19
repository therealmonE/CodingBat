package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 10.07.2017.
 *
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
 * so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
 *
 * lastChars("last", "chars") → "ls"
 * lastChars("yo", "java") → "ya"
 * lastChars("hi", "") → "h@"
 */

public class lastChars extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(lastCharsSolution("last", "chars"));
        System.out.println(lastCharsSolution("yo", "java"));
        System.out.println(lastCharsSolution("hi", ""));
    }

    public static String lastCharsSolution(String a, String b) {
        String result = "";

        if(a.length() != 0)
            result += Character.toString(a.charAt(0));
        else
            result += '@';


        if(b.length() != 0)
            result += Character.toString(b.charAt(b.length() - 1));
        else
            result += '@';

        return result;
    }
}
