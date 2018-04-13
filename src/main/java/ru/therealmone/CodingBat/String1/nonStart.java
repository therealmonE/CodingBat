package String1;

/**
 * Created by monE on 10.07.2017.
 */
public class nonStart {

    public static void main(String[] args) {
        System.out.println(nonStartSolution("Hello", "There"));
        System.out.println(nonStartSolution("java", "code"));
        System.out.println(nonStartSolution("shotl", "java"));
    }

    public static String nonStartSolution (String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

}
