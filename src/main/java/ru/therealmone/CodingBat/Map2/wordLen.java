package ru.therealmone.CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class wordLen {

    public static void main(String[] args) {
        System.out.println(WordLenSolution(new String[] {"a", "bb", "a", "bb"}));
        System.out.println(WordLenSolution(new String[] {"this", "and", "that", "and"}));
        System.out.println(WordLenSolution(new String[] {"code", "code", "code", "bug"}));
    }

    public static Map<String, Integer> WordLenSolution(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].length());
        }

        return map;
    }
}
