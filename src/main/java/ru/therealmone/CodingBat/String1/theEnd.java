package String1;

/**
 * Created by monE on 10.07.2017.
 */
public class theEnd {

    public static void main(String[] args) {
        System.out.println(theEndSoluion("Hello", true));
        System.out.println(theEndSoluion("Hello", false));
        System.out.println(theEndSoluion("oh", true));
    }

    public static String theEndSoluion (String a, boolean front) {
        if (front)
            return Character.toString(a.charAt(0));
        else
            return Character.toString(a.charAt(a.length() - 1));
    }

}
