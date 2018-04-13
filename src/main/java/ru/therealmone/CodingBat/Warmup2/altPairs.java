package Warmup2;

/**
 * Created by monE on 09.07.2017.
 */
public class altPairs {

    public static void main(String[] args) {
        System.out.println(altPairsSolution("Kitten"));
        System.out.println(altPairsSolution("Chocolate"));
        System.out.println(altPairsSolution("CodingHorror"));
    }

    public static String altPairsSolution (String s) {
        String newS = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 4 == 0) {
                newS += s.charAt(i);
                if (i != s.length() - 1)
                    newS += s.charAt(i + 1);
            }
        }

        return newS;
    }

}
