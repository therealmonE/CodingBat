package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 18.04.2018.
 *
 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
 * The string length will be at least 2.
 *
 * left2("Hello") → "lloHe"
 * left2("java") → "vaja"
 * left2("Hi") → "Hi"
 */

public class left2 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(left2Solution("Hello"));
        System.out.println(left2Solution("java"));
        System.out.println(left2Solution("Hi"));
    }

    public static String left2Solution(String str) {
        String tmp;
        try{
            tmp = str.substring(2,str.length());
        } catch (IndexOutOfBoundsException e) {
            tmp = "";
        }
        return tmp + str.substring(0,2);
    }
}
