package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 09.07.2017.
 * Return true if the given string contains between 1 and 3 'e' chars.
 * stringE("Hello") → true
 * stringE("Heelle") → true
 * stringE("Heelele") → false
 */
public class stringE {
    public static boolean stringESolution (String s) {
        int eCount = 0;
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'e')
                eCount++;
        }
        return eCount == 3 || eCount == 2 || eCount == 1;
    }

}
