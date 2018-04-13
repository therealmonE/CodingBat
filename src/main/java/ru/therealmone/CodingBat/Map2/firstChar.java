package ru.therealmone.CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class firstChar {

    public static void main(String[] args) {
        System.out.println(firstCharSolution(new String[] {"salt", "tea", "soda", "toast"}));
        System.out.println(firstCharSolution(new String[] {"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(firstCharSolution(new String[] {}));
    }

    public static Map<String, String> firstCharSolution(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < strings.length; i++) {
            char currentChar = strings[i].charAt(0);
            String tmpS = "";

            for (int j = 0; j < strings.length; j++) {
                if (strings[j].charAt(0) == currentChar)
                    tmpS += strings[j];
            }

            map.put(Character.toString(currentChar), tmpS);
        }

        return map;
    }

}
