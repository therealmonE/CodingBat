package ru.therealmone.CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class pairs {

    public static void main(String[] args) {
        System.out.println(ParisSolution(new String[] {"code", "bug"}));
        System.out.println(ParisSolution(new String[] {"man", "moon", "main"}));
        System.out.println(ParisSolution(new String[] {"man", "moon", "good", "night"}));
    }

    public static Map<String, String> ParisSolution(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < strings.length; i++) {
            map.put(Character.toString(strings[i].charAt(0)), Character.toString(strings[i].charAt(strings[i].length() - 1)));
        }

        return map;
    }
}
