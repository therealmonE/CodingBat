package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * Return true if the given string contains between 1 and 3 'e' chars.
 *
 * stringE("Hello") → true
 * stringE("Heelle") → true
 * stringE("Heelele") → false
 */

public class stringE extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(stringESolution("Hello"));
        System.out.println(stringESolution("Heelle"));
        System.out.println(stringESolution("Heelele"));
    }

    public static boolean stringESolution (String s) {
        int eCount = 0;
        char[] charArray = s.toCharArray();

        for (char aCharArray : charArray) {
            if (aCharArray == 'e')
                eCount++;
        }
        return eCount == 3 || eCount == 2 || eCount == 1;
    }

}
