package ru.therealmone.CodingBat.Warmup1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 09.07.2017.
 *
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 * We are in trouble if they are both smiling or if neither of them is smiling.
 * Return true if we are in trouble.
 *
 * monkeyTrouble(true, true) → true
 * monkeyTrouble(false, false) → true
 * monkeyTrouble(true, false) → false
 */

public class monkeyTrouble extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(monkeyTroubleSolution(true, true));
        System.out.println(monkeyTroubleSolution(false, false));
        System.out.println(monkeyTroubleSolution(true, false));

    }

    public static boolean monkeyTroubleSolution (boolean aSmile, boolean bSmile) {
        return (!aSmile ^ bSmile);
    }
}
