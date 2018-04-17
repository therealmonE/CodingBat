package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 10.07.2017.
 *
 * Given a string, if the string begins with "red" or "blue" return that color string,
 * otherwise return the empty string.
 *
 * seeColor("redxx") → "red"
 * seeColor("xxred") → ""
 * seeColor("blueTimes") → "blue"
 */

public class seeColor extends SolutionClass {
    @Override
    public void showSolution() {

    }

    public String seeColorSolution(String str) {
        if(str.contains("red") || str.contains("blue")) {
            if(str.indexOf("red") == 0)
                return "red";

            if(str.indexOf("blue") == 0)
                return "blue";
        }
        return "";
    }
}
