package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 *
 * altPairs("kitten") → "kien"
 * altPairs("Chocolate") → "Chole"
 * altPairs("CodingHorror") → "Congrr"
 */

public class altPairs extends SolutionClass {

    @Override
    public void showSolution() {
        System.out.println(altPairsSolution("Kitten"));
        System.out.println(altPairsSolution("Chocolate"));
        System.out.println(altPairsSolution("CodingHorror"));
    }

    public static String altPairsSolution (String s) {
        String newS = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 4 == 0) {
                newS += s.charAt(i);
                if (i != s.length() - 1)
                    newS += s.charAt(i + 1);
            }
        }

        return newS;
    }

}
