package String1;

/**
 * Created by monE on 10.07.2017.
 */
public class endSly {

    public static void main(String[] args) {
        System.out.println(endSlySolution("oddly"));
        System.out.println(endSlySolution("y"));
        System.out.println(endSlySolution("oddy"));
    }

    public static boolean endSlySolution(String a) {
        return a.length() >= 2 && a.substring(a.length() - 2, a.length()).equals("ly");
    }

}
