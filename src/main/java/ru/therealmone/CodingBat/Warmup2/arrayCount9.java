package Warmup2;

/**
 * Created by monE on 10.07.2017.
 */
public class arrayCount9 {

    public static void main(String[] args) {
        System.out.println(arrayCount9Solution(new int[] {1, 2, 9}));
        System.out.println(arrayCount9Solution(new int[] {1, 9, 9}));
        System.out.println(arrayCount9Solution(new int[] {1, 9, 9, 3, 9}));
    }

    public static int arrayCount9Solution (int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9)
                count++;
        }

        return count;
    }

}
