package ru.therealmone.CodingBat;

import java.util.HashMap;
import java.util.Map;

public abstract class SolutionClass {
    public abstract void showSolution();

    private static Map<String, Object> warmup1 = new HashMap<>();
    private static Map<String, Object> warmup2 = new HashMap<>();

    public static void addToWarmup1(String key, Object object) {
        if(!warmup1.containsKey(key))
            warmup1.put(key, object);
        else
            System.out.println("Warmup1 already has this key");
    }

    public static Object getFromWarmup1(String key) {
        try{
            return warmup1.get(key);
        } catch (Exception e) {
            System.out.println("ERROR: No such object");
            return null;
        }
    }

    public static void addToWarmup2(String key, Object object) {
        if(!warmup2.containsKey(key))
            warmup2.put(key, object);
        else
            System.out.println("Warmup2 already has this key");
    }

    public static Object getFromWarmup2(String key) {
        try{
            return warmup2.get(key);
        } catch (Exception e) {
            System.out.println("ERROR: No such object");
            return null;
        }
    }


}
