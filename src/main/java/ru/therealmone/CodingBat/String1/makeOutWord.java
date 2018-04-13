package String1;

/**
 * Created by monE on 10.07.2017.
 */
public class makeOutWord {

    public static void main(String[] args) {
        System.out.println(makeOutWordSolution("<<>>", "Yay"));
        System.out.println(makeOutWordSolution("<<>>", "WooHoo"));
        System.out.println(makeOutWordSolution("[[]]", "word"));
    }

    public static String makeOutWordSolution (String out, String word) {
       return out.substring(0,2) + word + out.substring(2, 4);
    }

}
