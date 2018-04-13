package Warmup2;

/**
 * Created by monE on 09.07.2017.
 */
public class stringTimes {

    public static void main(String[] args) {
        System.out.println(stringTimesSolution("Hi", 2));
        System.out.println(stringTimesSolution("Hi", 3));
        System.out.println(stringTimesSolution("Hi", 1));
    }

    public static String stringTimesSolution (String s, int n) {
        String newS = "";

        for (int i = 0; i < n; i++) {
            newS += s;
        }

        return newS;
    }

}
