package Warmup2;

/**
 * Created by monE on 09.07.2017.
 */
public class stringBits {

    public static void main(String[] args) {
        System.out.println(stringBitsSolution("Hello"));
        System.out.println(stringBitsSolution("Hi"));
        System.out.println(stringBitsSolution("Heeololeo"));
    }


    public static String stringBitsSolution (String s) {
        String newS = "";

        for (int i = 0; i < s.length(); i+=2) {
            newS += s.charAt(i);
        }

        return newS;
    }
}
