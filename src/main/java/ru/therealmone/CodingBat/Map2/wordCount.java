package ru.therealmone.CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class wordCount {

    public static void main(String[] args) {
        System.out.println(WordCountSolution(new String[] {"a", "b", "a", "c", "b"}));
        System.out.println(WordCountSolution(new String[] {"c", "b", "a"}));
        System.out.println(WordCountSolution(new String[] {"c", "c", "c", "c"}));
    }

    public static Map<String, Integer> WordCountSolution(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            int count = 0;

            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j]))
                    count++;
            }

            map.put(strings[i], count);
        }

        return map;
    }
}
