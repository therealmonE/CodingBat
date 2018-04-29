package ru.therealmone.CodingBat.Logic1;

import ru.therealmone.CodingBat.SolutionClass;

/**
 * Created by monE on 28.04.2018.
 *
 * Your cell phone rings.
 * Return true if you should answer it.
 * Normally you answer, except in the morning you only answer if it is your mom calling.
 * In all cases, if you are asleep, you do not answer.
 *
 * answerCell(false, false, false) → true
 * answerCell(false, false, true) → false
 * answerCell(true, false, false) → false
 */

public class answerCell extends SolutionClass {
    @Override
    public void showSolution() {
        System.out.println(answerCellSolution(false, false, false));
        System.out.println(answerCellSolution(false, false, true));
        System.out.println(answerCellSolution(true, false, false));
    }

    public static boolean answerCellSolution(boolean isMorning, boolean isMom, boolean isAsleep) {
        return ((isMorning && isMom || !isMorning && !isMom) && !isAsleep);
    }
}
