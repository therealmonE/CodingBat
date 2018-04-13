package String1;

/**
 * Created by monE on 10.07.2017.
 */
public class firstHalf {

    public static void main(String[] args) {
        System.out.println(firstHalfSolution("WooHoo"));
        System.out.println(firstHalfSolution("HelloThere"));
        System.out.println(firstHalfSolution("abcdef"));
    }

    public static String firstHalfSolution (String a) {
        return a.substring(0, a.length() / 2);
    }

}
