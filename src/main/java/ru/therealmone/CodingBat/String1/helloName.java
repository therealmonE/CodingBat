package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
 *
 * helloName("Bob") → "Hello Bob!"
 * helloName("Alice") → "Hello Alice!"
 * helloName("X") → "Hello X!"
 */

public class helloName extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(helloNameSolution("Bob"));
        System.out.println(helloNameSolution("Alive"));
        System.out.println(helloNameSolution("X"));
    }

    public static String helloNameSolution (String name) {
         return "Hello " + name + "!";
    }

}
