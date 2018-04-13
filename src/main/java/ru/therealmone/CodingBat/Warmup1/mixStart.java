package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 13.04.2018.
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 * mixStart("mix snacks") → true
 * mixStart("pix snacks") → true
 * mixStart("piz snacks") → false
 */

public class mixStart {
    public static boolean mixStartSolution(String s) {
        return(String.copyValueOf(s.toCharArray(), 1, 2).equals("ix"));
    }
}
