package Warmup2;

/**
 * Created by monE on 09.07.2017.
 */
public class noTriples {

    public static void main(String[] args) {
        System.out.println(noTriplesSolution(new int[] {1, 1, 2, 2, 1}));
        System.out.println(noTriplesSolution(new int[] {1, 1, 2, 2, 2, 1}));
        System.out.println(noTriplesSolution(new int[] {1, 1, 1, 2, 2, 2, 1}));
    }

    public static boolean noTriplesSolution (int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == array[i + 1] && array[i] == array[i + 2])
                return false;
        }
        return true;
    }

}
