package ru.therealmone.CodingBat.Warmup2;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 15.04.2018.
 *
 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
 * but the "a" can be any char. The "yak" strings will not overlap.
 *
 * stringYak("yakpak") → "pak"
 * stringYak("pakyak") → "pak"
 * stringYak("yak123ya") → "123ya"
 */

public class stringYak extends SolutionClass{
    @Override
    public void showSolution() {
        System.out.println(stringYakSolution("yakpak"));
        System.out.println(stringYakSolution("pakyak"));
        System.out.println(stringYakSolution("yak123ya"));
    }

    public static String stringYakSolution(String str) {
        if(str.contains("yak"))
            str = str.replaceAll("yak", "");
        return str;
    }
}
