package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 13.04.2018.
 *
 * Given a string, return a string made of the first 2 chars (if present),
 * however include first char only if it is 'o' and include the second only if it is 'z',
 * so "ozymandias" yields "oz".
 *
 * startOz("ozymandias") → "oz"
 * startOz("bzoo") → "z"
 * startOz("oxx") → "o"
 */

public class startOz {
    public static String startOzSolution(String str) {
        String ret = "";
        try {
            if(Character.toLowerCase(str.charAt(0)) == 'o')
                ret += 'o';
            if(Character.toLowerCase(str.charAt(1)) == 'z')
                ret += 'z';
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ret;
    }
}
