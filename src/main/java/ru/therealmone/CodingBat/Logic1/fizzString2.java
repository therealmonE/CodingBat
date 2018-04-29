package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 28.04.2018.
 *
 * Given an int n, return the string form of the number followed by "!".
 * So the int 6 yields "6!".
 * Except if the number is divisible by 3 use "Fizz" instead of the number,
 * and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
 * Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
 * What will the remainder be when one number divides evenly into another?
 * (See also: FizzBuzz Code and Introduction to Mod)
 *
 * fizzString2(1) → "1!"
 * fizzString2(2) → "2!"
 * fizzString2(3) → "Fizz!"
 */

public class fizzString2 extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(fizzString2Solution(1));
        System.out.println(fizzString2Solution(2));
        System.out.println(fizzString2Solution(3));
    }

    public static String fizzString2Solution(int n) {
        return (
                n % 3 == 0 ?
                        n % 5 == 0 ? "FizzBuzz!" : "Fizz!"
                        : n % 5 == 0 ? "Buzz!" : n + "!"
                );
    }
}
