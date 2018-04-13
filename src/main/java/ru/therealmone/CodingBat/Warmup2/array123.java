package Warmup2;

/**
 * Created by monE on 09.07.2017.
 */
public class array123 {

    public static void main(String[] args) {
        System.out.println(array123Solution(new int[] {1, 1, 2, 3, 1}));
        System.out.println(array123Solution(new int[] {1, 1, 2, 4, 1}));
        System.out.println(array123Solution(new int[] {1, 1, 2, 1, 2, 3}));
    }

    public static boolean array123Solution (int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == 1 && array[i + 1] == 2 && array[i + 2] == 3)
                return true;
        }
        return false;
    }
}
