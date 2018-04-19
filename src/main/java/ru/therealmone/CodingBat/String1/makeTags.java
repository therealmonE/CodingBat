package ru.therealmone.CodingBat.String1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 19.04.2018.
 *
 *
 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
 * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
 * Given tag and word strings, create the HTML string with tags around the word,
 * e.g. "<i>Yay</i>".
 *
 * makeTags("i", "Yay") → "<i>Yay</i>"
 * makeTags("i", "Hello") → "<i>Hello</i>"
 * makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */

public class makeTags extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(makeTagsSolution("i", "Yay"));
        System.out.println(makeTagsSolution("i", "Hello"));
        System.out.println(makeTagsSolution("cite", "Yay"));
    }

    public static String makeTagsSolution(String tag, String str) {
        return "<" + tag + ">" + str + "</" + tag + ">";
    }
}
