package Warmup2;

/**
 * Created by monE on 09.07.2017.
 */
public class frontTimes {

    public static void main(String[] args) {
        System.out.println(frontTimesSolution("Chocolate", 2));
        System.out.println(frontTimesSolution("Chocolate", 3));
        System.out.println(frontTimesSolution("Abc", 3));
    }

    public static String frontTimesSolution (String s, int n) {
        String newS = "";

        if (s.length() < 3) {
            for (int i = 0; i < n; i++) {
                newS += s;
            }
        } else {
            for (int i = 0; i < n; i++) {
                newS += s.substring(0,3);
            }
        }

        return newS;
    }
}
