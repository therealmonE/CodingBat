package Warmup2;

/**
 * Created by monE on 10.07.2017.
 */
public class stringMatch {

    public static void main(String[] args) {
        System.out.println(stringMatchSolution("xxcaazz", "xxbaaz"));
        System.out.println(stringMatchSolution("abc", "abc"));
        System.out.println(stringMatchSolution("abc", "axc"));
    }

    public static int stringMatchSolution (String a, String b) {
        int count = 0;
        int minLength;

        if (a.length() < b.length())
            minLength = a.length();
        else
            minLength = b.length();

        for (int i = 0; i < minLength - 1; i++) {
            if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1))
                count++;
        }

        return count;
    }

}
