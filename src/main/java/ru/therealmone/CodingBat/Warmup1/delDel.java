package ru.therealmone.CodingBat.Warmup1;

/**
 * Created by monE on 13.04.2018.
 *
 * Given a string, if the string "del" appears starting at index 1,
 * return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 *
 * delDel("adelbc") → "abc"
 * delDel("adelHello") → "aHello"
 * delDel("adedbc") → "adedbc"
 */

public class delDel {
    public static String delDelSolution (String str) {
            String ret;
            try{
                ret = String.copyValueOf(str.toCharArray(), 1, 3).equals("del") ?
                        str.charAt(0) + String.copyValueOf(str.toCharArray(), 4, str.length() - 4)
                        : str;
            } catch (Exception e) {
                ret = str;
            }
            return ret;
    }
}
