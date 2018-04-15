package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 13.04.2018.
 *
 * Return true if the given string begins with "mix",
 * except the 'm' can be anything, so "pix", "9ix" .. all count.
 *
 * mixStart("mix snacks") → true
 * mixStart("pix snacks") → true
 * mixStart("piz snacks") → false
 */

public class mixStart extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(mixStartSolution("mix snacks"));
        System.out.println(mixStartSolution("pix snacks"));
        System.out.println(mixStartSolution("piz snacks"));
    }

    public static boolean mixStartSolution(String s) {
        return(String.copyValueOf(s.toCharArray(), 1, 2).equals("ix"));
    }
}
