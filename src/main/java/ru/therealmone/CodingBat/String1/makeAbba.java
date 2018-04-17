package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 17.04.2018.
 *
 *
 * Given two strings, a and b, return the result of putting them together in the order abba, e.g.
 * "Hi" and "Bye" returns "HiByeByeHi".
 *
 * makeAbba("Hi", "Bye") → "HiByeByeHi"
 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
 * makeAbba("What", "Up") → "WhatUpUpWhat"
 */

public class makeAbba extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(makeAbbaSolution("Hi", "Bye"));
        System.out.println(makeAbbaSolution("Yo", "Alice"));
        System.out.println(makeAbbaSolution("What", "Up"));
    }

    public static String makeAbbaSolution(String a, String b) {
        return a + b + b + a;
    }
}
