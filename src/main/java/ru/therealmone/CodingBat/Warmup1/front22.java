package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 13.04.2018.
 *
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
 * so "kitten" yields "kikittenki".
 * If the string length is less than 2, use whatever chars are there.
 *
 * front22("kitten") → "kikittenki"
 * front22("Ha") → "HaHaHa"
 * front22("abc") → "ababcab"
 */

public class front22 {
    public static String front22Solution(String str) {
        String tmp = "";
        try{
            for (int i = 0; i < 2; i++) {
                tmp += str.charAt(i);
            }
        } catch (Exception e) {}
        return tmp + str + tmp;
    }
}
