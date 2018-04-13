package Warmup2;

/**
 * Created by monE on 09.07.2017.
 */
public class doubleX {

    public static void main(String[] args) {
        System.out.println(doubleXSolution("axxbb"));
        System.out.println(doubleXSolution("axaxax"));
        System.out.println(doubleXSolution("xxxx"));
    }

    public static boolean doubleXSolution (String s) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == 'x')
                return charArray[i + 1] == 'x';
        }

        return false;
    }

}
