package ru.therealmone.CodingBat.Array1;

public class commonEnd {

    public static void main(String[] args) {
        System.out.println(commonEndSolution(new int[] {1,2,3}, new int[] {7,3}));
        System.out.println(commonEndSolution(new int[] {1,2,3}, new int[] {7,3,2}));
        System.out.println(commonEndSolution(new int[] {1,2,3}, new int[] {1,3}));
    }


    public static boolean commonEndSolution (int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}
