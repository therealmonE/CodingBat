package ru.therealmone.CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class wordMultiple {

    public static void main(String[] args) {
        System.out.println(wordMultipleSolution(new String[] {"a", "b", "a", "c", "b"}));
        System.out.println(wordMultipleSolution(new String[] {"c", "b", "a"}));
        System.out.println(wordMultipleSolution(new String[] {"c", "c", "c", "c"}));
    }

    public static Map<String, Boolean> wordMultipleSolution(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();

        for (int i = 0; i < strings.length; i++) {
            boolean multiple = false;

            for (int j = 0; j < strings.length; j++) {
                if(i != j)
                    if(strings[i].equals(strings[j])) {
                        multiple = true;
                        break;
                    }
            }

            map.put(strings[i], multiple);

        }

        return map;
    }

}
