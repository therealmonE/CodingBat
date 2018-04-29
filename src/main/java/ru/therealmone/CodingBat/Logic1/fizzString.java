package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 27.04.2018.
 *
 * Given a string str, if the string starts with "f" return "Fizz".
 * If the string ends with "b" return "Buzz".
 * If both the "f" and "b" conditions are true, return "FizzBuzz".
 * In all other cases, return the string unchanged. (See also: FizzBuzz Code)
 *
 * fizzString("fig") → "Fizz"
 * fizzString("dib") → "Buzz"
 * fizzString("fib") → "FizzBuzz"
 */

public class fizzString extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(fizzStringSolution("fig"));
        System.out.println(fizzStringSolution("dib"));
        System.out.println(fizzStringSolution("fib"));
    }

    public static String fizzStringSolution(String str) {
        return (
                str.charAt(0) == 'f' ?
                        str.charAt(str.length() - 1) == 'b' ? "FizzBuzz" : "Fizz"
                        : str.charAt(str.length() - 1) == 'b' ? "Buzz" : str
                );
    }
}