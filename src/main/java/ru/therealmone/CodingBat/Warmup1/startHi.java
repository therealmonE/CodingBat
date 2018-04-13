package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 06.07.2017.
 * Given a string, return true if the string starts with "hi" and false otherwise.
 * startHi("hi there") → true
 * startHi("hi") → true
 * startHi("hello hi") → false
 */
public class startHi {
    public static boolean startHiSolution (String s) {
        return (s.contains("hi") && s.charAt(0) == 'h' && s.charAt(1) == 'i');
    }
}
