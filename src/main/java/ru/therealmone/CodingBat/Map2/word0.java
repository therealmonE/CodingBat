package ru.therealmone.CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class word0 {

    public static void main(String[] args) {
        System.out.println(Word0Solution(new String[] {"a", "b", "a", "b"}));
        System.out.println(Word0Solution(new String[] {"a", "b", "a", "c", "b"}));
        System.out.println(Word0Solution(new String[] {"c", "b", "a"}));
    }

    public static Map<String, Integer> Word0Solution(String[] strings){
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);
        }

        return map;
    }

}
