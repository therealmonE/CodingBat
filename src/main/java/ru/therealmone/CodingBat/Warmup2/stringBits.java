package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 *
 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 */

public class stringBits extends SolutionClass {

    @Override
    public void showSolution() {
        System.out.println(stringBitsSolution("Hello"));
        System.out.println(stringBitsSolution("Hi"));
        System.out.println(stringBitsSolution("Heeololeo"));
    }

    public static String stringBitsSolution (String s) {
        String newS = "";

        for (int i = 0; i < s.length(); i+=2) {
            newS += s.charAt(i);
        }

        return newS;
    }
}
