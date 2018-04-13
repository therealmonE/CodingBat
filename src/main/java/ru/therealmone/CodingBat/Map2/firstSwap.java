package ru.therealmone.CodingBat.Map2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class firstSwap {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstSwapSolution(new String[]{"ab", "ac"})));
        System.out.println(Arrays.toString(firstSwapSolution(new String[]{"ax", "bx", "cx","cy","by","ay","aaa","azz"})));
        System.out.println(Arrays.toString(firstSwapSolution(new String[]{"ax", "bx", "ay","by","ai","aj","bx","by"})));
    }

    public static String[] firstSwapSolution(String[] strings) {
        Set<Character> swapped = new HashSet<Character>();

        for (int i = 1; i < strings.length; i++) {
            for (int j = 0; j < i; j++) {
                if (strings[i].charAt(0) == strings[j].charAt(0)) {
                    boolean canBeSwapped = true;

                    for (Character take: swapped){
                        if(take == strings[i].charAt(0) || take == strings[j].charAt(0))
                            canBeSwapped = false;
                    }

                    if(canBeSwapped) {
                        swapped.add(strings[i].charAt(0));
                        swapped.add(strings[j].charAt(0));
                        String tmp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = tmp;
                    }
                }


            }
        }

        return strings;

    }
}
